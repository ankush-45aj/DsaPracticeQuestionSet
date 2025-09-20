
import java.util.Scanner;

public class method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int plus = add(z, 5);
        System.out.println("The sum is: " + plus);

    }

    public static int add(int a, int b) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // ;
        // System.out.print("Enter second number: ");
        // b = sc.nextInt();
        return a + b;
    }

}
