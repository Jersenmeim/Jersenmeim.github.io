package week02;
import java.util.Scanner;
public class BillStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //title of the program
        System.out.println("Given the price of a meal and a percentage to use for the tip, \n" +
                "this program calculates the tip, the tax, and the total amount of the bill.");
        System.out.print("Enter the cost of the meal:");
        double cost = input.nextDouble();
        System.out.print("Enter the tip percentage:");
        final String LAST_MESSAGE = ("\n"+ "Goodbye.");
        double tip = input.nextDouble();
        //Calculation to determine the total tip
        final double TOTAL_TIP = Math.round((cost * tip / 100) * 100)/ 100.0;
        //Calculation to determine the total tax and bill
        final double TAX = (cost * 3.2) / 100;
        final double TOTAL_BILL = cost + TAX + TOTAL_TIP;

        System.out.printf("\n" + "The tip is " + "$%.2f", TOTAL_TIP);
        System.out.printf("\n" + "The tax is " + "$%.2f", TAX);
        System.out.printf("\n" + "The total bill is " + "$%.2f" + LAST_MESSAGE, TOTAL_BILL);
    }
}
