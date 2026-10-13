public class TicketCalculator {

    public double calculateTotal(double basePrice, int count) {
        if (count <= 0) return 0;
        return basePrice * count;
    }

    // Рахуємо з урахуванням знижки за промокод
    public double calculateTotal(double basePrice, int count, String promoCode) {
        double total = basePrice * count;

        if (promoCode != null && promoCode.trim().equalsIgnoreCase("Usual-20")) {
            total = total * 0.8; // знижка 20%
        } else if (promoCode != null && promoCode.trim().equalsIgnoreCase("VIP-50")) {
            total = total * 0.5; // знижка 50%
        }

        return total;
    }

    // 3. Розрахунок для великого замовлення
    public double calculateTotal(double basePrice, int[] visitorAges) {
        double total = 0;
        for (int age : visitorAges) {
            if (age < 7) {
                // Дітям до 7 років знижка 50%
                total += basePrice * 0.5;
            } else if (age > 60) {
                // Пенсіонерам знижка 30%
                total += basePrice * 0.7;
            } else {
                total += basePrice;
            }
        }
        return total;
    }
}