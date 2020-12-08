package com.javaex.ex01;

public class RectList {

	//필드
	private Rectangle[] rArray ;
	private int rctPos ;
	
	//생성자
	public RectList() {
		rArray = new Rectangle[3];
		rctPos = 0;
	}
	
	//메소드 g/s
	
	//메소드 일반
	public void add(Rectangle r) {
		rArray[rctPos] = r;
		rctPos++;
	}
	
	public Rectangle get(int index) {
		return rArray[index];
	}
	
	public int size() {
		return rctPos;
	}
	
	
	
	
	
}
