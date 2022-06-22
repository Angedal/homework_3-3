public class CreditPaymentService {
    public double calculate(double creditAmount, double percent, double monthsNumber) {

        // Формула расчета annuityPayment = creditAmount * (percentAmount / 1 - ((1 + percentAmount) в "-" степени monthsNumber))

        double percentAmount = percent / (100 * 12); // равно 0.01
        double fullPercentAmount = 1 + percentAmount; // равно 1.01
        double annuityPayment = creditAmount * percentAmount / (1 - Math.pow(fullPercentAmount, -monthsNumber));

        return annuityPayment;
    }
}