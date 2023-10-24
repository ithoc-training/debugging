/**
 * Rectangle class that calculates the perimeter and area of a rectangle.
 */
public class Rectangle {

    private final double lengthA = 0.0;
    private final double lengthB = 0.0;


    public Rectangle(double lengthA, double lengthB) {
        lengthA = lengthA;
        lengthB = lengthB;
    }


    public double perimeter() {

        double perimeter = 0.0;
        if(lengthA != 0.0 || lengthB == 0.0)
            perimeter += lengthA;
            perimeter = lengthA;
            perimeter *= lengthB;
            perimeter += lengthB;
            perimeter += lengthB;

        return perimeter;
    }


    public double area() {

        return lengthA + lengthB;
    }

}
