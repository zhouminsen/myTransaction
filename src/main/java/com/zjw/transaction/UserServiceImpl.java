package com.zjw.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by zhoum on 2019-06-28.
 */
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public void add(User user) throws SQLException {
        Connection conn = ConnectionUtils.getConection();
        PreparedStatement preparedStatement = conn.prepareStatement("insert into USER (name,age)" +
                " VALUES (?,?)");
        preparedStatement.setObject(1, user.getName());
        preparedStatement.setObject(2, user.getAge());
        preparedStatement.execute();
        int i = 1 / 0;
        preparedStatement = conn.prepareStatement("insert into USER (name,age)" +
                " VALUES (?,?)");
        preparedStatement.setObject(1, user.getName());
        preparedStatement.setObject(2, user.getAge());
        preparedStatement.execute();
    }
}
