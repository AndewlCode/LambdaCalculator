import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        Calculator calculator = Calculator.supplier.get();

        BinaryOperator<Integer> plus = (x, y) -> x + y;
        BinaryOperator<Integer> minus = (x, y) -> x - y;
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        BinaryOperator<Integer> devide = (x, y) -> x / y;

        System.out.println(plus.apply(3, 5)); // 8
        System.out.println(minus.apply(3, 5)); // -2
        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(devide.apply(3, 5)); // 0

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        System.out.println(pow.apply(2)); //4
        System.out.println(abs.apply(-5)); //5

        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.apply(-1)); //false

        Consumer<Integer> println = System.out::println;
        println.apply(5); // print 5
    }
}

class Calculator {
    static Supplier<Integer> supplier;

    public void get(){

    }

    public Calculator() {

    }


}

interface BinaryOperator<Integer> {
    Integer apply(Integer a, Integer b);
}

interface UnaryOperator <Integer>{
    Integer apply (Integer a);
}

interface Predicate <Integer> {
    boolean apply (Integer a);
}

interface  Consumer <Integer> {
    void apply (Integer a);
}
