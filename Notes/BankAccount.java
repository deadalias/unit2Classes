
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

    /*
     * Constructor:
     *      responsible for initializing newly created objects
     *      invoked automatically via the new operator
     *      constructor name must match the class name
     *      has no return type (not even void)
     *      mutiple constructors may be defined for a class
     *          one constructor may call another (with restrictions)
     */
    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        this.balance = 0;
    }
    
    /**
     * Constructs a bank account with the specified balance
     *
     * @param  balance   the intitial balance of the bank account
     */
    public BankAccount( double balance )
    {
        /*
         * Parameter and local variables can "shadow" instance variables.
         *  That is, "balance" refers to the parameter variable and not
         *  the instance variable.
         *  
         *  To expliticly refer to the instance variable, use "this"
         *      "this" is not always required, but it's a good idea
         */
        this.balance /* refers to instance variable */ =
                balance /* refers to parameter variable */;
    }


    /*
     * Defining methods:
     *      specify the visibility (e.g., public)
     *      specify the return type (e.g., void)
     *      specify the method's name (e.g., deposit)
     *      specify the parameters and their types (e.g., amount of type double)
     */
    /**
     * Deposits the specified amount of money into the bank account
     * 
     * @param  amount   the amount to deposit in the bank account
     */
    public void deposit( double amount )
    {
    }
    
    /**
     * Returns the current balance of the bank account.
     *
     * @return     the current balance of the bank account
     */
    public double getBalance()
    {
        return 0;
    }
    
    /**
     * Withdraws the specified amount from the bank account
     *
     * @param  amount   the amount to withdraw from the bank account
     */
    public void withdraw( double amount )
    {
    }


}
