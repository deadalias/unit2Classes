import java.util.Scanner;

/**
 * Create a RectangleCalculator class with a constructor that takes the height and width
 *      as parameters and with three methods: getArea, getPerimeter, getDiagonalLength.
 * Create a main method that asks the user for the lengths of a rectangle's sides,
 *      creates a RectangleCalculator object, invokes the three methods on the object,
 *      and prints the values returned.
 * 
 * @author gcschmit
 * @version 28 September 2016
 */
public class RectangleCalculator
{
    // instance variables - replace the example below with your own
    private double height;
    private double width;

    public RectangleCalculator( double h, double w)
    {
        // initialise instance variables
        this.height = h;
        this.width = w;
    }

    public double getArea()
    {
        return this.height * this.width;
    }

    public double getPerimeter()
    {
        return 2 * this.height + 2 * this.width;
    }

    public double getDiagonalLength()
    {
        return Math.sqrt( this.height * this.height + this.width * this.width );
    }
    
    public static void main( String[] args)
    {
        Scanner s = new Scanner( System.in );
        System.out.print( "Enter the width of the rectangle: " );
        double width = s.nextDouble();
        System.out.print( "Enter the height of the rectangle: " );
        double height= s.nextDouble();
        
        RectangleCalculator rectCalc = new RectangleCalculator( width, height );
        
        double area = rectCalc.getArea();
        double perimeter = rectCalc.getPerimeter();
        double diagonalLength = rectCalc.getDiagonalLength();
        
        System.out.println( "Area: " + area );
        System.out.println( "Perimeter: " + perimeter );
        System.out.println( "Diagonal: " + diagonalLength );
    }

}
