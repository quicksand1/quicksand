package quicksand;

import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.quicksand.entity.JswyCoupon;




public class userTest {
	private static SqlSessionFactory sqlSessionFactory;  
	  
    @BeforeClass  
    public static void setUp() throws Exception  
    {  
        // create a SqlSessionFactory  
        Reader reader = Resources.getResourceAsReader("config/mybatis/files/mybatis-config.xml");  
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);  
        reader.close();  
  
        // populate in-memory database  
        SqlSession session = sqlSessionFactory.openSession();  
        Connection conn = session.getConnection();  
        reader = Resources.getResourceAsReader("config/mybatis/files/hqlbd.sql");  
        ScriptRunner runner = new ScriptRunner(conn);  
        runner.setLogWriter(null);  
        runner.runScript(reader);  
        reader.close();  
        session.close();  
    }  
  
    @Test  
    public void shouldGetAUser()  
    {  
        SqlSession sqlSession = sqlSessionFactory.openSession();  
        try  
        {  
            JswyCoupon mapper = sqlSession.getMapper(JswyCoupon.class);  
            mapper.setCouponTemplateId(1);
            sqlSession.insert("com.quicksand.mapper.JswyCouponMapper");  
        } finally  
        {  
            sqlSession.close();  
        }  
    }  
}
