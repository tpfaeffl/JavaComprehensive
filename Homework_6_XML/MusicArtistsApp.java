package Homework_6_XML;




import java.util.ArrayList;

public class MusicArtistsApp {
	
	 public static String name;
	 public String album;
	
	public static void main(String[] args) {
		System.out.println("Artist and Album Listing");	
		System.out.println();
		System.out.println();
		
		
		ArtistAlbum p = new ArtistAlbum();
		ArrayList<ArtistAlbum> artistalbum = p.getArtistAlbum();
		
		System.out.println("Artists \n" + 
		"----------------");
		
		// print artists
		for (ArtistAlbum a : artistalbum) {
			
			System.out.println(a.name);
		}
		
		System.out.println();
		System.out.println();
		
		// print albums
		System.out.println("Albums \n" + 
		"----------------");
		for (ArtistAlbum a : artistalbum) {
			
			if (a.album != null) {
			System.out.println(a.album);
			}
			
		}
		
		// print artists and albums
		System.out.println("Artists and Albums \n" + 
				"----------------");
		for (ArtistAlbum a : artistalbum) {
			System.out.println(a.name);
			for (int j = 1; j < artistalbum.size(); j++) {
				System.out.println("\t" + a.album);
				j++;
			}
		}
//			for (int i =0; i <  artistalbum.size(); ) {
//				System.out.println(p.name);
//				i++;
//				for (int j = 1; j < artistalbum.size(); ) {
//					System.out.print(p.album + " ");
//					System.out.print("\n");
//					j++;
//					
//				}
//			}
//		ArtistAlbum[][] artistalbumarray = new ArtistAlbum[artistalbum.size()][];
//		for (int i = 0; i< artistalbumarray.length; i++) {
//			
//		//	artistalbumarray[i] = artistalbum.get(i); 
//			System.out.println(artistalbumarray[i].name);
//			for (int j = 1; j < artistalbumarray.length; j++) {
//				System.out.println("\t" + artistalbumarray[j]);
//			}
//		}
		//	ArrayList<ArtistAlbum> p = artistalbum;

	}

}
