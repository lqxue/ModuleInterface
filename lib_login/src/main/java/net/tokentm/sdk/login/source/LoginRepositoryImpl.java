package net.tokentm.sdk.login.source;

import net.tokentm.sdk.login.api.model.ILoginInfoBean;
import net.tokentm.sdk.login.api.source.LoginService;
import net.tokentm.sdk.login.model.LoginInfoBean;

/**
 * 登录仓库具体实现
 *
 * @author lqx Email:herolqx@126.com
 */
public class LoginRepositoryImpl implements LoginService {

    private final static LoginRepositoryImpl INSTANCE = new LoginRepositoryImpl();

    private LoginRepositoryImpl() {
    }

    public static LoginRepositoryImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public ILoginInfoBean getLoginInfo(String userId) {
        //进行网络请求
        LoginInfoBean loginInfoBean = new LoginInfoBean();
        loginInfoBean.setToken("567898765rtyfdxcfg");
        loginInfoBean.setUserName("老王");
        return loginInfoBean;
    }
}
