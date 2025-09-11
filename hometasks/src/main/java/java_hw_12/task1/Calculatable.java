package java_hw_12.task1;

@FunctionalInterface
public interface Calculatable {

    double calculate(double number1, double number2) throws DivisionByZeroException;
}
