package week08;
/*
Jersen Meim
CIT 260-6
Write a short Java program that implements your Rectangle class, and a main() method that does the following:

    Tells the user what the program does.
    Creates two Rectangle objects, the first with a height of 4 and a width of 40, the second with a height of 3.5 and a width of 5.
    Call the methods in your Rectangle class to output the width, height, area, and perimeter of each rectangle, with 2 digits after the decimal point.
    Output a goodbye message.

The following example illustrates what your program should look like when it runs.

This program creates two rectangle objects and displays their width, height, area and perimeter.

Rectangle 1:
height = 4.00
width = 40.00
area = 160.00
perimeter = 88.00

Rectangle 2:
height = 3.50
width = 5.00
area = 17.50
perimeter = 17.00

goodbye ...

*/

public class W08dot1 {

    public static void main(String[] args) {

        // Create a Rectangle 1 given set of values using setter and null constructor
        Rectangle rectangle1 = new Rectangle();
        //Set the height and width using setter
        rectangle1.setHeight(4.0);
        rectangle1.setWidth(40.0);
        System.out.println("This program creates two rectangle objects and displays their width, " +
                "height, area and perimeter. " + "\n");
        System.out.println("Rectangle 1: ");
        System.out.printf("height %.2f\n", rectangle1.getHeight());
        System.out.printf("width %.2f\n", rectangle1.getWidth());
        System.out.printf("area %.2f\n", rectangle1.getArea());
        System.out.printf("perimeter %.2f\n", rectangle1.getPerimeter());

        // Create a Rectangle 2 object with given set of values, using parametrized constructor
        Rectangle rectangle2 = new Rectangle(3.50, 5.0);
        System.out.println("\n" + "Rectangle 2: ");
        System.out.printf("height %.2f\n", rectangle2.getHeight());
        System.out.printf("width %.2f\n", rectangle2.getWidth());
        System.out.printf("area %.2f\n", rectangle2.getArea());
        System.out.printf("perimeter %.2f\n", rectangle2.getPerimeter());
        System.out.println("\n" + "goodbye..");
    }
}