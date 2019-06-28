package com.zjw.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by zhoum on 2019-06-28.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() throws SQLException {
        Connection conection = ConnectionUtils.getConection();

    }
}
