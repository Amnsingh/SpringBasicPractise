package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args) {
				//Triangle triangle = new Triangle();
				//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
				AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
				context.registerShutdownHook();
				Shape shape = (Shape)context.getBean("circle");
				shape.draw();
				//System.out.println(context.getMessage("greeting", null, "defaultMessage", null));
	}

}
