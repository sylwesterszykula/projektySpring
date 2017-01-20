package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*Locale local = Locale.getDefault();
		Calendar calendar = GregorianCalendar.getInstance(local);
		DateFormat formatter = SimpleDateFormat.getInstance();
		System.out.println(formatter.format(calendar.getTime()));*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("contex.xml");
		Calendar calendar = context.getBean("calendar", Calendar.class);
		//DateFormat dateFormat = (DateFormat) context.getBean("formatter"); //rzutowanie
		DateFormat formatter = context.getBean("formatter", DateFormat.class); //przy pobieranie daje do zrozumienia ze musi rzutowac 
		
		System.out.println(formatter.format(calendar.getTime()));
	}
}
