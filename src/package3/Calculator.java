package package3;

public class Calculator {

    public static Double calculate(Double op1, Double op2, DoubleOperator operator) {
        return operator.apply(op1, op2);
    }
}
