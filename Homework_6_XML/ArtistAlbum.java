package Homework_6_XML;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;


public class ArtistAlbum {
	
	public static ArrayList<ArtistAlbum> artistalbum = null;
    public   String name;
    public    String album;

	public ArtistAlbum() {
//	this.name = name;
//	album = album;
	}
	
	public  ArrayList<ArtistAlbum> getArtistAlbum(){
	XMLInputFactory inputFactory = XMLInputFactory.newFactory();
	try {
		FileReader fileReader = new FileReader("music_artists.xml");
		XMLStreamReader reader = inputFactory.createXMLStreamReader(fileReader);
		ArtistAlbum a = null;
		artistalbum= new ArrayList<ArtistAlbum>();
		 while (reader.hasNext())
         {
			 int eventType = reader.getEventType();
             switch (eventType)
             {
             case XMLStreamConstants.START_ELEMENT:
                 String elementName = reader.getLocalName();
                 if (elementName.equals("Artist"))
                 {
                     a = new ArtistAlbum();
                  //   String name = reader.getAttributeValue(0);
                  //   a.setName(name);
                 }
                 if (elementName.equals("Name")) {
                	 String name =reader.getElementText();
                	 a.setName(name);
                 }
                 if (elementName.equals("Album")) {
                	 
                	 String album = reader.getElementText();
                     a.setAlbum(album);
                 }
             	break;
     		case XMLStreamConstants.END_ELEMENT:
     			elementName = reader.getLocalName();
     				if (elementName.equals("Artist"))
     				{
     					artistalbum.add(a);
     				}
     				break;
     		default:
     			break;
             } // end of switch
             reader.next();
         } // end of while     
	}// end of try
	catch(IOException | XMLStreamException e)
	{
	System.out.println(e);
	}
	
	return artistalbum;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName(String s){
		return name;
	}
	
	public void setAlbum(String album) {
		this.album += album + "\n";
		
	}
	
	public String getAlbum() {
		return album;
	}
	

	
	
 
}
