package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.ActorDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		ActorDaoImpl act=(ActorDaoImpl) context.getBean("app");
		System.out.println(+act.getCount());
	}
	
	
}
