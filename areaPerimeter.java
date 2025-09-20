import java.util.Scanner;

public class areaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter a length of rectangle");
            int l = sc.nextInt();
            System.out.println("enter a breadth of rectangle");
            int b = sc.nextInt();
            if (l * b > 2 * (l + b)) {
                System.out.println("area is greater");
            } else if (l * b < 2 * (l + b)) {
                System.out.println("perimeter is greater");
            } else {
                System.out.println("area and perimeter");
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
