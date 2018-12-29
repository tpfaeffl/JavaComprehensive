package Homework_8_Actors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;





public class ReadData {
	public static int actorCount;
	
	
	public static ArrayList<Actor> getTextData(String source){
		
		Actor a = null;
		ArrayList<Actor> list = new ArrayList<>();
		String [] columns = null;
		String line = null;


//			source = "imdb.tsv";
			String fileString = source;
			Path filePath = Paths.get(fileString);
		if (Files.exists(filePath)) {
			
			File textFile = filePath.toFile();
			try (BufferedReader in = new BufferedReader (new FileReader(textFile)))
			{
				line = in.readLine();
				while (line !=null) {
				
				columns = line.split("\t+");
				String actor = columns[0];
				String movie = columns[1];
				String year = columns[2];
				System.out.println("Actor:  " + actor + " Movie: " + movie + " Year: " + year);

				a = new Actor (actor, movie, Integer.parseInt(year));
				list.add(a);
				actorCount = list.size();
				line = in.readLine();
				} // end of while
			} // end of try
			catch (IOException e) {
				System.out.println(e);
			} // end of catch
		}  // end of if
			else {
				System.out.println(filePath.toAbsolutePath() + " doesn't exist. ");
			}
		return list;
		}

}
