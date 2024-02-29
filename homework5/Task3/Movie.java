package homework5.Task3;

import java.util.Objects;

public final class Movie {
    private final int identifier;
    private final int year;
    private final Month month;
    private final Genre genre;
    private final double rating;

    public Movie(int identifier, int year, Month month, Genre genre, double rating) {
        this.identifier = identifier;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return identifier == movie.identifier && year == movie.year && Double.compare(rating, movie.rating) == 0 && month == movie.month && genre == movie.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, year, month, genre, rating);
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

}
