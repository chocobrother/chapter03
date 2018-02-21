package chapter03;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setAlbum( "Real" );
		song.setArtist( "아이유" );
		song.setTitle( "좋은날" );
		song.setYear( 2010 );
		song.setTrack( 3 );
		song.setComposer( "이민수" );
		
		song.show();
		
		Song song2 = new Song( "그 때 헤어지면", "로이킴", "", "", 2018, 1 );
		song2.show();

		Song song3 = new Song( "꽃이야", "JBJ" );
		song3.show();
		
	}

}
