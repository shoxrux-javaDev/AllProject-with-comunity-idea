import java.util.Scanner;

public class allOperation {
    public static void main(String[] args) {
        int a,b,c,d,g,s,e,t,q;
        double h,f,x,v,z,p;
        Scanner all = new Scanner(System.in);
        System.out.println("  Ayirish amali: ");
        System.out.println("Musbat son kiriting = ");
        a= all.nextInt();
        System.out.println("ikkinchi musbat sonni kiriting = ");
        b=all.nextInt();
        c=a-b;
        System.out.println("Ayirma = "+c);
        System.out.println("  Qo'shish amali:");
        System.out.println("Musbat son kiriting = ");
        d=all.nextInt();
        System.out.println("ikkinchi sonni kiriting = ");
        g= all.nextInt();
        s=d+g;
        System.out.println("Yig'indi = "+s);
        System.out.println("  ko'patirish amali");
        System.out.println("Son kiriting = ");
        e= all.nextInt();
        System.out.println("ikkinchi sonni kiriting = ");
        t=all.nextInt();
        q=e*t;
        System.out.println("Ko'paytma = "+q);
        System.out.println("  Bo'lish amali");
        System.out.println("son kiriting = ");
        h=all.nextDouble();
        System.out.println("ikkinchi sonni kiriting = ");
        f= all.nextDouble();
        x=h/f;
        System.out.println("Bo'linma = "+x);
        System.out.println("   Qoldiqli bo'lish amali = ");
        System.out.println("son kiriting = ");
        v= all.nextDouble();
        System.out.println("ikkinchi sonni kiriting = ");
        z= all.nextDouble();
        p=v%z;
        System.out.println("Qoldiq = "+p);

    }
}
