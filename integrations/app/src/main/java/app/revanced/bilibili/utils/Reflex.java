package app.revanced.bilibili.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * copy from de.robv.android.xposed.XposedHelpers.
 */
public class Reflex {
    private Reflex() {
        throw new AssertionError("no instance for you!");
    }

    private static final ConcurrentHashMap<MemberCacheKey.Field, Optional<Field>> fieldCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<MemberCacheKey.Method, Optional<Method>> methodCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<MemberCacheKey.Constructor, Optional<Constructor<?>>> constructorCache = new ConcurrentHashMap<>();

    /**
     * Note that we use object key instead of string here, because string calculation will lose all
     * the benefits of 'HashMap', this is basically the solution of performance traps.
     * <p>
     * So in fact we only need to use the structural comparison results of the reflection object.
     *
     * @see <a href="https://github.com/RinOrz/LSPosed/blob/a44e1f1cdf0c5e5ebfaface828e5907f5425df1b/benchmark/src/result/ReflectionCacheBenchmark.json">benchmarks for ART</a>
     * @see <a href="https://github.com/meowool-catnip/cloak/blob/main/api/src/benchmark/kotlin/com/meowool/cloak/ReflectionObjectAccessTests.kt#L37-L65">benchmarks for JVM</a>
     */
    private abstract static class MemberCacheKey {
        private final int hash;

        protected MemberCacheKey(int hash) {
            this.hash = hash;
        }

        @Override
        public abstract boolean equals(@Nullable Object obj);

        @Override
        public final int hashCode() {
            return hash;
        }

        static final class Constructor extends MemberCacheKey {
            private final Class<?> clazz;
            private final Class<?>[] parameters;
            private final boolean isExact;

            public Constructor(Class<?> clazz, Class<?>[] parameters, boolean isExact) {
                super(31 * Objects.hash(clazz, isExact) + Arrays.hashCode(parameters));
                this.clazz = clazz;
                this.parameters = parameters;
                this.isExact = isExact;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Constructor)) return false;
                Constructor that = (Constructor) o;
                return isExact == that.isExact && Objects.equals(clazz, that.clazz) && Arrays.equals(parameters, that.parameters);
            }

            @NonNull
            @Override
            public String toString() {
                var str = clazz.getName() + getParametersString(parameters);
                if (isExact) {
                    return str + "#exact";
                } else {
                    return str;
                }
            }
        }

        static final class Field extends MemberCacheKey {
            private final Class<?> clazz;
            private final String name;
            private final boolean isType;

            public Field(Class<?> clazz, String name, boolean isType) {
                super(Objects.hash(clazz, name, isType));
                this.clazz = clazz;
                this.name = name;
                this.isType = isType;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Field)) return false;
                Field field = (Field) o;
                return isType == field.isType && Objects.equals(clazz, field.clazz) && Objects.equals(name, field.name);
            }

            @NonNull
            @Override
            public String toString() {
                var str = clazz.getName() + "#" + name;
                if (isType) {
                    return str + "#type";
                } else {
                    return str;
                }
            }
        }

        static final class Method extends MemberCacheKey {
            private final Class<?> clazz;
            private final String name;
            private final Class<?>[] parameters;
            private final boolean isExact;

            public Method(Class<?> clazz, String name, Class<?>[] parameters, boolean isExact) {
                super(31 * Objects.hash(clazz, name, isExact) + Arrays.hashCode(parameters));
                this.clazz = clazz;
                this.name = name;
                this.parameters = parameters;
                this.isExact = isExact;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Method)) return false;
                Method method = (Method) o;
                return isExact == method.isExact && Objects.equals(clazz, method.clazz) && Objects.equals(name, method.name) && Arrays.equals(parameters, method.parameters);
            }

            @NonNull
            @Override
            public String toString() {
                var str = clazz.getName() + '#' + name + getParametersString(parameters);
                if (isExact) {
                    return str + "#exact";
                } else {
                    return str;
                }
            }
        }
    }

    /**
     * Thrown when a class loader is unable to find a class. Unlike {@link ClassNotFoundException},
     * callers are not forced to explicitly catch this. If uncaught, the error will be passed to the
     * next caller in the stack.
     */
    public static final class ClassNotFoundError extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        /**
         * @hide
         */
        public ClassNotFoundError(Throwable cause) {
            super(cause);
        }

        /**
         * @hide
         */
        public ClassNotFoundError(String detailMessage, Throwable cause) {
            super(detailMessage, cause);
        }
    }

    static String getParametersString(Class<?>... clazzes) {
        StringBuilder sb = new StringBuilder("(");
        boolean first = true;
        for (Class<?> clazz : clazzes) {
            if (first)
                first = false;
            else
                sb.append(",");

            if (clazz != null)
                sb.append(clazz.getCanonicalName());
            else
                sb.append("null");
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * Look up a class with the specified class loader.
     *
     * <p>There are various allowed syntaxes for the class name, but it's recommended to use one of
     * these:
     * <ul>
     *   <li>{@code java.lang.String}
     *   <li>{@code java.lang.String[]} (array)
     *   <li>{@code android.app.ActivityThread.ResourcesKey}
     *   <li>{@code android.app.ActivityThread$ResourcesKey}
     * </ul>
     *
     * @param className   The class name in one of the formats mentioned above.
     * @param classLoader The class loader, or {@code null} for the boot class loader.
     * @return A reference to the class.
     * @throws ClassNotFoundError In case the class was not found.
     */
    public static Class<?> findClass(String className, ClassLoader classLoader) {
        if (classLoader == null)
            classLoader = Reflex.class.getClassLoader();
        try {
            return ClassUtils.getClass(classLoader, className, false);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundError(e);
        }
    }

    /**
     * Look up and return a class if it exists.
     * Like {@link #findClass}, but doesn't throw an exception if the class doesn't exist.
     *
     * @param className   The class name.
     * @param classLoader The class loader, or {@code null} for the boot class loader.
     * @return A reference to the class, or {@code null} if it doesn't exist.
     */
    public static Class<?> findClassIfExists(String className, ClassLoader classLoader) {
        try {
            return findClass(className, classLoader);
        } catch (ClassNotFoundError e) {
            return null;
        }
    }

    /**
     * Look up a field in a class and set it to accessible.
     *
     * @param clazz     The class which either declares or inherits the field.
     * @param fieldName The field name.
     * @return A reference to the field.
     * @throws NoSuchFieldError In case the field was not found.
     */
    public static Field findField(Class<?> clazz, String fieldName) throws NoSuchFieldError {
        var key = new MemberCacheKey.Field(clazz, fieldName, false);

        return fieldCache.computeIfAbsent(key, k -> {
            try {
                Field newField = findFieldRecursiveImpl(k.clazz, k.name);
                if (!newField.isAccessible())
                    newField.setAccessible(true);
                return Optional.of(newField);
            } catch (NoSuchFieldException e) {
                return Optional.empty();
            }
        }).orElseThrow(() -> new NoSuchFieldError(key.toString()));
    }

    /**
     * Look up and return a field if it exists.
     * Like {@link #findField}, but doesn't throw an exception if the field doesn't exist.
     *
     * @param clazz     The class which either declares or inherits the field.
     * @param fieldName The field name.
     * @return A reference to the field, or {@code null} if it doesn't exist.
     */
    public static Field findFieldIfExists(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName);
        } catch (NoSuchFieldError e) {
            return null;
        }
    }

    private static Field findFieldRecursiveImpl(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            while (true) {
                clazz = clazz.getSuperclass();
                if (clazz == null || clazz.equals(Object.class))
                    break;

                try {
                    return clazz.getDeclaredField(fieldName);
                } catch (NoSuchFieldException ignored) {
                }
            }
            throw e;
        }
    }

    /**
     * Returns the first field of the given type in a class.
     * Might be useful for Proguard'ed classes to identify fields with unique types.
     *
     * @param clazz The class which either declares or inherits the field.
     * @param type  The type of the field.
     * @return A reference to the first field of the given type.
     * @throws NoSuchFieldError In case no matching field was not found.
     */
    public static Field findFirstFieldByExactType(Class<?> clazz, Class<?> type) {
        var key = new MemberCacheKey.Field(clazz, type.getName(), true);
        return fieldCache.computeIfAbsent(key, k -> {
            Class<?> clz = clazz;
            do {
                for (Field field : clz.getDeclaredFields()) {
                    if (field.getType() == type) {
                        if (!field.isAccessible())
                            field.setAccessible(true);
                        return Optional.of(field);
                    }
                }
            } while ((clz = clz.getSuperclass()) != null);
            return Optional.empty();
        }).orElseThrow(() -> new NoSuchFieldError(key.toString()));
    }

    public static Field findFirstFieldByExactTypeOrNull(Class<?> clazz, Class<?> type) {
        try {
            return findFirstFieldByExactType(clazz, type);
        } catch (NoSuchFieldError e) {
            return null;
        }
    }

    /**
     * Look up a method in a class and set it to accessible.
     * See {@link #findMethodExact(String, ClassLoader, String, Object...)} for details.
     */
    public static Method findMethodExact(Class<?> clazz, String methodName, Object... parameterTypes) {
        return findMethodExact(clazz, methodName, getParameterClasses(clazz.getClassLoader(), parameterTypes));
    }

    /**
     * Look up and return a method if it exists.
     * See {@link #findMethodExactIfExists(String, ClassLoader, String, Object...)} for details.
     */
    public static Method findMethodExactIfExists(Class<?> clazz, String methodName, Object... parameterTypes) {
        try {
            return findMethodExact(clazz, methodName, parameterTypes);
        } catch (ClassNotFoundError | NoSuchMethodError e) {
            return null;
        }
    }

    /**
     * Look up a method in a class and set it to accessible.
     * The method must be declared or overridden in the given class.
     *
     * @param className      The name of the class which implements the method.
     * @param classLoader    The class loader for resolving the target and parameter classes.
     * @param methodName     The target method name.
     * @param parameterTypes The parameter types of the target method.
     * @return A reference to the method.
     * @throws NoSuchMethodError  In case the method was not found.
     * @throws ClassNotFoundError In case the target class or one of the parameter types couldn't be resolved.
     */
    public static Method findMethodExact(String className, ClassLoader classLoader, String methodName, Object... parameterTypes) {
        return findMethodExact(findClass(className, classLoader), methodName, getParameterClasses(classLoader, parameterTypes));
    }

    /**
     * Look up and return a method if it exists.
     * Like {@link #findMethodExact(String, ClassLoader, String, Object...)}, but doesn't throw an
     * exception if the method doesn't exist.
     *
     * @param className      The name of the class which implements the method.
     * @param classLoader    The class loader for resolving the target and parameter classes.
     * @param methodName     The target method name.
     * @param parameterTypes The parameter types of the target method.
     * @return A reference to the method, or {@code null} if it doesn't exist.
     */
    public static Method findMethodExactIfExists(String className, ClassLoader classLoader, String methodName, Object... parameterTypes) {
        try {
            return findMethodExact(className, classLoader, methodName, parameterTypes);
        } catch (ClassNotFoundError | NoSuchMethodError e) {
            return null;
        }
    }

    /**
     * Look up a method in a class and set it to accessible.
     * See {@link #findMethodExact(String, ClassLoader, String, Object...)} for details.
     *
     * <p>This variant requires that you already have reference to all the parameter types.
     */
    public static Method findMethodExact(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        var key = new MemberCacheKey.Method(clazz, methodName, parameterTypes, true);

        return methodCache.computeIfAbsent(key, k -> {
            try {
                Method method = k.clazz.getDeclaredMethod(k.name, k.parameters);
                if (!method.isAccessible())
                    method.setAccessible(true);
                return Optional.of(method);
            } catch (NoSuchMethodException e) {
                return Optional.empty();
            }
        }).orElseThrow(() -> new NoSuchMethodError(key.toString()));
    }

    /**
     * Returns an array of all methods declared/overridden in a class with the specified parameter types.
     *
     * <p>The return type is optional, it will not be compared if it is {@code null}.
     * Use {@code void.class} if you want to search for methods returning nothing.
     *
     * @param clazz          The class to look in.
     * @param returnType     The return type, or {@code null} (see above).
     * @param parameterTypes The parameter types.
     * @return An array with matching methods, all set to accessible already.
     */
    public static Method[] findMethodsByExactParameters(Class<?> clazz, Class<?> returnType, Class<?>... parameterTypes) {
        List<Method> result = new LinkedList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (returnType != null && returnType != method.getReturnType())
                continue;

            Class<?>[] methodParameterTypes = method.getParameterTypes();
            if (parameterTypes.length != methodParameterTypes.length)
                continue;

            boolean match = true;
            for (int i = 0; i < parameterTypes.length; i++) {
                if (parameterTypes[i] != methodParameterTypes[i]) {
                    match = false;
                    break;
                }
            }

            if (!match)
                continue;

            if (!method.isAccessible())
                method.setAccessible(true);
            result.add(method);
        }
        return result.toArray(new Method[result.size()]);
    }

    /**
     * Look up a method in a class and set it to accessible.
     *
     * <p>This does'nt only look for exact matches, but for the best match. All considered candidates
     * must be compatible with the given parameter types, i.e. the parameters must be assignable
     * to the method's formal parameters. Inherited methods are considered here.
     *
     * @param clazz          The class which declares, inherits or overrides the method.
     * @param methodName     The method name.
     * @param parameterTypes The types of the method's parameters.
     * @return A reference to the best-matching method.
     * @throws NoSuchMethodError In case no suitable method was found.
     */
    public static Method findMethodBestMatch(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        // find the exact matching method first
        try {
            return findMethodExact(clazz, methodName, parameterTypes);
        } catch (NoSuchMethodError ignored) {
        }

        // then find the best match
        var key = new MemberCacheKey.Method(clazz, methodName, parameterTypes, false);

        return methodCache.computeIfAbsent(key, k -> {
            Method bestMatch = null;
            Class<?> clz = k.clazz;
            boolean considerPrivateMethods = true;
            do {
                for (Method method : clz.getDeclaredMethods()) {
                    // don't consider private methods of superclasses
                    if (!considerPrivateMethods && Modifier.isPrivate(method.getModifiers()))
                        continue;

                    // compare name and parameters
                    if (method.getName().equals(k.name) && ClassUtils.isAssignable(
                            k.parameters,
                            method.getParameterTypes(),
                            true)) {
                        // get accessible version of method
                        if (bestMatch == null || MemberUtils.compareMethodFit(
                                method,
                                bestMatch,
                                k.parameters) < 0) {
                            bestMatch = method;
                        }
                    }
                }
                considerPrivateMethods = false;
            } while ((clz = clz.getSuperclass()) != null);

            if (bestMatch != null) {
                if (!bestMatch.isAccessible())
                    bestMatch.setAccessible(true);
                return Optional.of(bestMatch);
            } else {
                return Optional.empty();
            }
        }).orElseThrow(() -> new NoSuchMethodError(key.toString()));
    }

    /**
     * Look up a method in a class and set it to accessible.
     *
     * <p>See {@link #findMethodBestMatch(Class, String, Class...)} for details. This variant
     * determines the parameter types from the classes of the given objects.
     */
    public static Method findMethodBestMatch(Class<?> clazz, String methodName, Object... args) {
        return findMethodBestMatch(clazz, methodName, getParameterTypes(args));
    }

    /**
     * Look up a method in a class and set it to accessible.
     *
     * <p>See {@link #findMethodBestMatch(Class, String, Class...)} for details. This variant
     * determines the parameter types from the classes of the given objects. For any item that is
     * {@code null}, the type is taken from {@code parameterTypes} instead.
     */
    public static Method findMethodBestMatch(Class<?> clazz, String methodName, Class<?>[] parameterTypes, Object[] args) {
        Class<?>[] argsClasses = null;
        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i] != null)
                continue;
            if (argsClasses == null)
                argsClasses = getParameterTypes(args);
            parameterTypes[i] = argsClasses[i];
        }
        return findMethodBestMatch(clazz, methodName, parameterTypes);
    }

    /**
     * Returns an array with the classes of the given objects.
     */
    public static Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] clazzes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            clazzes[i] = (args[i] != null) ? args[i].getClass() : null;
        }
        return clazzes;
    }

    /**
     * Retrieve classes from an array, where each element might either be a Class
     * already, or a String with the full class name.
     */
    private static Class<?>[] getParameterClasses(ClassLoader classLoader, Object[] parameterTypesAndCallback) {
        Class<?>[] parameterClasses = null;
        for (int i = parameterTypesAndCallback.length - 1; i >= 0; i--) {
            Object type = parameterTypesAndCallback[i];
            if (type == null)
                throw new ClassNotFoundError("parameter type must not be null", null);

            if (parameterClasses == null)
                parameterClasses = new Class<?>[i + 1];

            if (type instanceof Class)
                parameterClasses[i] = (Class<?>) type;
            else if (type instanceof String)
                parameterClasses[i] = findClass((String) type, classLoader);
            else
                throw new ClassNotFoundError("parameter type must either be specified as Class or String", null);
        }

        // if there are no arguments for the method
        if (parameterClasses == null)
            parameterClasses = new Class<?>[0];

        return parameterClasses;
    }

    /**
     * Look up a constructor of a class and set it to accessible.
     * See {@link #findMethodExact(String, ClassLoader, String, Object...)} for details.
     */
    public static Constructor<?> findConstructorExact(Class<?> clazz, Object... parameterTypes) {
        return findConstructorExact(clazz, getParameterClasses(clazz.getClassLoader(), parameterTypes));
    }

    /**
     * Look up and return a constructor if it exists.
     * See {@link #findMethodExactIfExists(String, ClassLoader, String, Object...)} for details.
     */
    public static Constructor<?> findConstructorExactIfExists(Class<?> clazz, Object... parameterTypes) {
        try {
            return findConstructorExact(clazz, parameterTypes);
        } catch (ClassNotFoundError | NoSuchMethodError e) {
            return null;
        }
    }

    /**
     * Look up a constructor of a class and set it to accessible.
     * See {@link #findMethodExact(String, ClassLoader, String, Object...)} for details.
     */
    public static Constructor<?> findConstructorExact(String className, ClassLoader classLoader, Object... parameterTypes) {
        return findConstructorExact(findClass(className, classLoader), getParameterClasses(classLoader, parameterTypes));
    }

    /**
     * Look up and return a constructor if it exists.
     * See {@link #findMethodExactIfExists(String, ClassLoader, String, Object...)} for details.
     */
    public static Constructor<?> findConstructorExactIfExists(String className, ClassLoader classLoader, Object... parameterTypes) {
        try {
            return findConstructorExact(className, classLoader, parameterTypes);
        } catch (ClassNotFoundError | NoSuchMethodError e) {
            return null;
        }
    }

    /**
     * Look up a constructor of a class and set it to accessible.
     * See {@link #findMethodExact(String, ClassLoader, String, Object...)} for details.
     */
    public static Constructor<?> findConstructorExact(Class<?> clazz, Class<?>... parameterTypes) {
        var key = new MemberCacheKey.Constructor(clazz, parameterTypes, true);

        return constructorCache.computeIfAbsent(key, k -> {
            try {
                Constructor<?> constructor = k.clazz.getDeclaredConstructor(k.parameters);
                if (!constructor.isAccessible())
                    constructor.setAccessible(true);
                return Optional.of(constructor);
            } catch (NoSuchMethodException e) {
                return Optional.empty();
            }
        }).orElseThrow(() -> new NoSuchMethodError(key.toString()));
    }

    /**
     * Look up a constructor in a class and set it to accessible.
     *
     * <p>See {@link #findMethodBestMatch(Class, String, Class...)} for details.
     */
    public static Constructor<?> findConstructorBestMatch(Class<?> clazz, Class<?>... parameterTypes) {
        // find the exact matching constructor first
        try {
            return findConstructorExact(clazz, parameterTypes);
        } catch (NoSuchMethodError ignored) {
        }

        // then find the best match
        var key = new MemberCacheKey.Constructor(clazz, parameterTypes, false);

        return constructorCache.computeIfAbsent(key, k -> {
            Constructor<?> bestMatch = null;
            Constructor<?>[] constructors = k.clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                // compare name and parameters
                if (ClassUtils.isAssignable(
                        k.parameters,
                        constructor.getParameterTypes(),
                        true)) {
                    // get accessible version of method
                    if (bestMatch == null || MemberUtils.compareConstructorFit(
                            constructor,
                            bestMatch,
                            k.parameters) < 0) {
                        bestMatch = constructor;
                    }
                }
            }

            if (bestMatch != null) {
                if (!bestMatch.isAccessible())
                    bestMatch.setAccessible(true);
                return Optional.of(bestMatch);
            } else {
                return Optional.empty();
            }
        }).orElseThrow(() -> new NoSuchMethodError(key.toString()));
    }

    /**
     * Look up a constructor in a class and set it to accessible.
     *
     * <p>See {@link #findMethodBestMatch(Class, String, Class...)} for details. This variant
     * determines the parameter types from the classes of the given objects.
     */
    public static Constructor<?> findConstructorBestMatch(Class<?> clazz, Object... args) {
        return findConstructorBestMatch(clazz, getParameterTypes(args));
    }

    /**
     * Look up a constructor in a class and set it to accessible.
     *
     * <p>See {@link #findMethodBestMatch(Class, String, Class...)} for details. This variant
     * determines the parameter types from the classes of the given objects. For any item that is
     * {@code null}, the type is taken from {@code parameterTypes} instead.
     */
    public static Constructor<?> findConstructorBestMatch(Class<?> clazz, Class<?>[] parameterTypes, Object[] args) {
        Class<?>[] argsClasses = null;
        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i] != null)
                continue;
            if (argsClasses == null)
                argsClasses = getParameterTypes(args);
            parameterTypes[i] = argsClasses[i];
        }
        return findConstructorBestMatch(clazz, parameterTypes);
    }

    //#################################################################################################

    /**
     * Sets the value of an object field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setObjectField(Object obj, String fieldName, Object value) {
        try {
            findField(obj.getClass(), fieldName).set(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a {@code boolean} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setBooleanField(Object obj, String fieldName, boolean value) {
        try {
            findField(obj.getClass(), fieldName).setBoolean(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a {@code byte} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setByteField(Object obj, String fieldName, byte value) {
        try {
            findField(obj.getClass(), fieldName).setByte(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a {@code char} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setCharField(Object obj, String fieldName, char value) {
        try {
            findField(obj.getClass(), fieldName).setChar(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a {@code double} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setDoubleField(Object obj, String fieldName, double value) {
        try {
            findField(obj.getClass(), fieldName).setDouble(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a {@code float} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setFloatField(Object obj, String fieldName, float value) {
        try {
            findField(obj.getClass(), fieldName).setFloat(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of an {@code int} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setIntField(Object obj, String fieldName, int value) {
        try {
            findField(obj.getClass(), fieldName).setInt(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a {@code long} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setLongField(Object obj, String fieldName, long value) {
        try {
            findField(obj.getClass(), fieldName).setLong(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a {@code short} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static void setShortField(Object obj, String fieldName, short value) {
        try {
            findField(obj.getClass(), fieldName).setShort(obj, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    //#################################################################################################

    /**
     * Returns the value of an object field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static <T> T getObjectField(Object obj, String fieldName) {
        try {
            return (T) findField(obj.getClass(), fieldName).get(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * For inner classes, returns the surrounding instance, i.e. the {@code this} reference of the surrounding class.
     */
    public static Object getSurroundingThis(Object obj) {
        return getObjectField(obj, "this$0");
    }

    /**
     * Returns the value of a {@code boolean} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static boolean getBooleanField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getBoolean(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of a {@code byte} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static byte getByteField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getByte(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of a {@code char} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static char getCharField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getChar(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of a {@code double} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static double getDoubleField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getDouble(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of a {@code float} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static float getFloatField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getFloat(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of an {@code int} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static int getIntField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getInt(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of a {@code long} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static long getLongField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getLong(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of a {@code short} field in the given object instance. A class reference is not sufficient! See also {@link #findField}.
     */
    public static short getShortField(Object obj, String fieldName) {
        try {
            return findField(obj.getClass(), fieldName).getShort(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    //#################################################################################################

    /**
     * Sets the value of a static object field in the given class. See also {@link #findField}.
     */
    public static void setStaticObjectField(Class<?> clazz, String fieldName, Object value) {
        try {
            findField(clazz, fieldName).set(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code boolean} field in the given class. See also {@link #findField}.
     */
    public static void setStaticBooleanField(Class<?> clazz, String fieldName, boolean value) {
        try {
            findField(clazz, fieldName).setBoolean(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code byte} field in the given class. See also {@link #findField}.
     */
    public static void setStaticByteField(Class<?> clazz, String fieldName, byte value) {
        try {
            findField(clazz, fieldName).setByte(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code char} field in the given class. See also {@link #findField}.
     */
    public static void setStaticCharField(Class<?> clazz, String fieldName, char value) {
        try {
            findField(clazz, fieldName).setChar(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code double} field in the given class. See also {@link #findField}.
     */
    public static void setStaticDoubleField(Class<?> clazz, String fieldName, double value) {
        try {
            findField(clazz, fieldName).setDouble(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code float} field in the given class. See also {@link #findField}.
     */
    public static void setStaticFloatField(Class<?> clazz, String fieldName, float value) {
        try {
            findField(clazz, fieldName).setFloat(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code int} field in the given class. See also {@link #findField}.
     */
    public static void setStaticIntField(Class<?> clazz, String fieldName, int value) {
        try {
            findField(clazz, fieldName).setInt(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code long} field in the given class. See also {@link #findField}.
     */
    public static void setStaticLongField(Class<?> clazz, String fieldName, long value) {
        try {
            findField(clazz, fieldName).setLong(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code short} field in the given class. See also {@link #findField}.
     */
    public static void setStaticShortField(Class<?> clazz, String fieldName, short value) {
        try {
            findField(clazz, fieldName).setShort(null, value);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    //#################################################################################################

    /**
     * Returns the value of a static object field in the given class. See also {@link #findField}.
     */
    public static <T> T getStaticObjectField(Class<?> clazz, String fieldName) {
        try {
            return (T) findField(clazz, fieldName).get(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Returns the value of a static {@code boolean} field in the given class. See also {@link #findField}.
     */
    public static boolean getStaticBooleanField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getBoolean(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code byte} field in the given class. See also {@link #findField}.
     */
    public static byte getStaticByteField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getByte(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code char} field in the given class. See also {@link #findField}.
     */
    public static char getStaticCharField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getChar(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code double} field in the given class. See also {@link #findField}.
     */
    public static double getStaticDoubleField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getDouble(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code float} field in the given class. See also {@link #findField}.
     */
    public static float getStaticFloatField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getFloat(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code int} field in the given class. See also {@link #findField}.
     */
    public static int getStaticIntField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getInt(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code long} field in the given class. See also {@link #findField}.
     */
    public static long getStaticLongField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getLong(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * Sets the value of a static {@code short} field in the given class. See also {@link #findField}.
     */
    public static short getStaticShortField(Class<?> clazz, String fieldName) {
        try {
            return findField(clazz, fieldName).getShort(null);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    //#################################################################################################

    /**
     * Calls an instance or static method of the given object.
     * The method is resolved using {@link #findMethodBestMatch(Class, String, Object...)}.
     *
     * @param obj        The object instance. A class reference is not sufficient!
     * @param methodName The method name.
     * @param args       The arguments for the method call.
     * @throws NoSuchMethodError     In case no suitable method was found.
     * @throws InvocationTargetError In case an exception was thrown by the invoked method.
     */
    public static <T> T callMethod(Object obj, String methodName, Object... args) {
        try {
            return (T) findMethodBestMatch(obj.getClass(), methodName, args).invoke(obj, args);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (InvocationTargetException e) {
            throw new InvocationTargetError(e.getCause());
        }
    }

    /**
     * Calls an instance or static method of the given object.
     * See {@link #callMethod(Object, String, Object...)}.
     *
     * <p>This variant allows you to specify parameter types, which can help in case there are multiple
     * methods with the same name, especially if you call it with {@code null} parameters.
     */
    public static <T> T callMethod(Object obj, String methodName, Class<?>[] parameterTypes, Object... args) {
        try {
            return (T) findMethodBestMatch(obj.getClass(), methodName, parameterTypes, args).invoke(obj, args);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (InvocationTargetException e) {
            throw new InvocationTargetError(e.getCause());
        }
    }

    /**
     * Calls a static method of the given class.
     * The method is resolved using {@link #findMethodBestMatch(Class, String, Object...)}.
     *
     * @param clazz      The class reference.
     * @param methodName The method name.
     * @param args       The arguments for the method call.
     * @throws NoSuchMethodError     In case no suitable method was found.
     * @throws InvocationTargetError In case an exception was thrown by the invoked method.
     */
    public static <T> T callStaticMethod(Class<?> clazz, String methodName, Object... args) {
        try {
            return (T) findMethodBestMatch(clazz, methodName, args).invoke(null, args);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (InvocationTargetException e) {
            throw new InvocationTargetError(e.getCause());
        }
    }

    /**
     * Calls a static method of the given class.
     * See {@link #callStaticMethod(Class, String, Object...)}.
     *
     * <p>This variant allows you to specify parameter types, which can help in case there are multiple
     * methods with the same name, especially if you call it with {@code null} parameters.
     */
    public static <T> T callStaticMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes, Object... args) {
        try {
            return (T) findMethodBestMatch(clazz, methodName, parameterTypes, args).invoke(null, args);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (InvocationTargetException e) {
            throw new InvocationTargetError(e.getCause());
        }
    }

    /**
     * This class provides a wrapper for an exception thrown by a method invocation.
     *
     * @see #callMethod(Object, String, Object...)
     * @see #callStaticMethod(Class, String, Object...)
     * @see #newInstance(Class, Object...)
     */
    public static final class InvocationTargetError extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        /**
         * @hide
         */
        public InvocationTargetError(Throwable cause) {
            super(cause);
        }
    }

    //#################################################################################################

    /**
     * Creates a new instance of the given class.
     * The constructor is resolved using {@link #findConstructorBestMatch(Class, Object...)}.
     *
     * @param clazz The class reference.
     * @param args  The arguments for the constructor call.
     * @throws NoSuchMethodError     In case no suitable constructor was found.
     * @throws InvocationTargetError In case an exception was thrown by the invoked method.
     * @throws InstantiationError    In case the class cannot be instantiated.
     */
    public static Object newInstance(Class<?> clazz, Object... args) {
        try {
            return findConstructorBestMatch(clazz, args).newInstance(args);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (InvocationTargetException e) {
            throw new InvocationTargetError(e.getCause());
        } catch (InstantiationException e) {
            throw new InstantiationError(e.getMessage());
        }
    }

    /**
     * Creates a new instance of the given class.
     * See {@link #newInstance(Class, Object...)}.
     *
     * <p>This variant allows you to specify parameter types, which can help in case there are multiple
     * constructors with the same name, especially if you call it with {@code null} parameters.
     */
    public static Object newInstance(Class<?> clazz, Class<?>[] parameterTypes, Object... args) {
        try {
            return findConstructorBestMatch(clazz, parameterTypes, args).newInstance(args);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (InvocationTargetException e) {
            throw new InvocationTargetError(e.getCause());
        } catch (InstantiationException e) {
            throw new InstantiationError(e.getMessage());
        }
    }

    //#################################################################################################

    public static <T> T getFirstFieldByExactType(Object obj, Class<?> type) {
        try {
            return (T) findFirstFieldByExactType(obj.getClass(), type).get(obj);
        } catch (IllegalAccessException e) {
            // should not happen
            throw new IllegalAccessError(e.getMessage());
        }
    }

    public static <T> T getFirstFieldByExactTypeOrNull(Object obj, Class<?> type) {
        try {
            return (T) getFirstFieldByExactType(obj, type);
        } catch (NoSuchFieldError e) {
            return null;
        }
    }

    public static <T> T getFieldValue(Object obj, Field field) {
        try {
            return (T) field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(e.getMessage());
        }
    }
}
