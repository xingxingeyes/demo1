package com.kai.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
public class JDKProxy {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        // 创建实现类代理对象
        // Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
        //     @Override
        //     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //         return null;
        //     }
        // });

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result" + result);
    }

}

// 创建代理对象代码
class UserDaoProxy implements InvocationHandler {

    // 1.把创建是谁的代理对象，把谁传递过来
    // 有参数构造器
    public Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }


    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前
        System.out.println("方法之前执行..." + method.getName() + "传递的参数" + Arrays.toString(args));
        // 被增强的方法执行
        Object res = method.invoke(object, args);
        // 方法之后
        System.out.println("方法之后执行..." + object);


        return res;
    }
}
