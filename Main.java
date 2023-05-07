public class Main {

    public static void main(String[] args) {

        // Loop through command line arguments
        for (int j = 0; j <= args.length; j++) {
            try {

                // Throw an exception if no arguments provided
                if (args.length == 0) {
                    throw new FactorialException("Please provide an integer as a command line argument.");
                }
                // Parse integer from first command line argument
                int num = Integer.parseInt(args[0]);

                // Validate integer is within range and not negative
                Validation.validateNum(num);

                // Calculate factorial of integer
                int factorial = 1;
                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }

                // Print result
                System.out.println(num + "! = " + factorial);

            } catch (FactorialException n) {
                // Handle custom exception by printing error message
                System.out.println(n.getMessage());

            } catch (NumberFormatException e) {
                // Handle exception thrown when the provided command line argument cannot be parsed as an integer
                System.out.println("Not an Integer");
            }
        }
    }
}

