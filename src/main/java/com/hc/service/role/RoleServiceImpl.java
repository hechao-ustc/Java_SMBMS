package com.hc.service.role;

import com.hc.dao.BaseDao;
import com.hc.dao.role.RoleDao;
import com.hc.dao.role.RoleDaoImpl;
import com.hc.pojo.Role;
import com.hc.service.user.UserServiceImpl;
import org.junit.Test;

import java.sql.Connection;
import java.util.Collection;
import java.util.List;

public class RoleServiceImpl implements RoleService{
    private RoleDao roleDao;

    public RoleServiceImpl() {
        roleDao = new RoleDaoImpl();
    }

    public List<Role> getRoleList() {
        Connection connection = null;
        List<Role> roleList = null;
        try {
            connection = BaseDao.getConnection();
            roleList = roleDao.getRoleList(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            BaseDao.closeResource(connection, null, null);
        }
        return roleList;
    }

    /*@Test
    public void test(){
        RoleServiceImpl roleService = new RoleServiceImpl();
        List<Role> list = roleService.getRoleList();
        System.out.println(list.get(0).getRoleName());
    }*/
}
