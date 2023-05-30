package com.Ganesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{

		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		Product a=(Product)ctx.getBean("id1");
		a.printproduct();
		


	}
}
