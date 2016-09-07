//Lab 10Teamup by Brent Collins III ad Sadia Noreen

public class Movie {
	

		private String MovieName;
		private String MovieCategory; 

		
		
		public Movie (String MovieName, String MovieCategory) {
			 
		this.MovieName = MovieName;
		this.MovieCategory = MovieCategory;}
		
		public String getName(){
			return MovieName;
		}
		public void setName(String MovieName){
			this.MovieName = MovieName;
		}
		public String getMovieCategory(){
			return MovieCategory;
		}
		public void setMovieCategory(String MovieCategory){
			this.MovieCategory = MovieCategory;
		}
	}


