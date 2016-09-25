public class Converter
{
    public static double calculateArea( double radius )
    {
        /*
         * Instead of using "magic number" (e.g., 3.14159), use
         *  constants defined by the Java Standard Library.
         *  
         *  For example in Math.java:
         *  
         *  public static final double PI = 3.141592654
         *  
         *  Static: one value for the variable for all objects of the class;
         *              can be access directly through the class
         *              (e.g., Math.PI)
         */
        double area = Math.PI * radius * radius;
        
        return area;
    }
    
    public static double convertFeetToLightyears( double feet )
    {
        /*
         * Declare a constant with the final keyword.
         * 
         * If we try to change the value, a compiler error will be generated.
         */
        final double LIGHTYEARS_PER_FOOT = 3.22174e-17;
        
        double lightYears = feet * LIGHTYEARS_PER_FOOT;
        
        //LIGHTYEARS_PER_FOOT = 2;
        
        return lightYears;
    }
    
    public static void penniesToDollarsAndCents( int pennies )
    {
        final int PENNIES_PER_DOLLAR = 100;
        /*
         * Use integer division to calculate how many whole dollars
         *  based on the specified number of pennies.
         *  
         *  Integer division discards the remainder (truncate, floor).
         */
        int dollars = pennies / PENNIES_PER_DOLLAR;
        
        /*
         * Use the modulo (mod, remainder) operator to calculate how many
         *      cents remain.
         *  
         *  The mod operator returns the remainder of the division operation.
         *  
         *  It can be very useful when paired with integer division.
         *  
         *  Examples:
         *      7 % 2 = ?
         *      11 % 3 = ?
         *      6 % 2 = ?
         */
        int cents = pennies % PENNIES_PER_DOLLAR;
        
        System.out.println( "Dollars: " + dollars + ", Cents: " + cents );
    }
    
}






