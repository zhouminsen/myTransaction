package com.zjw.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by zhoum on 2019-06-28.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add(CalcCount calcCount) throws SQLException {
        Connection conn = ConnectionUtils.getConection();
        PreparedStatement preparedStatement = conn.prepareStatement("insert into calc_count ('store_count','name','version')" +
                " VALUES (?,?,?)");
        preparedStatement.setObject(1, calcCount.getStoreCount());
        preparedStatement.setObject(2, calcCount.getName());
        preparedStatement.setObject(3, calcCount.getVersion());
        preparedStatement.execute();
    }
}
