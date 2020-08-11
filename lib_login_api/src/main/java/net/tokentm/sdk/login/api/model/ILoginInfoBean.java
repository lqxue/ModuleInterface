package net.tokentm.sdk.login.api.model;

/**
 * 暴露给其他模块使用的登录信息
 *
 * @author lqx Email:herolqx@126.com
 */
public interface ILoginInfoBean {

    /**
     * 获取用户信息
     */
    String getToken();

    /**
     * 获取用户名
     * @return
     */
    String getUserName();

}
