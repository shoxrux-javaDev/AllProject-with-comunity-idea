import java.util.Scanner;

public class exerciseOne {
    public static void main(String[] args) {

number();

    }

    public static void number() {
        double a;
        Scanner one = new Scanner(System.in);
        System.out.print("son kiriting : ");
        a = one.nextDouble();

        if (a > 0 && a != 0) {
            System.out.println(a + " mubat son");
        } else {
            System.out.println(a + " manfiy son");
        }

    }
}

