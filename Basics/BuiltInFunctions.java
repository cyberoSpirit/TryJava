/**
 * BuiltInFunctionsTester
 */
public class BuiltInFunctions {

    public void test() {
        //Find a built-in function that prints the message on the console.
        String message = "Hello, World!";
        System.out.println(message);

        //Find a built-in function that returns the length of a string.
        String example = "Java";
        System.out.println("The length of '" + example + "' is " + example.length());

        //Find a built-in function that converts a string to lowercase.
        String upperCase = "JAVA";
        System.out.println("'" + upperCase + "' in lowrcase is: " + upperCase.toLowerCase());

        //Find a built-in function that checks if a string starts with a specified prefix.
        String prefix = "pro";
        String programming = "Java programming";
        System.out.println("Does '" + programming + "' start with '" + prefix + "':" + programming.startsWith(prefix));

        //Find a built-in function that replaces all occurrences of a specified character in a string with another character.
        char oldChar = 'a';
        char newChar = 'o';
        String original = "Java is fun!";
        System.out.println(
            "'" + original + "' with replaced of '" +
            oldChar + "' with '" + newChar + "' is: '" +
            original.replace(oldChar, newChar) + "'");

        //Find a built-in function that calculates the square root of a number.
        double number = 9;
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));

        //Find a built-in function that calculates the power of a number.
        double base = 2;
        double exponent = 3;
        System.out.println(
            "The power of " + base + " to " + exponent +
            " is " + Math.pow(base, exponent));

        //Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println(
            "A random number between 0.0 (inclusive) and 1.0 is:" + Math.random());

        //Find a built-in function that returns the larger of two numbers.
        int number1 = 5;
        int number2 = 10;
        System.out.println(
            "The larger of " + number1 + " and " + number2 + " is:" + Math.max(number1, number2));
    }
}