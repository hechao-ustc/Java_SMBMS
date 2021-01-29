package com.hc.dao.user;

import com.hc.pojo.User;

import java.sql.Connection;
import java.util.List;

public interface UserDao {

    /**
     * 通过userCode获取User
     *
     * @param connection
     * @param userCode
     * @return
     * @throws Exception
     */
    public User getLoginUser(Connection connection, String userCode) throws Exception;


    //修改当前密码
    public int updatePwd(Connection connection, int id, String password) throws Exception;

    //根据用户名或者角色查询用户总数
    public int getUserCount(Connection connection, String userName, int userRole)throws Exception;

    //通过条件查询-userList
    public List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize)throws Exception;

    public int add(Connection connection, User user)throws Exception;

    public int deleteUserById(Connection connection, Integer delId)throws Exception;

    public User getUserById(Connection connection, String id)throws Exception;

    public int modify(Connection connection, User user)throws Exception;


}
