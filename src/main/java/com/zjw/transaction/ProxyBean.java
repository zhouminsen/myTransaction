package com.zjw.transaction;

import java.lang.reflect.*;
import java.sql.Connection;

/**
 * Created by zhoum on 2019-07-02.
 */
public class ProxyBean {

    private Object target;

    private Connection connection;

    public ProxyBean(Object target, Connection connection) {
        this.target = target;
        this.connection = connection;
    }

    public Object getBean() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                connection.setAutoCommit(false);
                try {
                    method.invoke(target, args);
                    connection.commit();
                } catch (Exception e) {
                    connection.rollback();
                } finally {
                    connection.close();
                }
                return null;
            }
        });
        return o;
    }
}
