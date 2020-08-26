package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

public class Circle implements Shape {

	private Point center;
	@Autowired
	private MessageSource messageSource;
	@Override
	public void draw() {
		//System.out.println("The center point is : ("+center.getX()+","+center.getY()+")");
		System.out.println(this.messageSource.getMessage("drawing.circle",null,"defaultCircle",null));
		System.out.println(this.messageSource.getMessage("drawing.point",new Object[] {center.getX(),center.getY()}, "defaultPoint", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "defaultMessage", null));
	}
	public Point getCenter() {
		return center;
	}
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
