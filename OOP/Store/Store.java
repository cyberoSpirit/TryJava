package Store;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Movie> movies;

    public Store() {
        this.movies = new ArrayList<>();
    }

    public Store(Movie[] movies) {
        this.movies = new ArrayList<>(movies.length);
        for (Movie movie : movies) {
            this.movies.add(new Movie(movie));
        }

        //try overriden equals method of Movie class
        System.out.println(movies[1]);
        System.out.println(this.movies.get(1));
        System.out.println(movies[1].equals(this.movies.get(1)));
        System.out.println(this.movies.contains(movies[1]));
    }

    public Movie getMovie(int index) {
        if (index >= 0 && index < this.movies.size()) {
            return new Movie(this.movies.get(index));
        }
        throw new IndexOutOfBoundsException("Movie index is out of bounds.");
    }

    public void setMovie(int index, Movie movie) {
        if (index >= 0 && index < this.movies.size()) {
            this.movies.set(index, new Movie(movie));
        } else {
            throw new IndexOutOfBoundsException("Movie index is out of bounds.");
        }
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

    public int getMoviesCount() {
        return movies.size();
    }

    public void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        String[] movieInfo;

        while (scanFile.hasNextLine()) {
            movieInfo = scanFile.nextLine().split("--");
            movies.add(new Movie(movieInfo[0], movieInfo[1], Double.parseDouble(movieInfo[2])));
        }
        scanFile.close();
    }

}
