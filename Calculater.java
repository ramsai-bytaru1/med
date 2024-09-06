public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("11 + 5 = " + calc.add(11, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
    }
}
