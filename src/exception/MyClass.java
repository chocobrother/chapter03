package exception;

import java.io.IOException;

public class MyClass {
	
	public void danger() 
		throws IOException, MyException {
		System.out.println( "some code1" );
		System.out.println( "some code2" );
		
		if( 2 == 2 ) {
//			throw new MyException();
			throw new MyException( "예외 발생" );
		}
		
		if( 1 == 1 ) {
			throw new IOException();
		}
	}
}
