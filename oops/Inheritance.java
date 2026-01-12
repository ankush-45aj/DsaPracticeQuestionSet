
class shape {

    public void area() {
        System.out.println("display area");

    }
}

class triangle extends shape {

    public void area(int length, int height) {
        System.out.println("display area of rectangle :" + length * height / 2);

    }
}

class equilateral extends triangle {

    public void area(int length, int height) {
        System.out.println("display area of rectangle :" + 0.5 * length * height);
    }
}

public class Inheritance {

    public static void main(String[] args) {

    }
}
