package package3;



@FunctionalInterface
interface DoubleOperator {
    public Double apply(Double a, Double b);
}
class Main{
    public static void main(String[] args) {

        Double result1 = Calculator.calculate(30d, 70d, (a, b) -> a + b);
        System.out.println(result1);

        Double result2 = Calculator.calculate(100d, 50d, (a, b) -> a - b);
        System.out.println(result2);

        Double result3 = Calculator.calculate(5d, 5d, (a, b) -> a * b);
        System.out.println(result3);

        Double result4 = Calculator.calculate(20d, 10d, (a, b) -> a / b);
        System.out.println(result4);

        Double result5 = Calculator.calculate(20d, 10d, (a, b) -> a > b ? b : a);
        System.out.println(result5);
    }
}