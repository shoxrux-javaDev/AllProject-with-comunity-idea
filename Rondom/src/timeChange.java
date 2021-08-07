import java.util.Scanner;

public class timeChange {
    public static void main(String[] args) {
        int a,b,c,d,g;
        Scanner time = new Scanner(System.in);
        System.out.println("sekundni kiriting = ");
        a= time.nextInt();
        b=a/3600;
        c=a%3600;
        d=c/60;
        g=c%60;
        System.out.println("Natija : "+b+":"+d+":"+g);
    }
}
