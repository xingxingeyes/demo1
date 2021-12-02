package com.kai.demo5.service;

import com.kai.demo5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/

/**
 * 事务的传播行为 propagation = Propagation.REQUIRED
 * 事务的隔离级别 isolation = Isolation.REPEATABLE_READ
 *  timeout ：超时时间
 *          （1）事务需要在一定时间内进行提交，如果不提交进行回滚
 *          （2）默认值是 -1 ，设置时间以秒单位进行计算
 *  readOnly ：是否只读
 *          （1）读：查询操作，写：添加修改删除操作
 *          （2）readOnly 默认值 false，表示可以查询，可以添加修改删除操作
 *          （3）设置 readOnly 值是 true，设置成 true 之后，只能查询
 *  rollbackFor ：回滚
 *          （1）设置出现哪些异常进行事务回滚
 *  noRollbackFor ：不回滚
 *          （1）设置出现哪些异常不进行事务回滚
 */

// 添加事务注解，添加到类上面表示类中所有方法添加事务 添加到方法上面表示该方法添加事务
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class UserService {

    // 注入dao
    @Autowired
    private UserDao userDao;


    // 转账的方法
    public void accountMoney() {


        // try {
            // 第一步 开启事务

            // 第二步 进行业务操作
            userDao.reduceMoeny();
            // 模拟异常
            int a = 10/0;
            userDao.addMoeny();

            // 第三步 没有发生异常，提交事务
        // } catch (Exception e) {
        //     // 第四步 出现异常，事务回滚
        //     e.printStackTrace();
        // }
    }

}
