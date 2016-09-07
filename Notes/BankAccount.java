
/**
 * This class models a bank account.
 * 
 * @author gcschmit
 * @version 7 September 2016
 */
public class BankAccount
{
    /*
     * Instance Variables: store the object's properties
     *      specify the visibility (e.g., private)
     *          public: accessible by anyone
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specify the name (e.g., balance)
     *      
     * Instance variables differ from local variables in these ways:
     *      are scoped to their object (accessbile for all methods)
     *      are automatically initialized to a default value (0, false, null)
     */
    private double balance;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
