package chapter03;

public class Student extends Person {
	public Student() {
		//super()
	}
	
	public Student( int age ) {
		super( age );
		System.out.println( "Student() called" );
	}
	
	public void set() {
		//public 
		name = "둘리";
		
		//protected
		height = 150;
		
		//default
		age = 37;
		
		//private error
		//weight = 40;
	}
}
