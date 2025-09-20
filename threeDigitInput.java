import java.util.Scanner;

public class threeDigitInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter a number : ");
            int num = sc.nextInt();
            String number = String.valueOf(num);
            if (number.length() < 3 && num < 1000) {
                System.out.println("your number is not a three digit number");
            } else if (number.length() == 3 && num >= 1000) {
                System.out.println("your number is three digit number");
            } else {
                System.out.println("your number is not a three digit number");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
