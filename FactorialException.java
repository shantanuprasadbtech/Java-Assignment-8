// Custom exception to handle invalid input
public class FactorialException extends Exception
{
    public FactorialException(String ErrMsg)
    {
        super(ErrMsg);
    }
}

// Class to handle input validation
class Validation
{
    public static void validateNum(int num) throws FactorialException, NumberFormatException {
        // Throw exception if number is negative
        if(num<0)
        {
            throw new FactorialException("Number cannot be negative");
        }
        // Throw exception if number is greater than 20
        else if (num>20)
        {
            throw new FactorialException("Number should be less than 20");
        }
    }
}
