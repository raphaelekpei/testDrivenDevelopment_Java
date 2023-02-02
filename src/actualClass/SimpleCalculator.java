package actualClass;

public class SimpleCalculator {

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) {
        return number1 / number2;
    }

    public double squareRoot(int number) {
        return Math.sqrt(number);
    }

    public double square(int number) {
        return Math.pow(number, number);
        // return number * number;

    }
    public double cubeRoot(double number) {
        return Math.cbrt(27);
    }

    public double cube(double number) {
        return number * number * number;
    }

}
