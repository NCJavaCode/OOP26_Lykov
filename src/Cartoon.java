public class Cartoon extends Movie {
    private String studioName;

    public Cartoon(String title, int duration, int ageRestriction, String genre, int ticketPrice, String studioName) {
        super(title, duration, ageRestriction, genre, ticketPrice);
        this.studioName = studioName;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    @Override
    public void movieDetails() {
        System.out.println("Мультік: " + getTitle());
        System.out.println("Жанр: " + getGenre());
        System.out.println("Тривалість: " + getDuration());
        System.out.println("Вік: " + getAgeRestriction());
        System.out.println("Студія: " + studioName);
        System.out.println("Ціна: " + getTicketPrice());
    }
}