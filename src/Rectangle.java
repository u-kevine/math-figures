public class Rectangle extends Shape {

    private double width;
    private double length;


    /**
     * This constructor initialized the object properties
     * being width and length received as parameters.
     * @param width
     * @param length
     */
    Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }

    /**
     * This method calculates the area of the rectangle
     * @return double for area
     */
    @Override
    public double area() {
        return (this.width*this.length);
    }


    /**
     * This method calculates the volume of the rectangle
     * @return double for volume
     */
    @Override
    public double volume() {
        return 0.0;
    }
}
