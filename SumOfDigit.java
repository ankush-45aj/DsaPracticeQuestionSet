
import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a number");
        int number = sc.nextInt();
        int sumofdigit = SumOfDigit(number); 
        System.err.println("sum of digit is " + sumofdigit);
        
    }
    public static int SumOfDigit(int number){
        int sum = 0;
        while(number > 0){
            sum += number%10;
            number /= 10;

        }
        return sum;
    }
}
