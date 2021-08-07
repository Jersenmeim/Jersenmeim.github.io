package week07;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
Jersen Meim
CIT 260-6
Now write a main( ) method that does the following:

    Tells the use what the program does.
    Prompts the user to enter five numbers.
    Saves the user's input in an array of doubles.
    Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
    Displays the mean and the standard deviation with 2 digits after the decimal point.
    Displays a goodbye message.

The following example show you what your program should look like when it runs (user input is green):

This program computes the mean and the standard deviation for a set of numbers.
Enter a number: 3.5
Enter a number: 4
Enter a number: 6.1
Enter a number: 6
Enter a number: 7.5

The mean of this set of numbers is 5.42
The standard deviation is 1.65
Goodbye ...
*/

public class W7dot2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This program computes the mean and the standard deviation for a set of " +
                "numbers.");
        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");
            numbers[i] = scan.nextDouble();
        }

        //format number to remove zeroes if answer is a integer
        DecimalFormat df = new DecimalFormat("0.##");

        //Rounding mode to round towards zero.
        df.setRoundingMode(RoundingMode.DOWN);
        //Rounding mode to round away from zero.

        //Output mean
        System.out.println("The mean of this set of numbers is " + df.format(mean(numbers)));
        //Output Standard Deviation
        deviation(numbers);

        System.out.println("Goodbye ...");



    }


    public static double mean(double[] x) {
        double sum = 0.0;
        //mean formula
        for (double numbers : x)
            sum += numbers;
        //return of the values calculated
        return sum / x.length;
    }

    public static void deviation(double[] x) {

        //Standard Deviation formula
        double deviation = 0;
        double mean = mean(x);
        for (double e: x) {
            deviation += Math.pow(e - mean, 2);
        }
        //return of the values calculated
        DecimalFormat dv = new DecimalFormat("0.##");
        dv.setRoundingMode(RoundingMode.UP);
        System.out.println("The standard deviation is " + dv.format(Math.sqrt(deviation / (x.length - 1))));

    }
}