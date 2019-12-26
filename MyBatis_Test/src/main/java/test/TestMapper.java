package main.java.test;

import main.java.test.modle.MybatisUtils;
import main.java.test.modle.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapper {
    /**
     * 查询条件用户名
     */
    @Test
    public void SeletTestUser(){
        SqlSession sqlsession = MybatisUtils.getSession();
        Map map = new HashMap();
        map.put("user_name", "2");
        List<User> user = sqlsession.selectList("main.java.test.Test.SeletTest",map);
        //user.forEach(temp->System.out.println(user));
        System.out.println(user);
        sqlsession.close();
    }
    /**
     *查询条件地址
     */
    @Test
    public void SeletTestSite(){
        SqlSession sqlsession = MybatisUtils.getSession();
        Map map = new HashMap();
        map.put("user_password", "2");
        List<User> user = sqlsession.selectList("main.java.test.Test.SeletTest",map);
        //user.forEach(temp->System.out.println(user));
        System.out.println(map);
        System.out.println(user);
        sqlsession.close();
    }
    /**
     * 查询条件用户名和地址
     */
    @Test
    public void SeletTestUserAndSite(){
        SqlSession sqlsession = MybatisUtils.getSession();
        Map map = new HashMap();
        map.put("user_name", "1");
        map.put("user_password", "2");
        List<User> user = sqlsession.selectList("main.java.test.Test.SeletTest",map);
        //user.forEach(temp->System.out.println(user));
        System.out.println(map);
        System.out.println(user);
        sqlsession.close();
    }
    /**
     * 无条件查询
     */
    @Test
    public void SeletTest(){
        SqlSession sqlsession = MybatisUtils.getSession();
        List<User> user = sqlsession.selectList("main.java.test.Test.SeletTest");
        //user.forEach(temp->System.out.println(user));
        System.out.println(user);
        sqlsession.close();
    }
}