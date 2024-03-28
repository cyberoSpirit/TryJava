package Store;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoreProcessor {
    private Store store;
    Scanner scanner;

    public void TestStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        this.store = new Store();

        String file = "movies.txt";
        try {
            this.store.loadMovies(file);
        } catch (FileNotFoundException ex) {
            System.out.println("The file " + file + " was not found. Movies will be loaded from backup");
            fillStore();
        }

        this.scanner = new Scanner(System.in);
        getNewRate();
        scanner.close();
    }

    private void fillStore() {
        var movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for (Movie movie : movies) {
            this.store.addMovie(movie); 
        }
    }

    private void getNewRate() {
        String status = "continue";
        String statusExpected = "continue";
        Movie movie;
        while (status.equals(statusExpected)) {
            try {
                int choice = getIndexOfMovie(this.store.getMoviesCount() - 1);
                movie = this.store.getMovie(choice);
                double rating = getRating(movie.getName());
                movie.setRating(rating);
                store.setMovie(choice, movie);
                System.out.println(store);
                System.out.print("To edit another rating, type: '" + statusExpected + "'': ");
                status = scanner.next();
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage() + "Please choose some number within the range.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage() + "Please provide a valid data");
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n" + ex.getStackTrace());
            }
        }
    }

    private int getIndexOfMovie(int max) {
        do {
            System.out.print("\nPlease choose an integer between 0 - " + max + ": ");
            if (this.scanner.hasNextInt()) {
                return this.scanner.nextInt();
            } else {
                this.scanner.next();
            }
        } while (true);
        
    }
    
    private double getRating(String movieName) {
        do {
            System.out.print("Set a new rating for " + movieName + ": ");
            if (this.scanner.hasNextDouble()) {
                return this.scanner.nextDouble();
            } else {
                this.scanner.next();
            }
        } while (true);
    }
}
