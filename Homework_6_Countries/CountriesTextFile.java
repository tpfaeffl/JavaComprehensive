package Homework_6_Countries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CountriesTextFile {
	public ArrayList<String> countriesArray = new ArrayList<String>();
	public static PrintWriter out;
	public static FileReader in;
	
	public CountriesTextFile() {
		
		
	}

	public ArrayList<String> getCountries(){
		
		String dirString = "C:/Users/silve/eclipse-workspace/JavaComp_Homework/src/Homework_6_Countries";
		Path dirPath = Paths.get(dirString);
		
		if(Files.notExists(dirPath))
		{
			try {
				Files.createDirectories(dirPath);
			} // end of try 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // end of catch
		} // end of if
		
		String fileString = "countries.txt";
		Path filePath = Paths.get(dirString, fileString);
	if (Files.exists(filePath)) {
		
		File countryFile = filePath.toFile();
		try (BufferedReader in = new BufferedReader (new FileReader(countryFile)))
		{
			String line = in.readLine();
			countriesArray.add(line);
			while (line !=null) {
				
				line = in.readLine();
				if (line != null) {
				countriesArray.add(line);
				}
			} // end of if
		} // end of try
		catch (IOException e) {
			System.out.println(e);
		} // end of catch
	}
		else {
			System.out.println(filePath.toAbsolutePath() + " doesn't exist. ");
		}
	return countriesArray;
	}	
	

		public boolean saveCountries(ArrayList<String> countries) {
			String dirString = "C:/Users/silve/eclipse-workspace/JavaComp_Homework/src/Homework_6_Countries";
			Path dirPath = Paths.get(dirString);
			if(Files.notExists(dirPath))
			{
				try {
					Files.createDirectories(dirPath);
				} // end of try 
				catch (IOException e) {
					System.out.println("File does not exist");
					e.printStackTrace();
				} // end of catch
			} // end of if
			
			String fileString = "countries.txt";
			Path filePath = Paths.get(dirString, fileString);
			if (Files.exists(filePath)) {
				
				File countryFile = filePath.toFile();
			
				try {
					out = new PrintWriter(new BufferedWriter(new FileWriter(countryFile)));
				} catch (IOException e) {
					System.out.println("Cant get Filewriter object");
					e.printStackTrace();
				}  // end of catch
			} // end of if
			
			for (String s: countries) {
			
				out.print(s + "\n");
			}
			out.close();
			return true;
						} // end of method
	
}
