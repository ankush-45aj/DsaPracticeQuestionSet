
public class printStars {
   public static void main(String[] args) {
      printStarsFirst();

   }

   public static void printStarsFirst() {
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < i + 1; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}