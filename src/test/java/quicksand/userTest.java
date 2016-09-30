package quicksand;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mysql.fabric.xmlrpc.Client;
import com.quicksand.entity.JswyCoupon;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

import redis.clients.jedis.Jedis;




public class userTest {
	private static SqlSessionFactory sqlSessionFactory;  
	private static Jedis client=null;
    @BeforeClass  
    public static void setUp() throws Exception  
    {  
    	client=new Jedis("localhost");
    	System.out.println("Connection to server sucessfully");
        /*// create a SqlSessionFactory  
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");  
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
        session.close();  */
    }  
  
    @Test  
    public void shouldGetAUser()  
    {  
    	InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    	SqlSession session= sqlSessionFactory.openSession();
    	session.selectOne("", 2);
        /*SqlSession sqlSession = sqlSessionFactory.openSession();  
        try  
        {  
            JswyCoupon mapper = sqlSession.getMapper(JswyCoupon.class);  
            mapper.setCouponTemplateId(1);
            sqlSession.insert("com.quicksand.mapper.JswyCouponMapper");  
        } finally  
        {  
            sqlSession.close();  
        }  */
    }  
    
    @Test
    public void TestJRDemo() {
		System.out.println(client.ping());
		client.set("firstStringKey", "helloworld string");
		System.out.println(client.get("firstStringKey"));
	}
    /**
     * list
     */
    @Test
    public void TestListDemo() {
		System.out.println(client.ping());
		client.lpush("firstListKey", "firstList_Item1");
		client.lpush("firstListKey", "firstList_Item2");
		client.lpush("firstListKey", "firstList_Item3");
		client.lpush("firstListKey", "firstList_Item4");
		System.out.println("保存成功！");
		
		System.out.println("长度="+client.llen("firstListKey")+" 取值开始...");
		java.util.List<String> list= client.lrange("firstListKey",0,4);
		for (String item1 : list) {
			System.out.println(item1);
		}
	}
    
    @Test
    public void TestKeys() {
    	// 获取数据并输出
        Set<String> list = client.keys("*");
        System.out.println(list.size());
        System.out.println(); 
	}
}
