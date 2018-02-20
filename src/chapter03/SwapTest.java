package chapter03;

public class SwapTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		System.out.println( i + "," + j);
		swap( i, j );
		System.out.println( i + "," + j);
	}

	public static void swap( int p, int q ) {
		int temp = p;
		p = q;
		q = temp;
	}
}
