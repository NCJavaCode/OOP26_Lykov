public class Beginning {
    public static void main(String[] args) {
        //Створюємо кінотеатр
        Cinema cinema = new Cinema("Кінопалац Україна", "Майдан Незалежності, 2");

        System.out.println("Кінотеатр: " + cinema.getName());
        System.out.println("Адреса: " + cinema.getAddress());
        System.out.println("===================================");

        Movie shrek = new Cartoon("Шрек", 90, 0, "Комедія / Фентезі", 100, "DreamWorks");
        Movie priceOfEscape = new Series("Ціна втечі", 45, 16, "Мелодрама", 159, 1);
        Movie twilight = new Series("Сутінки", 122, 16, "Фентезі / Мелодрама", 250, 1);

        //Виводимо інормаццію
        shrek.movieDetails();
        System.out.println("-----------------------------------"); // Перший Відступ, щоб не була каша

        priceOfEscape.movieDetails();
        System.out.println("-----------------------------------");// Другий відступ, щоб не була каша

        twilight.movieDetails();
    }
}