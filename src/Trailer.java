public class Trailer extends Movie implements Nameable, Playable {
    private String targetMovieTitle;

    // В цьому полі буде зберігатись назва класу
    private String className = "Trailer";

    // Конструктор для трейлера
    public Trailer(String title, int duration, int ageRestriction, String genre, String targetMovieTitle) {
        // Оскільки трейлер безкоштовний, ціну квитка передаємо як 0
        super(title, duration, ageRestriction, genre, 0);
        this.targetMovieTitle = targetMovieTitle;
    }

    public String getTargetMovieTitle() {
        return targetMovieTitle;
    }

    public void setTargetMovieTitle(String targetMovieTitle) {
        this.targetMovieTitle = targetMovieTitle;
    }

    // Цей метод виводить інформацію про трейлер
    @Override
    public void movieDetails() {
        System.out.println("Трейлер: " + getTitle());
        System.out.println("Рекламує фільм: " + targetMovieTitle);
        System.out.println("Тривалість: " + getDuration() + " хв");
        System.out.println("Вікове обмеження: " + getAgeRestriction() + "+");
    }

    // Цей код повертає назву класу для інтерфейсу
    @Override
    public String getClassName() {
        return className;
    }

    // Запуск метода
    @Override
    public void playInfo() {
        System.out.println("Цей код запускає трейлер до фільму: " + targetMovieTitle);
    }
}