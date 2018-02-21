package com.cafe24.paint.point;

import com.cafe24.paint.i.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;

	public Point() {
	}

	public Point( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void draw() {
		System.out.println(
			"점[" + x + "," + 
			y + "]을 그렸습니다." );
	}
	
	public void show(boolean visible) {
		if( visible == true ) {
			draw();
			return;
		}
		
		System.out.println(
			"점[" + x + "," + 
			y + "]을 지웠습니다." );
	}
}
