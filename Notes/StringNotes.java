public class StringNotes
{
    public static void main( String[] args )
    {
        /*
         * String literal
         *      is an instance of the String class (not a primitive)
         *      delineated by double quotes
         *      must be defined on a single line
         *  
         *  "Harry" is the string literal
         */
        String name = "Harry";  // new String( "Harry" )
        
        /*
         * String concatenation
         *      + is the string concatenation operator
         *      adds second string to the end of the first string
         *      if one or both operands are strings, + is string
         *          concatenation (operands are converted to strings);
         *          otherwise, it is addition
         */
        String fName = "Harry";
        String lName = "Morgan";
        name = fName + lName; // "HarryMorgan"
        name = fName + " " + lName; // "Harry Morgan"
        
        String number = "" + 77; // "77"
        String number2 = "" + 7 + 3; // "73"
        String number3 = 7 + 3 + ""; // "10"
        
        /*
         * length
         *      returns the number of characters in a string
         */
        name = "Harry Morgan";
        int length = name.length(); // returns 12
        
        String empty = "";
        length = empty.length(); // returns 0
        
        /*
         * charAt
         *      returns the character (of type char) at the specified
         *          index (0-based)
         *  
         *  H   a   r   r   y
         *  0   1   2   3   4
         *  length = 5
         */
        name = "Harry";
        char start = name.charAt( 0 );  // returns 'H'
        char end = name.charAt( 4 ); // returns 'y'
        end = name.charAt( name.length() - 1 ); // returns 'y'
        //end = name.charAt( 5 ); // generates StringIndexOutOfBoundsException
        
        /*
         * substring
         *      returns part of the string starting at the first index up to,
         *          but not including, the second index
         *      if only one index is specified, returns part of the string
         *          starting at the index through the end of the string
         *  
         *  H   e   l   l   o   ,       W   o   r   l   d   !
         *  0   1   2   3   4   5   6   7   8   9   10  11  12
         *  length = 13
         */
        String greeting = "Hello, World!";
        String sub = greeting.substring( 0, 5 ); // returns "Hello"
        sub = greeting.substring( 7, 12 ); // returns "World"
        sub = greeting.substring( 7 ); // returns "World!"
        sub = greeting.substring( 7, greeting.length()); // returns "World!"
        
        /*
         * indexOf
         *      returns the index of the first occurrence of the specified
         *          string
         *      if not found, returns -1
         *  
         *  M   i   s   s   i   s   s   i   p   p   i
         *  0   1   2   3   4   5   6   7   8   9   10
         *  length = 11
         */
        greeting = "Mississippi";
        int index = greeting.indexOf( "pp" ); // returns ?
        index = greeting.indexOf( "ss" ); // returns ?
        index = greeting.indexOf( "iii" ); // returns ?
        

        
       
    }
}







