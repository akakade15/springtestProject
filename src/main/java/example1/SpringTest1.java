package example1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author akakade
 *
 */
public class SpringTest1 {

	/**
	 * @param args
	 * ConfigurableApplicationContext for closing context ....
	 * ApplicationContext doen't have close method.
	 * 
	 * If a scope is set to singleton, the Spring IoC container creates exactly one instance of the object defined by that bean definition. 
	 * This single instance is stored in a cache of such singleton beans, and all subsequent requests and references for that named bean return the cached object.
	 * 
	 * If the scope is set to prototype, the Spring IoC container creates a new bean instance of the object every time a request for that specific bean is made. 
	 * As a rule, use the prototype scope for all state-full beans and the singleton scope for state less beans.
	 * 
	 * The Spring container is at the core of the Spring Framework. The container will create the objects, wire them together, configure them, and manage their complete life
	 *  cycle from creation till destruction. The Spring container uses DI to manage the components that make up an application.
	 * 
	 * AbstractApplicationContext class has registerShutdownHook method,
	 *  ConfigurableApplicationContext contains close 
	 */
	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("example1.xml");
		HelloWorld bean = ac.getBean("helloWorld", HelloWorld.class);
		bean.setMessage("SURESH");
		System.out.println("BEAN 1 "+bean.getMessage());
		
		HelloWorld bean2 = (HelloWorld) ac.getBean("helloWorld");
		System.out.println("BEAN 2 "+bean2.getMessage());
		
		ac.registerShutdownHook();
		ac.close();
	}

}
