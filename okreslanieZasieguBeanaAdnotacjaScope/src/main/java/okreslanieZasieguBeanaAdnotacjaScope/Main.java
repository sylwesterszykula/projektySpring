package okreslanieZasieguBeanaAdnotacjaScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		CounterUser bean = context.getBean("counterUser", CounterUser.class);
		
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println(bean.getPrototypeCounter1().getCounter());
		
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println(bean.getPrototypeCounter2().getCounter());
		
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println(bean.getSingletonCounter1().getCounter());
		
		System.out.println(bean.getSingletonCounter2().getCounter());
		System.out.println(bean.getSingletonCounter2().getCounter());
	}

}
