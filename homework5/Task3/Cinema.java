package homework5.Task3;

import java.util.*;

public final class Cinema {
    private HashMap<Integer, HashSet<Movie>> someMap;

    public Cinema(HashMap<Integer, HashSet<Movie>> someMap) {
        this.someMap = someMap;
    }

    public void addNewMovies(Movie... movies) {
        for (Movie movie : movies) {
            int year = movie.getYear();
            if (this.someMap.get(year) == null) {
                this.someMap.put(year, new HashSet<>());
                this.someMap.get(year).add(movie);
            } else {
                this.someMap.get(year).add(movie);
            }
        }
    }

    public void getMoviesByYear(int year) {
        HashSet<Movie> movies = this.getSomeMap().get(year);
        StringBuilder stringBuilder = new StringBuilder();
        for (Movie movie : movies) {
            stringBuilder.append(movie.getIdentifier()).append(" | ").append(movie.getGenre()).append(" | ").append(movie.getRating()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public void getMoviesByYearAndMonth(int year, Month month) {
        HashSet<Movie> moviesByYear = this.getSomeMap().get(year);
        HashSet<Movie> moviesByMonth = new HashSet<>();
        for (Movie movie : moviesByYear) {
            if (movie.getMonth().equals(month)) {
                moviesByMonth.add(movie);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Movie movie : moviesByMonth) {
            stringBuilder.append(movie.getIdentifier()).append(" | ").append(movie.getGenre()).append(" | ").append(movie.getRating()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public void getMoviesByGenre(Genre genre) {
        var movieLists = this.someMap.values();
        List<Movie> moviesByGenre = new ArrayList<>();
        for (HashSet<Movie> movieList : movieLists) {
            for (Movie movie : movieList) {
                if (movie.getGenre().equals(genre)) {
                    moviesByGenre.add(movie);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Movie movie : moviesByGenre) {
            stringBuilder.append(movie.getIdentifier()).append(" | ").append(movie.getGenre()).append(" | ").append(movie.getRating()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public void getMoviesTopTenDesc() {
        var movieLists = this.someMap.values();
        List<Movie> movies = new ArrayList<>();
        for (HashSet<Movie> movieList : movieLists) {
            for (Movie movie : movieList) {
                movies.add(movie);
            }
        }
        movies.sort(Comparator.comparingDouble(Movie::getRating).reversed());
        StringBuilder stringBuilder = new StringBuilder();
        for (Movie movie : movies) {
            stringBuilder.append(movie.getRating()).append(" | ").append(movie.getIdentifier()).append(" | ").append(movie.getGenre()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public HashMap<Integer, HashSet<Movie>> getSomeMap() {
        return someMap;
    }

    public void setSomeMap(HashMap<Integer, HashSet<Movie>> someMap) {
        this.someMap = someMap;
    }
}
