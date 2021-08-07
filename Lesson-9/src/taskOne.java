import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        int a;
        double e,f;
        taskfirst();
    }
    static void taskfirst(){
        int a; double e, f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Butun son kiriting: ");
        a=scanner.nextInt();
        System.out.print("Butun son kiriting: ");
        e=scanner.nextDouble();
        f=a+e;
        System.out.println("yig'indi= "+f);
    }
}
