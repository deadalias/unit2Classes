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
    
    public static void conversionExample()
    {
        /*
         * A conversion is when a data value if converted from one type to
         *      another. Examples: int to long or int to double
         *      
         *      Widening: preserves information (e.g., int to double)
         *      
         *      Narrowing: may loose information (e.g., double to int)
         *      
         *  Java will automatically perform widening conversions as needed.
         */
        
        // Assignment Conversion Example
        int dollars = 25;
        double money = dollars; // okay - converts an int to a double
        //int dollars2 = money; // compile-time error - attempts to convert a double to an int
        
        /* Arithmetic Promotion Example
         * 
         * Whenever operand types don't match, Java attempts to promote one
         *  type to the other.
         *  
         *  In this example, Java promote count, an int, to a double since this
         *      is a widening conversion.
         */
        double sum = 25.2;
        int count = 4;
        double result = sum / count;
        
        /*
         * This is not the same example.
         * 
         * Java evaluates the types of operands for each operation.
         * 
         * In this example, sun2 and count2 are both ints; so, no promotion
         *      is needed; integer division is done. The result (6) is
         *      promoted to a double (6.0) before assigning to result2.
         */
        int sum2 = 25;
        int count2 = 4;
        double result2 = sum2 / count2;
        
        /*
         * A cast is the "I know what I'm doing; trust me" conversion.
         * 
         * (int) forces Java to a type conversion and acknowledges the potential
         *  loss of data (e.g., 84 is assigned to wholeDollars)
         */
        double price = 84.69;
        int wholeDollars = (int) price;
        
        /*
         * If we want to round to the nearest integer rather than truncate,
         *      use the Math.round method.
         *  In this example, 84.69 is rounded to 85, which is assigned to
         *      nearestDollar.
         */
        int nearestDollar = (int)( Math.round( price ));
    }
    
    
}





