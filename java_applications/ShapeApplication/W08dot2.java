package week08;

/*
Jersen Meim
CIT 260-6
Wrote a short Java program that does the following:

    1. Tells the user what the program does.
    2. Using the Date class (described in section 9.6.1 of the textbook) Create a Date object and
    set it's elapsed time to 10000, 100000, 10000000, 100000000, 1000000000, 10000000000, and
    100000000000 and displays the data and time using the toString( ) method, respectively.
    3. Display a goodbye message.

The following example shows you what your program should look like when it runs: (Values will match the timezone where executed.)

This program uses the Date class to display a set of dates and times.

Wed Dec 31 17:01:40 MST 1969
Wed Dec 31 17:16:40 MST 1969
Wed Dec 31 19:46:40 MST 1969
Thu Jan 01 20:46:40 MST 1970
Mon Jan 12 06:46:40 MST 1970
Sun Apr 26 11:46:40 MST 1970
Sat Sep 28 19:46:40 MST 2001
Goodbye ...
*/

public class W08dot2 {

    public static void main(String[] args)
    {
        java.util.Date date = new java.util.Date();
        System.out.println("This program uses the Date class to display a set of dates and times.");
        //used long array to store long data type values only in Java
        long[] elapsedTime = new long[] {
                10000, 100000, 1000000, 10000000, 100000000, 1000000000,
                10000000000L, 100000000000L
        };
        //used for loop to iterate over all the elements from 0 to length-1
        for (long l : elapsedTime) {
            date.setTime(l);
            //used date.toString method to output a string representing the given date.
            System.out.println(date.toString());
        }
        System.out.println("Goodbye ...");
    }
}
