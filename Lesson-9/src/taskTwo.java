import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        taskSecond();
    }

    public static void taskSecond() {
        float a, b;
        long c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Butun son kiriting: ");
        a = scanner.nextFloat();
        System.out.print("Butun son kiriting: ");
        c = scanner.nextLong();
        b = a - c;
        System.out.println(b);

    }
}
