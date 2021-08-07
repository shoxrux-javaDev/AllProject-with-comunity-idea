import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int a,b,c,d,f,miqdor;
        double USD,EUR,CNY,birlikdan;
        Scanner konvert=new Scanner(System.in);
        System.out.println("Valyuta konvertori");
        System.out.print("Miqdor: ");
        a=konvert.nextInt();
        System.out.println("1.USD");
        System.out.println("2.UER");
        System.out.println("3.CNY");
        System.out.print("Bul birlik: ");
        //konvert=new Scanner(System.in);
        birlikdan = konvert.nextInt();
        System.out.println("1.USD");
        System.out.println("2.UER");
        System.out.println("3.CNY");
        System.out.print("Tanlang : ");
        String birlikga= konvert.nextLine();
        //switch ()
    }
}
