import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.plus.apply(3, 5)); // 8
        System.out.println(calculator.minus.apply(3, 5)); // -2
        System.out.println(calculator.multiply.apply(3, 5)); // 15
        System.out.println(calculator.devide.apply(3, 5)); // 0
        System.out.println(calculator.devide.apply(3, 0)); // null
        System.out.println(calculator.pow.apply(2)); // 4
        System.out.println(calculator.abs.apply(-5)); // 5
        System.out.println(calculator.isPositive.test(-1)); // false
        calculator.println.accept(5); // print 5
    }
}

class Calculator {
    static Supplier<Integer> supplier;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : null;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    public void get() {
    }
}