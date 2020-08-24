public class CreditPaymentService {

    public double calculate (int creditSum , float percentMonth , int creditPeriod) {

        double coefficient = 1 + percentMonth;
        System.out.println(coefficient);

     double coefficientInGrade = Math.pow(coefficient , creditPeriod);
        System.out.println(coefficientInGrade);


     double monthPayment = (creditSum * ((percentMonth * coefficientInGrade) / (coefficientInGrade - 1)));

     return monthPayment;



    }
}
