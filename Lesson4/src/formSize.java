import java.util.Scanner;

public class formSize {
    public static void main(String[] args) {
        int n,b,c,d;
        Scanner form=new Scanner(System.in);
        System.out.println("biror bir bir xonali son kiriting =");
        n=form.nextInt();
        b=n*11;
        c=n*111;
        d=n*1111;
        //n+nn+nnn+nnnn
        System.out.println("Natija = "+(n+b+c+d));
    }
}

