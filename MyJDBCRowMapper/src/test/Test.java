package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Actor;
import dao.ActorDaoImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		ActorDaoImpl act=(ActorDaoImpl) context.getBean("app");
		Actor a= act.getActor(3);
		System.out.println(a.getId());
		System.out.println(a.getFn());
		System.out.println(a.getLn());
		System.out.println(a.getLast_update());
		
	}
}
