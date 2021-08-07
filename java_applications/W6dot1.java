package week06;

/* Jersen Meim
   CIT 260 - 6
Tells the user what the program does.
Prompts the user to an investment amount, for example, 1000.
Gets the user's input and saves it. The user's input must be a positive, non-zero value.
Prompts the user to enter an annual interest rate, for example, 9%.
Gets the user's input and saves it. The user's input must be positive and less than 100.
Using a method that you have written, calculate and display the future value of the investment
for a period of 10 years. The formula for computing the future value of an investment is

futureValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears * 12

The method header for your method should look like this:

public static double futureValue(double investmentAmount, double monthlyInterestRate, int years)

Here is an example of what your program should look like when it runs (user input is in green):

Given an investment amount and an annual interest rate, this program
will calculate the future value of the investment for a period of
ten years.

Enter the a positive, non-zero value for the investment: 1000
Enter an annual interest rate, between 0 and 100: 9

Years   Future Value
1       $1093.81
2       $1196.41
3       $1308.65
4       $1431.41
5       $1565.68
6       $1712.55
7       $1873.20
8       $2048.92
9       $2241.12
10      $2451.36

Goodbye ...*/
import java.util.Scanner;
public class W6dot1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_YEARS = 10;

        System.out.print("\nEnter the a positive, non-zero value for the investment: ");
        double amount = input.nextDouble();
        System.out.print("Enter an annual interest rate, between 0 and 100: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        //condition for negative numbers in investment input
        if (amount <= 0){
            System.out.println("\n" + "Please enter a positive, non-zero for the investment");
            System.out.println("\n" + "Goodbye...");
        }
        //condition for values less than 0 and values greater than 100 in annual interest input
        else if ((annualInterestRate > 100) || (annualInterestRate < 0) ){
            System.out.println("\n" + "Annual interest rate should between 0 and 100 only");
            System.out.println("\n" + "Goodbye...");
        }
        else {
            System.out.println( "\n" + "Years     Future Value"); // Create Table
            for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
                //Rules start with the ‘%' character.
                //use -10 and 5 to specify a width:
                //use .2f to generate decimal places (formats the floating-point numbers):
                System.out.printf("%-10d", years); // output the counted years
                System.out.printf("%5.2f\n",
                        futureValue(amount, monthlyInterestRate, years)); // output the future Value per
                // year
            }
            System.out.println("\n" + "Goodbye...");
        }

    }
    public static double futureValue(double investmentAmount,
                                     double monthlyInterestRate, int years){
        //investment amount formula
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

    }
}
