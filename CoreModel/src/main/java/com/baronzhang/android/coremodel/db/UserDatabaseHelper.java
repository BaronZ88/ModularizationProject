package com.baronzhang.android.coremodel.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import com.baronzhang.android.coremodel.entities.User;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2017/1/12
 */
public class UserDatabaseHelper extends BaseDatabaseHelper {

    private static final String TAG = "UserDatabaseHelper";

    private static final String DATABASE_NAME = "user.db";
    private static final int DATABASE_VERSION = 1;

    private static volatile UserDatabaseHelper instance;

    public UserDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    /**
     * 单例获取OpenHelper实例
     *
     * @param context application context
     * @return instance
     */
    public static UserDatabaseHelper getInstance(Context context) {

        context = context.getApplicationContext();
        if (instance == null) {
            synchronized (UserDatabaseHelper.class) {
                if (instance == null) {
                    instance = new UserDatabaseHelper(context);
                }
            }
        }
        return instance;
    }
}
