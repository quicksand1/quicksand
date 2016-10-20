package quicksand;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quicksand.service.AccountService;
import com.quicksand.service.impl.AccountServiceImpl;

public class ProjectTest {
	private ApplicationContext applicationContext=null;
	
	private AccountService accountService;
	
	{
		applicationContext=new ClassPathXmlApplicationContext("spring-mvc.xml");
		accountService=applicationContext.getBean(AccountServiceImpl.class);
	}
	
	@Test
	public void TxTest() {
		
		//int i=accountService.testTranstion();
	}
}
