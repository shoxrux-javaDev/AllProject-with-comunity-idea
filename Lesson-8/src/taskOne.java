import java.util.Arrays;
import java.util.Scanner;
public class taskOne {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a, b = 0;
            System.out.print("son kiriting: ");
            a = scanner.nextInt();
            int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < number.length; i++) {
                if (a == number[i]) {
                    b++;
                    break;
                }
            }
            if (b >= 1) {
                System.out.println(a + " massivda mavjud");
            } else {
                System.out.println(a + " masivda mavjud emas!");
            }
        }
    }
}

