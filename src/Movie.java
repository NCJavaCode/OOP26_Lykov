public abstract class Movie {
    private static final int DEFAULT_AGE_RESTRICTION = 0;

    private String title;
    private int duration;
    private String genre;
    private int ageRestriction;
    private int ticketPrice;

    public Movie(String title, int duration, int ageRestriction, String genre, int ticketPrice) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        setAgeRestriction(ageRestriction);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        if (ageRestriction == 0 || ageRestriction == 12 || ageRestriction == 16 || ageRestriction == 18) {
            this.ageRestriction = ageRestriction;
        } else {
            System.out.println("Помилка: Неприпустиме вікове обмеження! Встановлено 0+");
            this.ageRestriction = DEFAULT_AGE_RESTRICTION;
        }
    }

    public abstract void movieDetails();
}