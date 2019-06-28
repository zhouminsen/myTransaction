package com.zjw.transaction;

import java.sql.SQLException;

/**
 * Created by zhoum on 2019-06-28.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        CalcCount calcCount = new CalcCount();
        calcCount.setStoreCount(1);
        calcCount.setName("1");
        calcCount.setVersion(0);
        userService.add(calcCount);
    }
}
