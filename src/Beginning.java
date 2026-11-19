public class Beginning {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Кінопалац Україна", "Майдан Незалежності, 2");
        System.out.println("Кінотеатр: " + cinema.getName());
        System.out.println("Адреса: " + cinema.getAddress());
        System.out.println("===================================");

        MovieFactory factory = new MovieFactory();
        MovieShop shop = new MovieShop(factory);

        Movie shrek = shop.orderMovie("cartoon", "Шрек", 90, 0, "Комедія / Фентезі", 100, "DreamWorks");
        Movie priceOfEscape = shop.orderMovie("series", "Ціна втечі", 45, 16, "Мелодрама", 159, "1");
        Movie twilight = shop.orderMovie("series", "Сутінки", 122, 16, "Фентезі / Мелодрама", 250, "1");
        Movie avatarTrailer = shop.orderMovie("trailer", "Трейлер Аватар 3", 3, 12, "Фантастика", 0, "Аватар 3");

        shrek.movieDetails();
        System.out.println("-----------------------------------");

        priceOfEscape.movieDetails();
        System.out.println("-----------------------------------");

        twilight.movieDetails();
        System.out.println("-----------------------------------");

        avatarTrailer.movieDetails();
        System.out.println("-----------------------------------");

        if (avatarTrailer instanceof Trailer trailer) {
            System.out.println("Назва класу (інтерфейс Nameable): " + trailer.getClassName());
            trailer.playInfo();
        }
    }
}