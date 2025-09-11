package java_hw_12.task1;

public class Calculator {

    public static Calculatable getOperation(String value) throws UnknownException{
        switch (value){
            case "+":
                return (a, b) -> a + b;
            case "-":
                return (a, b) -> a - b;
            case "*":
                return (a, b) -> a * b;
            case "/":
                return (a, b) -> {
                    if (b == 0) {
                        throw new DivisionByZeroException("Error: Division by zero is not possible!");
                    } return a / b;
                };
            default:
                throw new UnknownException("An unknown error occurred.");
        }
    }
}
