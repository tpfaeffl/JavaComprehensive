package Homework_8_Actors;

import java.util.ArrayList;



public class ActorApp {
	static ArrayList<Actor> myReturnedList = null;
	public static void main(String[] args) {
		
		
		myReturnedList = ReadData.getTextData("imdb.tsv");

	}

}
