
import java.util.Scanner;

public class SumOfOddNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a number");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println(sum);
    }

    public static int oddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            i = i + 2;
        }

        return sum;

    }

}
