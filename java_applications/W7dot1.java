package week07;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
/*

Jersen Meim
CIT 260-6

Write a method that calculates and returns the average value for an array of doubles. The method header will look like the following:

    public static double average(double[ ] array)

Then write a main( ) method that does the following:

    Tells the user what the program does.
    Prompts the user to enter 5 double values.
    Stores these values in an array.
    Calls the average method you wrote to calculate and return the average value of the numbers in the array.
    Displays the average value, with two digits after the decimal point.
    Displays a goodbye message.

The following example shows you what your program should look like when it runs (user input is in green):

This program calculates the average of five numbers.
Please enter a number: 5.3
Please enter a number: 6.2
Please enter a number: 12.1
Please enter a number: 8.6
Please enter a number: 7.8
The average of these five numbers is 8
Goodbye ...

*/
public class W7dot1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program calculates the average of five numbers. ");
        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Please enter a number: ");
            numbers[i] = scan.nextDouble();
        }

        //format number to remove zeroes if answer is a integer
        DecimalFormat df = new DecimalFormat("0.##");
        //Rounding mode to round towards zero.
        df.setRoundingMode(RoundingMode.DOWN);
        //Output average
        System.out.println( "The average of these five numbers is: " + df.format(average(numbers)));
        System.out.println("Goodbye ...");

    }
    public static double average(double[ ] array){

        //formula to calculate sum and average of array list
        double sum = 0.0;
        for (double numbers : array)
            sum += numbers;
        //return of the values calculated
        return sum / array.length;

    }
}

