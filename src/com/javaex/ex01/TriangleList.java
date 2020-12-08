package com.javaex.ex01;

public class TriangleList {
	private Triangle[] tArray;
	private int tngPos;
	
	public TriangleList() {
		tArray = new Triangle[3];
		tngPos = 0;
		
	}
	public void add(Triangle r) {
		tArray[tngPos] = r;
		tngPos++;
	}
	
	public Triangle get(int index) {
		return tArray[index];
	}
	
	public int size() {
		return tngPos;
	}
	
	
}
