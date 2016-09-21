
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
        
        g = 10;
        
        double radius = 6.0;
        
        /* When referring to a static variable (like a class variable in Python)
         *  scope the variable with the class (e.g., Chapter4Notes)
         */
        double area = Math.PI * radius * radius;
        
    }
    
}
