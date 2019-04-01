package example1;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author akakade
 *
 */
/**
 * @author akakade
 *
 */
public class HelloWorld {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void init() {
		System.err.println("\n Init started " + new Date());
	}

	@PreDestroy
	public void clean() {
		System.err.println("\n Context closed");
	}
}
