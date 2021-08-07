package week06;

/*
Jersen Meim
CIT 260 - 6
Write a short Java program that contains the following two methods:

public static double celsiusToFahrenheit(double tempCelsius)

public static double fahrenheitToCelsius(double tempFahrenheit)

        Your program should

        Tell the user what the program does.
        Invoke the above two methods to compute and display the table below.
        Output a goodbye message.

        Celsius        Fahrenheit     |    Fahrenheit     Celsius
        ----------------------------------------------------------
        40.0           104.0          |    120.0          48.89
        39.0           102.2          |    110.0          43.33
        38.0           100.4          |    100.0          37.78
        37.0            98.6          |    90.0           32.22
        36.0            96.8          |    80.0           26.67
        35.0            95.0          |    70.0           21.11
        34.0            93.2          |    60.0           15.56
        33.0            91.4          |    50.0           10.00
        32.0            89.6          |    40.0            4.44
        31.0            87.8          |    30.0           -1.11

*/
public class W6dot2 {

    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit      |     Fahrenheit     Celsius\n" +
                        "----------------------------------------------------------");
        /*
        i = 40 (initial counting for celsius)
        j = 120 (initial counting for fahrenheit)

        i >= 31.0 (loop continuation for Celsius)
        j >= 30.0 (loop continuation for fahrenheit)

        i--, j -= 10 (Update counter for fahrenheit)
         */
       for (double i = 40.0, j = 120.0; i >= 31.0 && j >= 30.0; i--, j -= 10) {
           //Rules start with the ‘%' character.
           //use -12, -15, -7 to specify a width:
           //use .1f and .2f to generate decimal places (formats the floating-point numbers):
           System.out.printf("%-12.1f ", i);
           System.out.printf("%-15.1f|", celsiusToFahrenheit(i));
           System.out.printf("     %-15.1f", j);
           System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(j));
        }
        System.out.println("\n" + "Goodbye");
    }



    public static double celsiusToFahrenheit(double tempCelsius){
        //formula for the conversion of Celsius to fahrenheit
        return tempCelsius * (9.0/5.0) + 32;

    }

    public static double fahrenheitToCelsius(double tempFahrenheit){
        //formula for the conversion of fahrenheit to Celsius
        return (5.0/9.0)*(tempFahrenheit - 32);
    }

}

