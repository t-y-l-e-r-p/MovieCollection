import java.util.ArrayList;

public class MovieCollectionRunner
{
  public static void main(String[] args)
  {
    MovieCollection collection = new MovieCollection("src\\movies_data.csv");
    ArrayList<Movie> movieList = collection.getMovies();
    collection.menu();

  }
}