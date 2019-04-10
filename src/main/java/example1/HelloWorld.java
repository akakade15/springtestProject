package example1;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author akakade
 *
 */
public class HelloWorld implements InitializingBean,DisposableBean{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
//prints after container starts
	@PostConstruct
	public void init() {
		System.err.println("\n Init started " + new Date());
	}

	@PreDestroy //called after context is closed.
	public void clean() {
		System.err.println("\n Context closed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("Bean Init Startessssssssssssssd");
	}

	@Override
	public void destroy() throws Exception {
		System.err.println("Bean disposed");

	}
}
