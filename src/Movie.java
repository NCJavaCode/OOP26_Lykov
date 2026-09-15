public abstract class Movie {
    // Приватні поля
    private String title; // назва
    private int duration; // У хвилинах
    private String genre;  // жанр фільму
    private int ageRestriction; // Вікове обмеження(0, 12, 16, 18)
    private int ticketPrice; // ціна квитка

    // Конструктор
    public Movie(String title, int duration, int ageRestriction, String genre, int ticketPrice) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        setAgeRestriction(ageRestriction); // Використовуємо сетер із перевіркою

    }
    // гетери та сетери
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

    // Метод із контролем змін
    public void setAgeRestriction(int ageRestriction) {
        if (ageRestriction == 0 || ageRestriction == 12 || ageRestriction == 16 || ageRestriction == 18) { // || - Або
            this.ageRestriction = ageRestriction;
        } else {
            System.out.println("Помилка: Неприпустиме вікове обмеження! Встановлено 0+");
            this.ageRestriction = 0;
        }
    }
    public abstract void movieDetails(); // Абстрактний метод
}
