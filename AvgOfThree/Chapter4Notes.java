
/**
 * Write a description of class Chapter4Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chapter4Notes
{
    /*
     * Constants that will be used across several methods, should be
     *  defined as static final
     *  The static keyword means that the same value for the variable
     *      is used for all objects of this class (or directly with the class)
     *      
     */
    public static final double PI = 3.141592654;
    
    public static void main( String[] args )
    {
        /*
         * The final keyword specifies that the value of a variable
         *  cannot be changed. This is enforced by the compiler.
         */
        final double G = 9.81;
        
        double radius = 6.0;
        
        /* When referring to a static variable (like a class variable in Python)
         *  scope the variable with the class (e.g., Chapter4Notes)
         */
        double area = Math.PI * radius * radius;
        
        
        /*
         * If both operands are integers (e.g., 7, 4) than integer
         *  division is performed where the remainder is discarded
         *  
         *  This can be unexpected.
         *  This can be very useful.
         */
        int value = 7 / 4;
        System.out.println( value );
        
        value = 3 / 4;
        System.out.println( value );
        
        /* If we don't want integer division, make one of the operands
         *  a double.
         */
        double decimalValue = 7 / 4.0;
        System.out.println( decimalValue );
        
        /*
         * The modulo (mod or remainder) operator return the remainder
         *  of the divsion operation.
         *  
         *  This can be very useful when paired with integer division.
         */
        value = 7 % 2; // 1
        value = 9 % 3; // 0
        value = 15 % 4; // 3
        
        /*
         * We can combine the / and % operators when performing some
         *  conversions.
         */
        int pennies = 1729;
        int dollars = pennies / 100; // returns 17
        int cents = pennies % 100; // returns 29
        
        /*
         * Conversions - converting a data value from one type to another
         *      (e.g., int to a double)
         *      
         *      Widening conversion - preserves information
         *          (e.g., int to double, int to long)
         *      Narrowing conversion - may lose information
         *          (e.g., double to int, int to short)
         */
        int dollars2 = 25;
        double money = dollars2;    // okay
        // dollars2 = money;        // compile-time error
        
        /*
         * In this example, count is promoted to a double such that
         *      floating point division can occur. This is an automatic
         *      widing conversion.
         * 
         */
        double sum = 25;
        int count = 4;
        double average = sum / count;
        
        /*
         * This is a different example. Since sum2 and count2 are both ints,
         *      no automatic widing conversion is needed and integer divison
         *      is done. The result (i.e., 6) is promoted (automatic widing
         *      conversion) to a double before being assigned to average2.
         */
        int sum2 = 25;
        int count2 = 4;
        double average2 = sum2 / count2;
        
        /*
         * the cast operator (e.g., (int)) is the "I know what I'm doing;
         *      trust me" operator.
         *  In this example, 84 is assigned to wholeDollars
         */
        double cost = 84.69;
        int wholeDollars = (int) cost;
        
        /*
         * If we want to round a value to the nearest integer, use
         *      the static method Math.round.
         *  In this example, Math.round returns 85.0. We have to cast
         *      the return value to an int such that 85 is assigned to
         *      nearestDollar.
         */
        int nearestDollar = (int)( Math.round( cost ));
    }
    
}





