public class MainApp {
    public static void main(String[] args) {
        TicketCalculator calc = new TicketCalculator();

        double standardPrice = 200.0;

        double total1 = calc.calculateTotal(standardPrice, 3);
        System.out.println("Загальна сума за 3 квитки: " + total1 + " грн");

        double total2 = calc.calculateTotal(standardPrice, 2, "STUDENT20");
        System.out.println("Сума за 2 квитки з промокодом: " + total2 + " грн");

        int[] ages = {5, 25, 65, 18}; // дитина, двоє дорослих, пенсіонер
        double total3 = calc.calculateTotal(standardPrice, ages);
        System.out.println("Сума для сімейної компанії (з урахуванням віку): " + total3 + " грн");
    }
}