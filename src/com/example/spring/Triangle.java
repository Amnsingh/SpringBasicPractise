package com.example.spring;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape,InitializingBean,DisposableBean {
	
	List<Point> points;
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw() {
		for(Point point : points) {
		System.out.println("Point  = ("+point.getX()+","+point.getY()+")");
		}
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean method called");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean method called");
		
	}
	public void initialize() {
		System.out.println("Initialize method called");
	}
	public void cleanUp() {
		System.out.println("cleanUp method called");
	}

}
