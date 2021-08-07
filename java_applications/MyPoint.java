package week09;
/*
Design a class named MyPoint that represents a point in 2-dimensional space. Your class should contain the following:

    1. Two data fields x and y, that represent the x-coordinate and the y-coordinate of the point.
    2. Getter and setter methods for x and y.
    3. A no-arg constructor that creates a default point at (0,0).
    5. A parameterized constructor that creates a point at the designated x and y coordinate.
    6. A member method named distance that calculates and returns the distance between this MyPoint object and another point that is specified by its x- and y-coordinates. The method header looks like this:
     public double distance(int xCoord, int yCoord);
    7. A member method named distance that calculates and returns the distance between this MyPoint object and another object of the MyPoint class. The method header looks like this:
    public double distance(MyPoint p)
    8. A static, non-member method named distance that takes two objects of the MyPoint class as parameters, and calculates and returns the distance between the two of them. The method header looks like this:      public static double distance (MyPoint mp1, MyPoint mp2)
    9. Create a UML diagram that documents your class design.

*/
public class MyPoint {

     double x;
     double y;


    /**
     * Constructor creates a default point at (0,0).
     */
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Getter for x-coordinate
    public double getX() {
        return x;
    }
    //Getter for y-coordinate
    public double getY() {
        return y;
    }

    //Setter for y-coordinate
    public void setY(double y) {
        this.y = y;
    }

    //Setter for x-coordinate
    public void setX(double x) {
        this.x = x;
    }

    //method 1 to calculate distance
    double distance(double xCoord, double yCoord)
    {
        return Math.sqrt((this.x-xCoord)*(this.x-xCoord) + (this.y-yCoord)*(this.y-yCoord));
    }


    //method 1 to calculate distance

    public double distance(MyPoint p) {

        double x_distance = this.getX() - p.getX();
        double y_distance = this.getY() - p.getY();
        double arg1 = Math.pow(x_distance, 2);
        double arg2 = Math.pow(y_distance, 2);

        return Math.sqrt(arg1 + arg2);
        }
    //method 3 to calculate distance
   public static double distance(MyPoint mp1, MyPoint mp2) {
          return Math.sqrt((mp1.x - mp2.x) * (mp1.x - mp2.x) + (mp1.y - mp2.y)
                   * (mp1.y - mp2.y));

    }

}


