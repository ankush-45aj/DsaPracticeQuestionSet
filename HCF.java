
import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their HCF:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    public static int findHCF(int num1, int num2) {
        int i = 2;
        int hcf = 1;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
            i++;
        }
        return hcf; // If no common factor is found, return 1 (HCF of any two numbers)
    }
}
