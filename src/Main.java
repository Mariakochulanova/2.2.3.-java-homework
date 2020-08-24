public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        int creditPeriod = 12;
        int creditSum = 1000_000;
        double percentYear = 9.99;
        float percentMonth = (float) (percentYear / 12 / 100);

        double monthPayment = (int) creditPaymentService.calculate(creditSum , percentMonth , creditPeriod);
        System.out.println(monthPayment);
    }
}
