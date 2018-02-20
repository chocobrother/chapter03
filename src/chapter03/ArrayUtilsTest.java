package chapter03;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30, 40 };
		
		double[] d1 = ArrayUtils.intToDouble(a1);
		for( double v : d1 ) {
			System.out.print( v + " " );
		}
		
		System.out.print( "\n" );
		
		
		double[] d2 = { 50.2, 20.4, 30.2, 40.5 };
		int[] a2 = ArrayUtils.doubleToInt( d2 );

		for( int v : a2 ) {
			System.out.print( v + " " );
		}
		
		System.out.print( "\n" );

		
		int[] a3 = { 50, 60, 70, 80 };
		int[] a4 = ArrayUtils.concat(a1, a3);
		for( int v : a4 ) {
			System.out.print( v + " " );
		}
		
		System.out.print( "\n" );		
	}

}
