public class StringNotes
{
    public static void main( String[] args )
    {
        /*
         * String Literal:
         *      instance of String class (not a primitive)
         *      delineated by double quotes
         *      must be defined on a single line
         *      
         *  For example, "Harry" is a string literal
         */
        String name = "Harry";
        
        /*
         * String Concatenation
         *      + is the string concatenation operator
         *      adds one string to the end of the other string
         *      if one or both operands are strings, + is string
         *          concatenation (operands are converted to strings);
         *          otherwise it is addition
         */
        String fName = "Harry";
        String lName = "Morgan";
        name = fName + lName; // "HarryMorgan"
        name = fName + " " + lName; // "Harry Morgan"
        String number = "" + 7; // "7"
        String number2 = "" + 7 + 3; // "?"
        String number3 = 7 + 3 + ""; // "?"
        
        /*
         * length
         *      returns the number of characters in a string
         */
        name = "Harry";
        int length = name.length(); // returns 5
        
        String empty = "";
        length = empty.length(); // returns 0
        
        /*
         * charAt
         *      returns the charater (of type char) at the specified
         *      index (0-based)
         *      
         *  H   a   r   r   y
         *  0   1   2   3   4
         */
        name = "Harry";
        char start = name.charAt( 0 );  // returns 'H'
        char end = name.charAt( 4 ); // returns 'y'
        end = name.charAt( name.length() - 1 ); // returns 'y'
        
        /*
         * substring
         *      returns part of teh string starting at the first index
         *      up to, but not including, the second index
         *      
         *  H   e   l   l   o   ,       W   o   r   l   d   !
         *  0   1   2   3   4   5   6   7   8   9   10  11  12
         */
        String greeting = "Hello, World!";
        String sub = greeting.substring( 0, 5 ); // returns "Hello"
        String sub2 = greeting.substring( 7, 12 ); // returns "World"
        String sub3 = greeting.substring( 7 ); // returns "World!"
        
        /*
         * indexOf
         *      returns the index of the first occurrence of the specified
         *          string.
         *      If not found, returns -1
         *      
         *  H   e   l   l   o   ,       W   o   r   l   d   !
         *  0   1   2   3   4   5   6   7   8   9   10  11  12
         */
        greeting = "Hello, World!"; 
        int index = greeting.indexOf( "World" );    // returns 7
        index = greeting.indexOf( "o" ); // returns 4
        index = greeting.indexOf( "Happy" ); // returns -1
    }
}






