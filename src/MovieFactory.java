public class MovieFactory {

    // За типом створюємо потрібний підклас Movie і повертаємо його як базовий тип
    public Movie createMovie(
            String type,
            String title,
            int duration,
            int ageRestriction,
            String genre,
            int ticketPrice,
            String extraInfo
    ) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Тип відео не може бути порожнім");
        }

        String normalizedType = type.trim().toLowerCase();

        switch (normalizedType) {
            case "cartoon":
                // Для мультика extraInfo — це назва студії
                String studio = (extraInfo == null || extraInfo.isBlank()) ? "Unknown Studio" : extraInfo;
                return new Cartoon(title, duration, ageRestriction, genre, ticketPrice, studio);

            case "series":
                // Для серіалу перетворюємо extraInfo на кількість сезонів
                int seasons = 1;
                if (extraInfo != null && !extraInfo.isBlank()) {
                    seasons = Integer.parseInt(extraInfo.trim());
                }
                return new Series(title, duration, ageRestriction, genre, ticketPrice, seasons);

            case "trailer":
                // Для трейлера extraInfo — це назва фільму, який рекламуємо
                String targetMovie = (extraInfo == null || extraInfo.isBlank()) ? title : extraInfo;
                return new Trailer(title, duration, ageRestriction, genre, targetMovie);

            default:
                throw new IllegalArgumentException("Невідомий тип відео: " + type);
        }
    }
}