package example2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext as = new ClassPathXmlApplicationContext("example2.xml");
		Message bean = as.getBean("helloWorld",Message.class);
		System.out.println("\n"+bean.getMessage());
		as.close();
	}

}
