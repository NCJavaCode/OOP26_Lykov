public class Series extends Movie {
    private int seasonsCount;

    public Series(String title, int duration, int ageRestriction, String genre, int ticketPrice, int seasonsCount) {
        super(title, duration, ageRestriction, genre, ticketPrice);
        this.seasonsCount = seasonsCount;
    }

    public int getSeasonsCount() {
        return seasonsCount;
    }

    public void setSeasonsCount(int seasonsCount) {
        this.seasonsCount = seasonsCount;
    }

    @Override
    public void movieDetails() {
        System.out.println("Серіал: " + getTitle());
        System.out.println("Жанр: " + getGenre());
        System.out.println("Тривалість: " + getDuration());
        System.out.println("Вік: " + getAgeRestriction());
        System.out.println("Сезонів: " + seasonsCount);
        System.out.println("Ціна: " + getTicketPrice());
    }
}