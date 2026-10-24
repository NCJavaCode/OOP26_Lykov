public class Beginning {
    public static void main(String[] args) {
        //Створюємо кінотеатр
        Cinema cinema = new Cinema("Кінопалац Україна", "Майдан Незалежності, 2");

        System.out.println("Кінотеатр: " + cinema.getName());
        System.out.println("Адреса: " + cinema.getAddress());
        System.out.println("===================================");// Перший Відступ, щоб не була каша

        Movie shrek = new Cartoon("Шрек", 90, 0, "Комедія / Фентезі", 100, "DreamWorks");
        Movie priceOfEscape = new Series("Ціна втечі", 45, 16, "Мелодрама", 159, 1);
        Movie twilight = new Series("Сутінки", 122, 16, "Фентезі / Мелодрама", 250, 1);

        Trailer avatarTrailer = new Trailer("Трейлер Аватар 3", 3, 12, "Фантастика", "Аватар 3");

        //Виводимо інормаццію
        shrek.movieDetails();
        System.out.println("-----------------------------------"); // Другий Відступ

        priceOfEscape.movieDetails();
        System.out.println("-----------------------------------");// Третій відступ

        twilight.movieDetails();
        System.out.println("-----------------------------------");// Четвертий відступ

        // Виводимо трейлер
        avatarTrailer.movieDetails();
        System.out.println("-----------------------------------");

        System.out.println("Назва класу (інтерфейс Nameable): " + avatarTrailer.getClassName());
        avatarTrailer.playInfo(); // Виклик методу з інтерфейсу Playable
    }
}