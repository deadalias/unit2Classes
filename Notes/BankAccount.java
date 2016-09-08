
/**
 * This class models a bank account.
 * 
 * @author gcschmit
 * @version 7 September 2016
 */
public class BankAccount
{
    /*
     * Instance variables store the object's properties
     *      specify the visibility (e.g., private)
     *          public: accessible by anyone
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specifiy the name (e.g., balance)
     *  
     *  Instance variables differ from local variables in the following ways:
     *      scoped to their object (accessible from all methods)
     *      automatically initialized to a default value (0, false, null)
     */
    private double balance;

    /*
     * Constructor:
     *      responsible for initalizing newly created objects
     *      invoked automatically via the new operator
     *      name of constructor must match the name of class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     */
    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        
    }
    
    /**
     * Constructs a bank account object with the specified initial balance
     *
     * @param  balance   initial balance of this bank account
     */
    public BankAccount( double balance )
    {
        /*
         * Local and parameter variables "shadow" instance variables of
         *  the same name. For example, "balance" refers to the parameter
         *  variable and not the instance variable.
         *  To refer to the instance variable, use "this", which is
         *      a reserved word that references the current object
         */
        this.balance /* refers to instance variable */ =
            balance /* refers to parameter variable */;
    }


    /*
     * When declarating a method, specify:
     *      the visibility (e.g., public)
     *      the return type (e.g., void)
     *      the method name (e.g., deposit)
     *      the parameters and their types (e.g., amount of type double)
     */
    /**
     * Deposits the specified amount of money in this bank account
     * 
     * @param  amount   the amount to deposit in this bank account
     */
    public void deposit( double amount )
    {
    }
    
    /**
     * Returns the balance of this bank account
     *
     * @return     balance of this bank account
     */
    public double getBalance()
    {
        return 0;
    }
    
    /**
     * Withdraws the specified amount of money from this bank account
     *
     * @param  amount   amount of money to withdraw from this bank account
     */
    public void withdraw( double amount )
    {
    }


}
