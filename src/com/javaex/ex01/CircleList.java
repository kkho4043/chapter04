package com.javaex.ex01;

public class CircleList {

	//필드
		private Circle[] cArray ;
		private int cirPos ;
		
		//생성자
		public CircleList() {
			cArray = new Circle[3];
			cirPos = 0;
		}
		
		//메소드 g/s
		
		//메소드 일반
		public void add(Circle r) {
			cArray[cirPos] = r;
			cirPos++;
		}
		
		public Circle get(int index) {
			return cArray[index];
		}
		
		public int size() {
			return cirPos;
		}
	
}
