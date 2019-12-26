package main.java.test.modle;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;

    //初始化sqlSessionFactory对象
    static {
        try {
            //使用MyBatis 提供的Resources类加载MyBatts的配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //构建Sq1sesslonFactory工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取Sq1Session对象的静态方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
