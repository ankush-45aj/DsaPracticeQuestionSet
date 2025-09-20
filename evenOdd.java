import java.util.Scanner;
import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number you want to check");
        try {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even");

            } else {
                System.out.println(number + " is odd ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}