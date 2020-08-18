package com.example.spring;

public class Rectangle {

	private Point zeroPoint;
	private Point point2;
	private Point point3;
	private Point point4;
	public Point getZeroPoint() {
		return zeroPoint;
	}
	public void setZeroPoint(Point zeroPoint) {
		this.zeroPoint = zeroPoint;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public Point getPoint4() {
		return point4;
	}
	public void setPoint4(Point point4) {
		this.point4 = point4;
	}
	public void draw() {
		System.out.println("Point A =("+getZeroPoint().getX()+","+getZeroPoint().getY()+")");
		System.out.println("Point B =("+getPoint2().getX()+","+getPoint2().getY()+")");
		System.out.println("Point C =("+getPoint3().getX()+","+getPoint3().getY()+")");
		System.out.println("Point D =("+getPoint4().getX()+","+getPoint4().getY()+")");
	}
}
