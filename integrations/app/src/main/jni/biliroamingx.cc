#include <jni.h>
#include <cstdlib>
#include <android/log.h>
#include <unistd.h>
#include <sys/mman.h>
#include "dobby.h"

#define LOG_TAG "BiliRoamingX"

#ifndef NDEBUG
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#else
#define LOGD(...) 0
#endif
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

#define PAGE_ALIGN(address, page_size) ((address) & (-(page_size)))

void fake_exit(int32_t status) {
    LOGI("Exit function fake success, status: %d", status);
}

JNIEXPORT JNICALL extern "C"
jint JNI_OnLoad(JavaVM *vm, void *) {
    JNIEnv *env;
    if (vm->GetEnv((void **) &env, JNI_VERSION_1_6) != JNI_OK)
        return JNI_ERR;
    const auto page_size = getpagesize();
    const auto aligned = PAGE_ALIGN((uintptr_t) exit, page_size);
    mprotect((void *) aligned, page_size, PROT_READ | PROT_WRITE | PROT_EXEC);
    if (DobbyHook((void *) exit,
                  reinterpret_cast<dobby_dummy_func_t>(fake_exit),
                  nullptr) == RS_SUCCESS) {
        LOGD("Exit function hook success");
    } else {
        LOGD("Exit function hook failed");
    }
    return JNI_VERSION_1_6;
}
