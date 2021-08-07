package week05;
/*Jersen Meim
CIT 260
Spring 2020
Tells the user what the program does.
Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.  The numbers will be separated by exactly one space and there will 10 numbers per line.
Displays a goodbye message.
Your output should look like the following:
This program displays all of the numbers from 100 to 1000
that are divisible by both 5 and 6.
120 150 180 210 240 270 300 330 360 390
420 450 480 510 540 570 600 630 660 690
720 750 780 810 840 870 900 930 960 990
Goodbye */
public class W5dot2 {
    public static void main(String[] args) {
        System.out.println("This Program displays all of the number from 100 to 1000" +
                "\nthat are divisible by both 5 and 6." + "\n");

        int count = 0;
        final int OUTPUT_PER_LINE = 10;	//Displays Number of Output Per Line
        // Range of Values to Compute; 100 to 1000
        for (int i = 100; i <= 1000; i++) {
            // Check if the number is divisible by 5 and 6
            if (i % 5 == 0 && i % 6 == 0) {
                count++;
                if (count % OUTPUT_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
        System.out.print("\n" + "Goodbye.");

    }
}
