package main;
import org.springframework.beans.factory.DisposableBean;

public class SomeBean implements DisposableBean{
	public void destroyMetchod(){
		System.out.println("Niszczenie Metody");
	}
	
	public void isWorking(){
		System.out.println("Działa");
	}

	public void destroy() throws Exception {
		System.out.println("Niszczenie przez disposable");
		
	}
}
