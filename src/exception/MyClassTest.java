package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		try {
			test();
		} catch (IOException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test() throws IOException, MyException {
		MyClass myclass = new MyClass();
		myclass.danger();
	}

}
