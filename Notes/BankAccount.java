
/**
 * This class models an account at a bank.
 * 
 * @author gcschmit
 * @version 07sep2016
 */
public class BankAccount
{
    /* 
     * instance variable
     *      stores the object's properties
     *      specify the visibility (e.g., private)
     *          public: accessible by anyone
     *          private: only accessible by methods in the same class
     *      specify the type (e.g., double)
     *      specify the name (e.g., balance)
     *      
     *      different than local variables in the following ways:
     *          scope to the object (accessible from all methods in class)
     *          automatically initialized to a default value (0, false, null)
     */
    private double balance;

    /**
     * Constructor for objects of class BankAccount
     *      responsible for initializing objects
     *      invoked automatically via the new operator
     *      name must match the name of the class (e.g., BankAccount)
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may invoke another (with restrictions)
     *      
     */
    public BankAccount()
    {
        // initialize instance variables
        // scope instance variables by using the this keyword (usually not required)
        this.balance = 0;
    }
    
    /**
     * Constructor that specifies the intial balance for the bank account
     *
     * @param  balance   the initial balance for the bank account
     */
    public BankAccount( double balance )
    {
        /*
         * Local variables and parameter variables (e.g., balance) "shadows"
         *      instance variables. That is, the name refers to the local or
         *      parameter variable and not the instance variable.
         *      
         * We have to use "this" if want to reference the instance variable.     
         */
        this.balance /* refers to instance variable */ =
                balance /* refers to parameter */;
    }


    /**
     * Deposits money into the bank account.
     * 
     * Declaring methods:
     *      specify the visibility (e.g., public)
     *      specify the return type (e.g., void)
     *      specify the method name (e.g., deposit)
     *      specify the parameters and their types (e.g., amount of type double)
     * 
     * @param  amount   the amount to deposit in the account
     */
    public void deposit( double amount )
    {
        
    }
    
    /**
     * Withdraws the specified amount of money from the bank account
     *
     * @param  amount   the amount to withdraw from the bank account
     */
    public void withdraw( double amount )
    {
    }

    
    /**
     * Returns the current balance of the bank account
     *
     * @return     the current balance of the bank account
     */
    public double getBalance()
    {
        return 0;
    }
    
    

}
