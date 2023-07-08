package app.revanced.bilibili.patches.protobuf;

import com.bapis.bilibili.app.resource.v1.ListReply;
import com.bapis.bilibili.app.resource.v1.ListReplyEx;
import com.bapis.bilibili.app.resource.v1.ListReq;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import app.revanced.bilibili.settings.Settings;

public class ModuleListReplyHook {
    private static final Map<String, List<String>> exceptionsMap = Map.of(
            "dynamic", List.of("android_meicam_lic", "android_nvs_")
    );

    private static Stream<String> getExceptionModules() {
        Set<String> set = Settings.BLOCK_MODULES_EXCEPTION.getStringSet();
        return set.stream().flatMap(e -> {
            List<String> modules = exceptionsMap.get(e);
            return modules != null ? modules.stream() : Stream.empty();
        });
    }

    public static void hook(ListReq req, ListReply reply) {
        if (!Settings.BLOCK_MODULES.getBoolean()) return;
        var notException = getExceptionModules().noneMatch(e -> req.getModuleName().startsWith(e));
        if (notException)
            ListReplyEx.clearPools(reply);
    }
}
