package net.tokentm.sdk.login.api.source;

import net.tokentm.sdk.login.api.model.ILoginInfoBean;

/**
 * 登录接口服务
 *
 * @author lqx Email:herolqx@126.com
 */
public interface LoginService {

    /**
     * 请求登录信息
     */
    ILoginInfoBean getLoginInfo(String userId);

}
