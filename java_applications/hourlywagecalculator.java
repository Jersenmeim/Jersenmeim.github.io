package week04;
import java.util.Scanner;
//Jersen Meim
//CIT 260
//
//    1. Tells the user what the program does.
//    2. Prompts the user to enter their first and last name.
//    3. Gets the user's input and saves it as a String.
//    4. Prompts the user to enter the number of hours they worked this week.
//    5. Gets the user's input and saves it.
//    6. Prompts the user to enter their hourly wage.
//    7. Get's the user's input and saves it.
//    8. Calculates the state withholding tax (0.09%) and the federal withholding tax (0.20%).
//    9. Calculates your gross pay and your pay after subtracting the withholding taxes.
//    10.Outputs a pay statement as shown in the example below.
//    11.Outputs a goodbye message.

//    Here is an example of what your program should look like when it runs (user input is in green):

//    Given your name, hours worked, and hourly wage, this program calculates your
//    gross pay, state withholding tax, federal withholding tax, and your net pay.
//    It then displays your pay stub.
//    Enter your first and last name: John Brown
//    Enter the hours you worked this week: 10.0
//    Enter your hourly wage: 9.75

//    Pay Stub for John Brown
//    Hours Worked: 10
//    Hourly Wage: $9.75
//    Gross Pay: $97.50
//    State Tax Withheld: $8.78
//    Federal Tax Withheld: $19.50
//    Net Pay: $69.23

//    Goodbye.

public class W4dot2 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your \n" +
                "gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                "It then displays your pay stub.");
        System.out.print("Enter your first and last name: ");
        String name = input.nextLine();
        System.out.print("Enter the hours you worked this week:");
        double hours = input.nextDouble();
        System.out.print("Enter your hourly wage:");
        double hourlyWage = input.nextDouble();

        //Calculation for gross pay
        final double GROSS_PAY = hourlyWage * hours;
        //Use Math.nextUp() to returns the floating-point value adjacent to the parameter
        // provided in the direction of positive infinity.
        final double STATE_TAX_WITHHELD = Math.nextUp(GROSS_PAY * (0.0009 * 100.0)) ;
        final double FEDERAL_TAX_WITHHELD = GROSS_PAY * (0.002 * 100.0);
        final double NET_PAY = GROSS_PAY - (STATE_TAX_WITHHELD + FEDERAL_TAX_WITHHELD) ;
        final String LAST_MESSAGE = ("\n" + "Goodbye");



        System.out.println("\n" + "Pay Stub for " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.printf("Hourly Wage: " + "$%.2f" + "\n" , hourlyWage);
        System.out.printf("Gross Pay: "+ "$%.2f" + "\n" , GROSS_PAY );
        System.out.printf("State Tax Withheld: " + "$%.2f" + "\n" , STATE_TAX_WITHHELD);
        System.out.printf("Federal Tax Withheld: " + "$%.2f" + "\n" , FEDERAL_TAX_WITHHELD);
        System.out.printf("Net Pay: " + "$%.2f" + "\n" , NET_PAY);
        System.out.println(LAST_MESSAGE);



    }
}


