public class Movie {
    // Приватні поля
    private String title;
    private int duration; // У хвилинах
    private int ageRestriction; // Вікове обмеження(0, 12, 16, 18)

    // Конструктор
    public Movie(String title, int duration, int ageRestriction) {
        this.title = title;
        this.duration = duration;
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
}
