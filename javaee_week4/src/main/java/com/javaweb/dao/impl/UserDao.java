package com.javaweb.dao.impl;

import com.javaweb.dao.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDao {
    private static SqlSession sqlSession;
    private volatile static UserDao userDao;

    @Before
    public void init() throws IOException {
        //SqlSession---->SqlSessionFactory--->SqlSessionFactoryBuilder
        //1、得到SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //2、通过SqlSessionFactoryBuilder对象得到SqlSessionFactory对象
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory ssf = ssfb.build(ins);
        //3、得到SqlSession对象
        sqlSession = ssf.openSession();

    }

    public List<User> selectall(){
        List<User> list = sqlSession.selectList("com.javaweb.dao.impl.UserDao.selectall");
        sqlSession.close();
        return list;
    }

    public Integer add(User user){
        int result = sqlSession.insert("com.javaweb.dao.impl.UserDao.add",user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    public Integer delete(Integer id){
        int result = sqlSession.delete("com.javaweb.dao.impl.UserDao.delete",id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    public Integer update(User user){
        int result = sqlSession.delete("com.javaweb.dao.impl.UserDao.update",user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Test
    public void test() {
        //写查询代码

    }

}
