package test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Tets1 {
    //启动工厂
    //ClassPathXmlApplicationContext con =new ClassPathXmlApplicationContext("spring.xml");
    //启动工厂
    ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");

    @Test
    public void testpub() {
        System.out.println("helllo");
    }

    //测试工厂
    @Test
    public void SqlSessionFactory() {
        SqlSessionFactory factory = (SqlSessionFactory) this.app.getBean("factory");
        SqlSession session = factory.openSession();
        session.getConnection();
        System.out.println(session.getConnection());
    }

    //测试数据源
    /*@Test
    public void com() throws SQLException {
        DataSource d = (DataSource) con.getBean("ds");
        System.out.println(d.getConnection());
    }*/
}
