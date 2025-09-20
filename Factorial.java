
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a number ");
        int fact = sc.nextInt();

        int num = FactorialCalculator(fact);
        System.out.println(num);

    }

    public static int FactorialCalculator(int fact) {
        int i = 1;
        int result = 1;
        if (fact < 2) {
            result = 1;
            return result;
        }

        while (i <= fact) {
            result *= i;
            i++;

        }

        return result;
    }

}
