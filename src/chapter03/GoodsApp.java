package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName( "cannon" );
		camera.setPrice( 5000 );
		camera.setCountStock( 50 );
		camera.setCountSold( 100 );
		
		camera.showInfo();
		System.out.println( camera.calcDiscountPrice(0.5) );
		
		Goods camera1 = new Goods();
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();
				
		System.out.println( Goods.countOfGoods );
	
		
		Goods goods = new Goods( "nikon", 2000, 50, 0 );
		goods.showInfo();
	}

}
