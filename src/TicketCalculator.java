public class TicketCalculator {
    private static final double USUAL_DISCOUNT = 0.8;
    private static final double VIP_DISCOUNT = 0.5;
    private static final double CHILD_DISCOUNT = 0.5;
    private static final double SENIOR_DISCOUNT = 0.7;
    private static final int CHILD_AGE_LIMIT = 7;
    private static final int SENIOR_AGE_LIMIT = 60;

    public double calculateTotal(double basePrice, int count) {
        if (count <= 0) {
            return 0;
        }
        return basePrice * count;
    }

    // Знижка за промокод
    public double calculateTotal(double basePrice, int count, String promoCode) {
        double total = basePrice * count;

        if (promoCode != null && promoCode.trim().equalsIgnoreCase("Usual-20")) {
            total = total * USUAL_DISCOUNT;
        } else if (promoCode != null && promoCode.trim().equalsIgnoreCase("VIP-50")) {
            total = total * VIP_DISCOUNT;
        }

        return total;
    }

    // Розрахунок з урахуванням віку
    public double calculateTotal(double basePrice, int[] visitorAges) {
        double total = 0;

        for (int age : visitorAges) {
            if (age < CHILD_AGE_LIMIT) {
                total += basePrice * CHILD_DISCOUNT;
            } else if (age > SENIOR_AGE_LIMIT) {
                total += basePrice * SENIOR_DISCOUNT;
            } else {
                total += basePrice;
            }
        }

        return total;
    }
}