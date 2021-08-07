package week08;

/**
 * A Rectangle class with constructor
 */
public class Rectangle
{
    private double height;
    private double width;


    /**
     * NUll Constructor
     */
    public Rectangle(){


    }
    /**
     * Parametrized Constructor
     */

    public Rectangle(double height, double width){

        this.height = height;
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double new_height) {
        this.height = new_height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double new_width) {
        this.width = new_width;
    }

    /**
     * The getArea method computes and returns the area
     */
    public double getArea()
    {
        return height * width;
    }

    /**
     * The getPerimeter method computes and returns the perimeter
     */
    public double getPerimeter()
    {
        return 2 * (height + width);
    }
}



