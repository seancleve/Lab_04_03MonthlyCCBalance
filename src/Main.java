public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000.00;
        double interestRate = 0.17;  

        double firstMonthInterest = balance * interestRate;
        double balanceAfterOneMonth = balance + firstMonthInterest;

        double secondMonthInterest = balanceAfterOneMonth * interestRate;
        double balanceAfterTwoMonths = balanceAfterOneMonth + secondMonthInterest;


        System.out.println("Balance after 1 month: $" + balanceAfterOneMonth);
        System.out.println("Interest due after 1 month: $" + firstMonthInterest);
        System.out.println("Balance after 2 months: $" + balanceAfterTwoMonths);
        System.out.println("Interest due after 2 months: $" + secondMonthInterest);





    }
}