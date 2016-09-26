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
    
    public static void conversionExample()
    {
        /*
         * A conversion is when a data value is converted from one type
         *      to another (e.g., int to double, double to int, int to long)
         *  
         *  Widening: preserves information (e.g,. int to double, int to long)
         *  Narrowing: may loose information (e.g., double to int)
         */
        int dollars = 25;
        double money = dollars; // okay; widening conversion
        //dollars = money; // compile-time error; narrowing conversion
        
        /*
         * Arthimetic Promotion Example.
         * 
         * If the two operands are of different types, Java attempts to
         *      promote one of the types (widening conversion) and then
         *      perform the operation.
         *      
         *  In this example, 4 is promoted to a double (4.0) and then
         *      floating-point divsiion is performed resulting in (4.25),
         *      which is assigned to average.
         */
        double miles = 17.0;
        int days = 4;
        double average = miles / days;
        
        /*
         * This is a different example.
         * 
         * In this case, both miles2 and days2 are ints, so Java doesn't
         *      perform any promotion and performs integer division. The
         *      result (4) is promoted to a double (4.0) and then assigned
         *      to average2.
         */
        int miles2 = 17;
        int days2 = 4;
        double average2 = miles2 / days2;
        
        /*
         * A cast is the "I know what I'm doing; trust me" conversion.
         * 
         * A cast can perform a narrowing conversion because we are explicitly
         *      doing so.
         *  
         *  (int) truncates 84.69 to an int (84)
         */
        double price = 84.69;
        int wholeDollars = (int) price;
        
        /*
         * If we want to round a double to the nearest int value, use the
         *      Math.round static method.
         *      
         *  converts 84.69 to 85.0
         */
        int nearestDollar = (int)( Math.round( price ));
    }
    
    
    
}






