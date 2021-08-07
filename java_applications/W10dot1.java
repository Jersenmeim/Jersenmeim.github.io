package week10;
/*
In a separate file, write a main( ) method that does the following:

    Tells the user what the program does.
    Prompts the user to enter the values for the sides, color, and filled attribute for three different triangle objects.
    Saves the users input.
    Using the values entered by the user, creates three Triangle objects and stores them in an ArrayList<GeometricObject>.
    Displays the string representation of each Triangle object in the ArrayList, by calling its toString( ) method  and it getArea() method. See the output example below.
    Displays a goodbye message.

The example below show what your program should look like when it runs (user input is in bold).

This program gets input for three triangles from the user.
It then creates three Triangle objects and displays the
description of each.
Enter the color of a triangle (e.g. "red"):
red
Is the triangle filled (y or n):
y
Enter the lengths of the three sides of the triangle:
3 4 5
Enter the color of a triangle (e.g. "red"):
blue
Is the triangle filled (y or n):
n
Enter the lengths of the three sides of the triangle:
1 1 1
Enter the color of a triangle (e.g. "red"):
green
Is the triangle filled (y or n):
y
Enter the lengths of the three sides of the triangle:
6 7 8

Triangle: side1 = 3.0, side2 = 4.0, side 3 = 5.0
created on Wed May 22 07:34:11 MDT 2019
color: red and filled = true
Area = 6.00

Triangle: side1 = 1.0, side2 = 1.0, side 3 = 1.0
created on Wed May 22 07:34:23 MDT 2019
color: blue and filled = false
Area = 0.43

Triangle: side1 = 6.0, side2 = 7.0, side 3 = 8.0
created on Wed May 22 07:34:33 MDT 2019
color: green and filled = true
Area = 20.33

Goodbye...
 */
import java.util.ArrayList;
import java.util.Scanner;

public class W10dot1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle Triangle = new Triangle();

        String[] color = new String[3];
        boolean[] filled = new boolean[3];
        double[] side1 = new double [3];
        double[] side2 = new double [3];
        double[] side3 = new double [3];

        System.out.println("This program gets input for three triangles from the user.\n" +
                    "It then creates three Triangle objects and displays the\n" +
                    "description of each.");
        for (int i = 0; i < 3; i++) {
            System.out.println("\"Enter the color of a triangle (e.g. \\\"red\\\"):  ");
            Triangle.setColor(input.next());

            color[i] = (Triangle.getColor());

            System.out.println("Is the triangle filled (y or n): ");
            String yn = input.next();

            //Condition for y = true, and n = false

            switch (yn) {
                case "y" -> filled[i] = Triangle.setFilled(true);
                case "n" -> filled[i] = Triangle.setFilled(false);
                default -> {
                    System.out.println("Invalid");
                    System.exit(-1);
                }
            }



            System.out.println("Enter the lengths of the three sides of the triangle:");
            Triangle.setSide1(input.nextDouble());
            Triangle.setSide2(input.nextDouble());
            Triangle.setSide3(input.nextDouble());

            side1[i] = (Triangle.getSide1());
            side2[i] = (Triangle.getSide2());
            side3[i] = (Triangle.getSide3());
        }



        Triangle shape1 = new Triangle(color[0], filled[0], side1[0], side2[0], side3[0]);
        Triangle shape2 = new Triangle(color[1], filled[1], side1[1], side2[1], side3[1]);
        Triangle shape3 = new Triangle(color[2], filled[2], side1[2], side2[2], side3[2]);

        //Array List for getting values of an object (Triangle 1, 2 3)
        ArrayList<GeometricObject> list = new ArrayList<>();

        //add
        list.add(shape1);
        list.add(shape2);
        list.add(shape3);

        //output
        for (GeometricObject s: list){
            System.out.println(s.toString());

        }
        System.out.print("\n" + "Goodbye..." + "\n");
    }
}
