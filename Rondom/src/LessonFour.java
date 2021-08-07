import java.util.Scanner;

public class LessonFour {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner done = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting =");
        a = done.nextInt();
        System.out.print("Ikkinchi Sonni kiriting =");
        b = done.nextInt();


        if(a>b) {
            c=a-b;
            System.out.print("ayirma ="+c);
        }
        else if(a<b){
            d = b-a;
            System.out.print("ayirma ="+d);
        }


        }

    }

