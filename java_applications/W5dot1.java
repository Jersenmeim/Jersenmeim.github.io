package week05;
/*Jersen Meim
CIT 260
Spring 2020
Tells the user what the program does.
Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the table below.
Outputs a goodbye message.
kilograms    pounds
---------    ------
 1            2.2
 3            6.6
 5            11.0
 7            15.4
 9            19.8
 11           24.2
 13           28.6
 15           33.0
 */


public class W5dot1 {

    public static void main(String[] args) {
        System.out.println("kilogram Pounds");
        System.out.println("-------- ------");

        int kilogram = 15; final double KG_TO_POUNDS = 2.2;
        for (int i = 1; i <= kilogram; i++) {

            // if the number is not divisible by 2 then it is odd
            if (i % 2 != 0) {
              //  use %-d to add evenly spaces
                System.out.printf ("%-9d%.1f" +"\n", i, (i * KG_TO_POUNDS));
            }


        }
        System.out.print("\n" + "Goodbye.");
    }
}
