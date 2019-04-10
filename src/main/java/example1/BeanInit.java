package example1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInit implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("Bean Init Started");
	}

	@Override
	public void destroy() throws Exception {
		System.err.println("Bean disposed");
	}

}
