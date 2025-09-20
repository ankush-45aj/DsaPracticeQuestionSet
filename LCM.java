
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their LCM:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int findLCM(int num1, int num2) {
        int i = 1;
        while (i <= num2) {
            if (num1 * i % num2 == 0) {
                return num1 * i;
            }
            i++;
        }
        return num1 * num2; // Fallback in case no LCM is found
    }
}
