package fr.insta.robot;

import org.junit.BeforeClass;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Factory des services.
 */
public class AbstractServiceFactory {
	
	static ConfigurableApplicationContext context;

	/**
	 * Initialisation Environnement
	 */
	@BeforeClass
	public static void initEnvironment() {
		
		System.out.println("load context");
		context = new ClassPathXmlApplicationContext("spring/application-config.xml");
	}

	protected static ConfigurableApplicationContext getContext() {
		return context;
	}
}

///**
// * Factory des services.
// */
//public class AbstractServiceFactory {
//	
//	static GenericXmlApplicationContext context;
//
//	/**
//	 * Initialisation Environnement
//	 */
//	@BeforeClass
//	public static void initEnvironment() {
//		// Initial spring context with profiles
//	    context= new GenericXmlApplicationContext();
//	    ConfigurableEnvironment env = (ConfigurableEnvironment) context.getEnvironment();
//	    env.setDefaultProfiles("dev");
//	    context.load("spring/application-config.xml");
//	    context.refresh();
//		
//		System.out.println("load context");
//	}
//
//	protected static ConfigurableApplicationContext getContext() {
//		return context;
//	}
//}

