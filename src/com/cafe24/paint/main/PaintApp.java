package com.cafe24.paint.main;

import com.cafe24.paint.i.Drawable;
import com.cafe24.paint.point.ColorPoint;
import com.cafe24.paint.point.Point;
import com.cafe24.paint.shape.Circle;
import com.cafe24.paint.shape.Rectangle;
import com.cafe24.paint.shape.Shape;
import com.cafe24.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX( 100 );
		p.setY( 50 );
		
		draw(p);
		
		Point p2 = new Point(50, 100);
		p2.show(true);
		p2.show(false);
	
		Point p3 = new ColorPoint(200, 100, "red");
		draw(p3);
		p3.show(false);
		p3.show(true);
		
		Shape s = new Rectangle(100, 200);
		draw( s );
		//downcasting -> explicity casting
		Rectangle r = (Rectangle)s;
		r.getHeight();
		//((Rectangle)s).getWidth();
		
		Circle c = new Circle(10);
		// updasting -> implicity casting
		Shape s2 = c;
		draw( s2 );
		
		
		//instanceof 클래스 경우
		// 상속관계(부모거나 자식들만  연산할 수 있다)
		Shape s5 = new Rectangle(10, 20);
		System.out.println( s5 instanceof Object );
		System.out.println( s5 instanceof Shape );
		System.out.println( s5 instanceof Rectangle );
		System.out.println( s5 instanceof Triangle );
		
		Rectangle rect = new Rectangle(10, 20);
		System.out.println( rect instanceof Object );
		System.out.println( rect instanceof Shape );
		System.out.println( rect instanceof Rectangle );
		//System.out.println( rect instanceof Triangle );
		
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
}
