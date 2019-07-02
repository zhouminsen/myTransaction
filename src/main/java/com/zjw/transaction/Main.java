package com.zjw.transaction;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 * Created by zhoum on 2019-06-28.
 */
public class Main {
    public static void main(String[] args) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        UserService bean = (UserService) BeanFactory.getBean(UserServiceImpl.class);
        User user = new User();
        user.setName("伟哥");
        user.setAge(1);
        bean.add(user);
    }
}
