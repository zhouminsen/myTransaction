package com.zjw.transaction;

import java.sql.SQLException;

/**
 * Created by zhoum on 2019-06-28.
 */
public interface UserService {

    void add(User user) throws SQLException;
}
