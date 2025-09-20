
import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {
        System.err.println("please enter a number upto which you want to print fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + ":");
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        if (n < 0) {
            System.out.println("Invalid input, please enter a non-negative integer.");
            return;
        }
        if (n == 0) {
            System.out.print(a + " ");
            return;
        }
        System.out.print(a + " " + b + " ");

        while (a + b <= n) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
