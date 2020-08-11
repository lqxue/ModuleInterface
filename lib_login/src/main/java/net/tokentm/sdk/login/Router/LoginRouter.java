package net.tokentm.sdk.login.Router;

import net.tokentm.sdk.base.router.Router;
import net.tokentm.sdk.login.api.source.LoginService;
import net.tokentm.sdk.login.source.LoginRepositoryImpl;

/**
 * 登录路由
 *
 * @author lqx Email:herolqx@126.com
 */
public class LoginRouter {

    /**
     * 注册数据服务
     */
    public static void registerService() {
        Router.registerService(LoginService.class, LoginRepositoryImpl.getInstance());
    }
}
