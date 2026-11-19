public class MovieShop {
    private final MovieFactory movieFactory;

    public MovieShop(MovieFactory movieFactory) {
        this.movieFactory = movieFactory;
    }

    public Movie orderMovie(
            String type,
            String title,
            int duration,
            int ageRestriction,
            String genre,
            int ticketPrice,
            String extraInfo
    ) {
        return movieFactory.createMovie(type, title, duration, ageRestriction, genre, ticketPrice, extraInfo);
    }
}