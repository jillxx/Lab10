package com.movie.gc;

import java.util.ArrayList;

public class Movie {

	private String title;
	private String category;

	public Movie(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int compareToIgnoreCase(String input) {
		int titleCompare = getTitle().compareTo(input);
		if (titleCompare != 0) {
			return titleCompare;
		} else {
			return category.compareToIgnoreCase(input);
		}
	}

	 @Override
	 public String toString() {
	 return "Movie [title=" + title + ", category=" + category + "]";
	 }

}
