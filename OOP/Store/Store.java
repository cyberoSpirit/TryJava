package Store;

import java.util.ArrayList;
import java.util.List;

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
    }

    public Movie getMovie(int index) {
        if (index >= 0 && index < this.movies.size()) {
            return new Movie(this.movies.get(index));
        }
        throw new IndexOutOfBoundsException();
    }

    public void setMovie(int index, Movie movie) {
        if (index >= 0 && index < this.movies.size()) {
            this.movies.set(index, new Movie(movie));
        } else {
            throw new IndexOutOfBoundsException();
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

}
