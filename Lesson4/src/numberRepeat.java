import java.util.Scanner;

public class numberRepeat {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g;
        Scanner repaet = new Scanner(System.in);
        System.out.println("soni kiriting =");
        a = repaet.nextInt();
        b = a / 1000;
        c = a % 1000;
        d = c / 100;
        e = c % 100;
        f = e / 10;
        g = e % 10;
        if (b==d||b==f||b==g)
            System.out.println("takrorlanuvchi son = "+b);
        if(d==f||d==g) {
            System.out.println("takrorlanuvshi son = " + d);
        }else if(f==g) {
            System.out.println("takrorlanuvchi son = "+f);
        }else {
            System.out.println("takrorlanuvchi son mavjud emas");
        }
    }
}

