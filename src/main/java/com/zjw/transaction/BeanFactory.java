package com.zjw.transaction;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by zhoum on 2019-07-02.
 */
public class BeanFactory {
    public static Object getBean(Class clazz) throws IllegalAccessException, InstantiationException, SQLException, NoSuchMethodException, InvocationTargetException {
        Object o = clazz.newInstance();
        if (o.getClass().isAnnotationPresent(Transactional.class)) {
            Connection conection = ConnectionUtils.getConection();
            ProxyBean proxyBean = new ProxyBean(o, conection);
            return proxyBean.getBean();
        }
        return o;
    }
}
