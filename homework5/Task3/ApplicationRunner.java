package homework5.Task3;

import java.util.HashMap;

public class ApplicationRunner {
    public static void main(String[] args) {
        Movie movie01 = new Movie(501, 2001, Month.JANUARY, Genre.ACTION, 8.0);
        Movie movie02 = new Movie(502, 2002, Month.FEBRUARY, Genre.ADVENTURE, 9.0);
        Movie movie03 = new Movie(503, 2002, Month.MARCH, Genre.ANIMATED, 8.5);
        Movie movie04 = new Movie(504, 2003, Month.APRIL, Genre.COMEDY, 7.7);
        Movie movie05 = new Movie(505, 2004, Month.MAY, Genre.DRAMA, 9.5);
        Movie movie06 = new Movie(506, 2005, Month.JUNE, Genre.FANTASY, 8.3);
        Movie movie07 = new Movie(507, 2006, Month.JULY, Genre.HISTORICAL, 7.1);
        Movie movie08 = new Movie(508, 2007, Month.AUGUST, Genre.HORROR, 5.2);
        Movie movie09 = new Movie(509, 2008, Month.SEPTEMBER, Genre.MUSICAL, 6.0);
        Movie movie10 = new Movie(510, 2009, Month.OCTOBER, Genre.NOIR, 6.8);
        Movie movie11 = new Movie(511, 2010, Month.NOVEMBER, Genre.ROMANCE, 7.2);
        Movie movie12 = new Movie(512, 2011, Month.DECEMBER, Genre.SCIENCE_FICTION, 9.4);
        Movie movie13 = new Movie(513, 2012, Month.DECEMBER, Genre.THRILLER, 8.2);
        Movie movie14 = new Movie(514, 2012, Month.DECEMBER, Genre.WESTERN, 8.8);
        Movie movie15 = new Movie(515, 2012, Month.JANUARY, Genre.HISTORICAL, 7.9);
        Movie movie16 = new Movie(515, 2012, Month.JANUARY, Genre.HISTORICAL, 7.9);
        Cinema cinema = new Cinema(new HashMap<>());
        cinema.addNewMovies(movie01, movie02, movie03, movie04, movie05, movie06, movie07);
        cinema.addNewMovies(movie08, movie09, movie10, movie11, movie12, movie13, movie14, movie15, movie16);
        cinema.getMoviesByYear(2002);
        cinema.getMoviesByYearAndMonth(2012, Month.JANUARY);
        cinema.getMoviesByGenre(Genre.HISTORICAL);
        cinema.getMoviesTopTenDesc();
    }

}
