package com.movie.gc;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Movie List Application!\n\nThere are 10 movies in this list.");

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
        
			System.out.print("What category are you interested in? ");

			// creating a movie list
			ArrayList<Movie> movieList = new ArrayList<>();
			for (int i = 1; i <= 100; i++) {
				MovieIO.getMovie(i);
				movieList.add(MovieIO.getMovie(i));
			}

			// creating a movie arraylist include movies in the entered category
			ArrayList<String> matchedList = new ArrayList<>();
			String input = scnr.nextLine();
			for (Movie movie : movieList) {
				if (movie.getCategory().equalsIgnoreCase(input)) {
					matchedList.add(movie.getTitle());
				}
			}

			// display the movies in the chosen category
			for (int i = 0; i < matchedList.size(); i++) {
				System.out.println(matchedList.get(i));
			}

			// asking user if they want to continue
			System.out.print("\nContinue? (y/n): ");
			cont = scnr.nextLine();
			System.out.println();// adding a space

		}
		System.out.println("Good bye!");
		scnr.close();
	}

}
