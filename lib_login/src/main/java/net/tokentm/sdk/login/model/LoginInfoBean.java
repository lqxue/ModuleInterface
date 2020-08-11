package net.tokentm.sdk.login.model;

import net.tokentm.sdk.login.api.model.ILoginInfoBean;

/**
 * 登录信息
 *
 * @author lqx Email:herolqx@126.com
 */
public class LoginInfoBean implements ILoginInfoBean {

    /**
     * token
     */
    private String token;
    /**
     * 用户名
     */
    private String userName;

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getToken() {
        return token;
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
