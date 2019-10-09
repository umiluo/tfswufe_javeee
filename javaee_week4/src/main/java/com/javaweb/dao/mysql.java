package com.javaweb.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mysql {
    private volatile static mysql mysql;
    private static SqlSession sqlSession;
    private mysql() {
        if (sqlSession == null) {
            try {
                init();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //获取唯一可用的对象
    public static mysql getInstance() {
        return mysql;
    }

    public static mysql getMysql() {
        if (mysql == null) {
            synchronized (mysql.class) {
                if (mysql == null) {
                    mysql = new mysql();
                }
            }
        }
        return mysql;
    }

    private void init() throws IOException {
        //SqlSession---->SqlSessionFactory--->SqlSessionFactoryBuilder
        //1、得到SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //2、通过SqlSessionFactoryBuilder对象得到SqlSessionFactory对象
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory ssf = ssfb.build(ins);
        //3、得到SqlSession对象
        sqlSession = ssf.openSession();
    }

    /**
     * 获取SqlSession对象
     * @return
     */
    public SqlSession getSqlSession() {
        return sqlSession;
    }
}
