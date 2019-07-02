package com.zjw.transaction;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by zhoum on 2019-06-28.
 */
public class ConnectionUtils {
    private static DruidDataSource dataSource = new DruidDataSource();
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    //静态代码块,设置连接数据库的参数
    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/web");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
    }


    public static Connection getConection() throws SQLException {
        Connection conn = threadLocal.get();
        if (conn == null) {
            conn = dataSource.getConnection();
            threadLocal.set(conn);
        }
        return conn;
    }
}
