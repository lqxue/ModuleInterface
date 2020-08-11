package net.tokentm.sdk.operator;

import android.app.Application;
import android.content.Context;

import net.tokentm.sdk.base.router.Router;
import net.tokentm.sdk.login.Router.LoginRouter;

import java.util.Objects;

/**
 * 暴露给app的  操作员客户端
 *
 * @author lqx Email:herolqx@126.com
 */
public class OperatorClient {

    /**
     * 初始化 核心模块
     */
    protected static void init(Context context) {
        Application application = (Application) Objects.requireNonNull(context.getApplicationContext());
        registerService();
        //进行一些初始化和注册
        //base模块.init(application);
        //注册各个模块的核心服务
        registerService();
        //注册Activity的监听回调
//        application.registerActivityLifecycleCallbacks(callBack);
    }

    private OperatorClient() {

    }

    /**
     * 注册数据服务
     */
    private static void registerService() {
        //注册登录仓库仓库服务
        LoginRouter.registerService();
    }

    /**
     * 获取服务
     *
     * @param repoService
     * @param <T>
     * @return
     */
    public static <T> T getService(Class<T> repoService) {
        return Router.getService(repoService);
    }

}
