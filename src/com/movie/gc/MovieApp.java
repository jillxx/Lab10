package com.movie.gc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String cont = "y";

		// creating a movie list with 100 movies
		ArrayList<Movie> movieList = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			MovieIO.getMovie(i);
			movieList.add(MovieIO.getMovie(i));
		}

		// select program start point
		System.out.println(
				"Welcome to the Movie List Application!\n\nThere are " + movieList.size() + " movies in this list.");
		while (cont.equalsIgnoreCase("y")) {
			// prompt the user to chose categories
			System.out.println("There are four Categories list: \n1.horror\n2.scifi\n3.drama\n4.animated");

			// validate entry
			int input = Validator.getInt(scnr, "What category are you interested in? Enter 1-4: ", 1, 4);

			// call method to match category with entered number.
			String choice = choice(input);
			System.out.println("The "+ choice +" category includ: ");

			// creating a movie arraylist include movies in the entered category
			ArrayList<String> matchedList = new ArrayList<>();

			for (Movie movie : movieList) {
				if (movie.getCategory().equalsIgnoreCase(choice)) {
					matchedList.add(movie.getTitle());
				}
			}

			// sort the list in alphabetical order
			Collections.sort(matchedList);

			// display the movies in the chosen category
			for (int i = 0; i < matchedList.size(); i++) {
				System.out.println(matchedList.get(i));
			}

			// asking user if they want to continue
			cont = Validator.getString(scnr, "Continue? (y/n): ");
			System.out.println();// adding a space

		}

		System.out.println("Good bye!");
		scnr.close();
	}

	// method to match entered number with category
	public static String choice(int input) {
		String choice = "";
		switch (input) {
		case 1:
			choice = "horror";
			break;
		case 2:
			choice = "scifi";
			break;
		case 3:
			choice = "drama";
			break;
		case 4:
			choice = "animated";
			break;
		}
		return choice;

	}

}
