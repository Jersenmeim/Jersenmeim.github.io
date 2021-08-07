
package week02;
import java.util.Scanner;
public class GetFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //title of the program
        System.out.println("This program converts a temperature in degrees Celsius into" +
                " a temperature in degrees Fahrenheit.");
        System.out.print("Enter a temperature in degrees Celsius: ");
        //conversion to farenheit
        double celcius = input.nextDouble();
        //System.out.printf("%.2f ", celcius);
        final String LAST_MESSAGE = ("\n"+ "Goodbye.");
        final double FARENHEIT = ( (9.0/5.0) * celcius + 32);



        System.out.printf("\n" + "%.2f" + " degrees Celsius is equal to %.2f "+ "degrees Fahrenheit."
                        + LAST_MESSAGE, celcius, FARENHEIT
        );
    }
}
