public class AreaCalculator
{
    public static double calculateAreaOfCircle( double radius )
    {
        /*
         * Whenever possible, use provided constants.
         * 
         * These constants are declared:
         *      final: (they cannot be changed)
         *      static: (you don't need an object; access directly via class)
         * 
         * For example, inside Math.java is:
         * 
         *      public static final double PI = 3.141592654;
         */
        double area = Math.PI * radius * radius;
        return area;
    }
    
    public static double convertFeetToLightYears( double feet )
    {
        final double LIGHTYEARS_PER_FOOT = 3.22174e-17;
        double lightYears = feet * LIGHTYEARS_PER_FOOT;
        
        /*
         * If we try to change the value of a final variable (i.e., constant)
         *      a compile-time error will be generated.
         */
        // LIGHTYEARS_PER_FOOT = 3;
        
        return lightYears;
    }
    
    public static void penniesToDollarsAndCents( int pennies )
    {
        final int PENNIES_PER_DOLLAR = 100;
        
        /*
         * Cacluate how many whole dollars we can obtain given the
         *  specified number of pennies.
         *  
         *  Use integer divison to calculate this since integer division
         *      discards the remainder (truncate, floor)
         */
        int dollars = pennies / PENNIES_PER_DOLLAR;
        
        /*
         * The mod operator (modulo or remaidner) returns the remainder
         *      of the division operation.
         *      
         *      At times, it is very useful when paired with integer division
         *      
         * Examples:
         *      7 % 2 = ?
         *      9 % 3 = ?
         *      12 % 2 = ?
         */
        int cents = pennies % PENNIES_PER_DOLLAR;
        
        System.out.println( "dollars: " + dollars + " cents: " + cents );
    }
    
    
}





