// FibonacciGenerator.java
public class FibonacciGenerator {
    public static void main(String[] args) {
        int n = 10; // Example: Generate Fibonacci series for the first 10 numbers
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (first " + n + " numbers): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
