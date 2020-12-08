package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
	
		
		//사각형 관리
		RectList rList = new RectList();
		
		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(10, 10);
		Rectangle r03 = new Rectangle(100, 10);
		
		rList.add(r01);
		rList.add(r02);
		rList.add(r03);
		
		Rectangle r100 = rList.get(2);
		r100.draw();
		
		System.out.println(rList.size());
		
		//원 관리
		
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(100);
		Circle c03 = new Circle(50);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		Circle c100 = cList.get(1);
		c100.draw();
		System.out.println(cList.size());
		//삼각형
		TriangleList tList = new TriangleList();
		
		Triangle t01 = new Triangle(50,20);
		Triangle t02 = new Triangle(30,60);
		Triangle t03 = new Triangle(80,70);
		
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		
		Triangle t100 = tList.get(0);
		t100.draw();
		System.out.println(tList.size());
		
		

	}

}
