package cwiczenia;

public class Lambdas {

    public static void main(String[] args) {
        // f(x) -> x*x

        MathOperation addition = (a, b) -> a + b;

        double additionResult = executeOperation(3.0, 15.0, addition);
        System.out.println("Wynik operacji (a, b) -> a + b : " + additionResult);


    }


    static double executeOperation(double a, double b, MathOperation operation) {
        double result = operation.operate(a, b);
        return result;
    }
}
