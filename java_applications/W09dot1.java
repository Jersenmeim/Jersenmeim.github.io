/*

    1.Tells the user what the program does.
    2. Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
    3. Prompts the user to enter the x and y coordinates of a point.
    4. Saves the users input.
    5. Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the point at the x and y coordinates entered by the user. The distance is displayed with two digits after the decimal point.
    6. Uses the parameterized constructor to create a MyPoint object p2 using the x coordinate and y coordinate entered  by the user.
    7. Uses the second and third distance method to calculate and display the distance between the MyPoint object p1 and the MyPoint object p2.  The distance is displayed with two digits after the decimal point.
    8. Displays a goodbye message.

    The example below show what your program should look like when it runs (user input is in green).

    This program creates a point at (0,0) and a point at the coordinates
    entered by you. It then computes and displays the distance from (0,0)
    to the point defined by you, using three different methods.
    Enter the x coordinate of a point: 3
    Enter the y coordinate of a point: 4
    Using method 1, the distance from (0,0) to (3,4) is 5.00
    Using method 2, the distance from (0,0) to (3,4) is 5.00
    Using method 3, the distance from (0,0) to (3,4) is 5.00
    Goodbye...

 */

package week09;
import java.text.DecimalFormat;
import java.util.Scanner;

public class W09dot1 {

    public static void main(String[] args) {

        MyPoint point = new MyPoint();
        Scanner input = new Scanner(System.in);
        System.out.println("This program creates a point at (0,0) and a point at the coordinates \n" +
                "entered by you. It then computes and displays the distance from (0,0)\n" +
                "to the point defined by you, using three different methods.");
        //Used Setter to Generate x and y values
        System.out.print("Enter the x coordinate of a point:");
        point.setX(input.nextDouble());
        System.out.print("Enter the y coordinate of a point:");
        point.setY(input.nextDouble());
        MyPoint p1 = new MyPoint();
        DecimalFormat df = new DecimalFormat("0.##");
        double x = (point.getX());
        double y = (point.getY());

        //Used Getter to output the input values
        //used format to remove zeroes when the user input a 1 digit integer
        //Method 1 Calculation
        System.out.printf("Using method 1, the distance from (0,0) to (" +  df.format(x) +  "," +  df.format(y) + ") " +
                        "is %.2f\n" ,p1.distance(x,y));
        //Method 2 Calculation
        MyPoint pointA = new  MyPoint (0,0);
        MyPoint pointB = new  MyPoint (x,y);
        double Result = pointA.distance(pointB);
        System.out.printf("Using method 2, the distance from (0,0) to (" +  df.format(x)+  "," +
                df.format(y) + ") is %.2f\n" ,Result);
        //Method 3 Calculation
        MyPoint mp1 = new  MyPoint (x , y);
        MyPoint mp2 = new  MyPoint (0 , 0);
        mp1.distance(mp2);
        System.out.printf("Using method 3, the distance from (0,0) to (" +  df.format(x)+  ","
                       + df.format(y) + ") is %.2f\n", MyPoint.distance(mp1,mp2));
        System.out.println("Goodbye...");
    }
}
