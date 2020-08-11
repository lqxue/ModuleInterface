package com.lqx;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import net.tokentm.sdk.login.api.model.ILoginInfoBean;
import net.tokentm.sdk.login.api.source.LoginService;
import net.tokentm.sdk.operator.OperatorClient;

/**
 * app 壳
 *
 * @author lqx Email:herolqx@126.com
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String userId = "11";
        ILoginInfoBean loginInfo = OperatorClient.getService(LoginService.class).getLoginInfo(userId);
        //假设token不是空就代表登录了
        if (!TextUtils.isEmpty(loginInfo.getToken())) {
            Toast.makeText(this, loginInfo.getUserName() + "登录成功", Toast.LENGTH_LONG).show();
        }
    }
}
