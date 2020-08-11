package net.tokentm.sdk.base.router;

import java.util.concurrent.ConcurrentHashMap;
/**
 * 定义路由服务
 *
 * @author lqx Email:herolqx@126.com
 */
public class Router {

    private static final ConcurrentHashMap<Class, Object> SERVICE_MAP = new ConcurrentHashMap<>();

    /**
     * 注册服务
     */
    public static <T> void registerService(Class<T> clazz, Object o) {
        SERVICE_MAP.put(clazz, o);
    }

    /**
     * 获取服务
     *
     * @param repoService
     * @param <T>
     * @return
     */
    public static <T> T getService(Class<T> repoService) {
        return (T) SERVICE_MAP.get(repoService);
    }
}
