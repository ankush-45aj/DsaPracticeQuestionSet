
public class Fraction {

    public static class FractionNumber {

        int numerator1;
        int denominator1;
        int numerator2;
        int denominator2;

        public int add() {
            return ((this.numerator1 * this.denominator2) + (this.numerator2 * this.denominator1)) / (this.denominator1 * this.denominator2);

        }

        public int subtract() {
            return ((this.numerator1 * this.denominator2) - (this.numerator2 * this.denominator1)) / (this.denominator1 * this.denominator2);

        }

        public FractionNumber(int numerator1, int denominator1, int numerator2, int denominator2) {
            this.numerator1 = numerator1;
            this.denominator1 = denominator1;
            this.numerator2 = numerator2;
            this.denominator2 = denominator2;
        }

    }

    public static void main(String[] args) {
        FractionNumber f1 = new FractionNumber(2, 3, 9, 5);
        System.out.println(f1.add());
        System.out.println(f1.subtract());

    }
}
