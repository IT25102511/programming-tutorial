class Calculator {
    public int add(int n1, int n2) { return n1 + n2; }
    public int multiply(int n1, int n2) { return n1 * n2; }
    public int square(int n) { return n * n; }
}

public class Question5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int expr1 = calc.square(calc.add(calc.multiply(3, 4), calc.multiply(5, 7)));
        System.out.println("Result 1: " + expr1);

        int expr2 = calc.add(calc.square(calc.add(4, 7)), calc.square(calc.add(8, 3)));
        System.out.println("Result 2: " + expr2);
    }
}