/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package labA;

/**
 * Responsibility: Hold information about any ONE movie.
 */
public class Movie {
	private Integer id;
	private String title;
	private String category;
	private String description;
	private Integer year;
	private String rating;
	private boolean blackAndWhite;
	private String origin;
	
	

	public Movie() {
	}

	// Constructor
	public Movie (String t, String c) {
		title = t;
		category = c;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// getter
	public String getTitle() {
		return title;
	}
	
	// getter
	public String getCategory() {
		return category;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	// setter
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isBlackAndWhite() {
		return blackAndWhite;
	}

	public void setBlackAndWhite(boolean blackAndWhite) {
		this.blackAndWhite = blackAndWhite;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}
	
	

}

