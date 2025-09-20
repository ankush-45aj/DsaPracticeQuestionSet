import java.util.Scanner;

public class threeCordinatesInStraightLine {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a cordinates of first point : ");
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println("your  cordinates of first point are :" + "(" + x + "," + y + ")");
            System.out.println("enter cordinates of a second points");
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            System.out.println("your  cordinates of first point are :" + "(" + x1 + "," + y1 + ")");
            System.out.println("enter cordinates of a third points");
            int x2 = sc.nextInt(), y2 = sc.nextInt();
            System.out.println("your  cordinates of first point are :" + "(" + x1 + "," + y1 + ")");
            int m = (y1 - y) / (x1 - x);
            int m1 = (y2 - y1) / (x2 - x1);
            if (m == m1) {
                System.out.println("your points are in straight line");
            } else {
                System.out.println("your points are not in straight line");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
