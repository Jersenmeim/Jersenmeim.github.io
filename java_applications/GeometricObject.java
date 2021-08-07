package week10;
/*
Design a class named Triangle that extends the GeometricObject class given in Listing 11.1 in the textbook.

Your Triangle class should contain the following:

    Three data fields side1, side2, and side3 that represent sides of a triangle.
    Getter and setter methods for side1, side2, and side3.
    A no-arg constructor that creates a default triangle with each side equal to 1.
    A parameterized constructor that creates a triangle with the specified values for side1,
    side2, and side3.
    A member method named getArea( ) that calculates and returns the area of the triangle.
    The formula to compute the area of a Triangle, given three sides is called Heron's formula.
    Heron's formula is described in problem 2.19 in the textbook. To function correctly,
    you must add a getArea() method to the GeometricObject class, and the getArea( )
    method in the Triangle class must override GeometricObject's  getArea() method.
    A member method named toString( ) that generates a String representation of the triangle object.
    This toString( ) method must call GeometricObject's  toString() method to correctly display
    the String representation of the Triangle object.
    Create a UML diagram that documents your class design. Show both the GeometricObject
    class and the Triangle class in your diagram.

*/


public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private final java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
        }
    /** Construct a geometric object with the specified color
     and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
        }

        /** Return color */
    public String getColor() {
        return color;
        }

        /** Set a new color
         *

         * */
    public void setColor(String color) {
    this.color = color;

    }

         /** Return filled. Since filled is boolean,
  its getter method is named isFilled */
     public boolean isFilled() {
     return filled;
         }

         /** Set a new filled
          **/
     public boolean setFilled(boolean filled) {
     this.filled = filled;
         return filled;
     }

         /** Get dateCreated */
     public java.util.Date getDateCreated() {
     return dateCreated;
         }


    //method to get the area of a triangle
    public double getArea(double side1, double side2, double side3) {
        return 0;
    }


    /** Return a string representation of this object */
     public String toString() {
     return  "created on " + getDateCreated() + "\ncolor: " + color +
             " and filled: " + filled + getArea(0 , 0 ,0);
         }
}

    class Triangle extends GeometricObject {

    double side1;
    double side2;
    double side3;

    public Triangle() {

    }



    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //getter for side 1
    public double getSide1() {
        return side1;
    }
    //setter for side 1
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    //getter for side 2
    public double getSide2() {
        return side2;
    }
    //setter for side 2
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    //getter for side 3
    public double getSide3() {
        return side3;
    }
    //setter for side 2
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    //method to get the area of a triangle
    @Override
    public double getArea(double side1, double side2, double side3 ){

        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    @Override
    public String toString() {
        System.out.printf("\nTriangle: side1 = %.1f, side2 = %.1f, side3 = %.1f\n",side1,side2,side3);
        System.out.print("created on " + getDateCreated() + "\ncolor: " + super.getColor() +
                " and filled: " + super.isFilled());
        return String.format("\nArea = %.2f\n", getArea(side1,side2,side3));

    }

}
