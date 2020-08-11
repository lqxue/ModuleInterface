package net.tokentm.sdk.operator;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/**
 * 核心初始化 只用来初始化
 * <p>
 * Application->attachBaseContext =====>ContentProvider->onCreate =====>Application->onCreate =====>Activity->onCreate
 *
 * @author lqx Email:herolqx@126.com
 */
public class Installer extends ContentProvider {

    /**
     * 创建ContentProvider时调用的回调函数
     */
    @Override
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                //初始化操作员
                OperatorClient.init(applicationContext);
            }
        }
        return true;
    }

    /**
     * 删除数据
     */
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    /**
     * 数据库访问类型
     */
    @Override
    public String getType(Uri uri) {
        return null;
    }

    /**
     * 插入数据
     */
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return uri;
    }


    /**
     * 查询数据库
     */
    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        return null;
    }

    /**
     * 更新数据库
     */
    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        return 0;
    }

    /**
     * 获取关键信息，用户ID
     *
     * @param selection
     * @param selectionArgs
     * @return
     */
    private String getUserId(String selection, String[] selectionArgs) {
        return null;
    }
}
