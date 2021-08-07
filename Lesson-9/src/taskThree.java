import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("10 xonali son kiriting: ");
        double a= scanner.nextDouble();
        double b=a+0.51;
        System.out.println("after enter double: "+b);
        int c=(int)b;
        System.out.println("int value: "+c);
        long d=(long)b;
        System.out.println("long value: "+d);
        short e=(short)b;
        System.out.println("short value: "+e);
        char f=(char)b;
        System.out.println("char value: "+f);
        byte g=(byte)b;
        System.out.println("byte value: "+g);
        float i=(float) b;
        System.out.println("float valuea: "+i);
    }
}
