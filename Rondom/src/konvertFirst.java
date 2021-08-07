
import java.util.Scanner;

public class konvertFirst {
    public static void main(String[] args) {
        double a,USD,SUM;
        Scanner konvertor = new Scanner(System.in);
        System.out.println("Welcome to Konvertor form USD to SUM");
        System.out.print("Amount = ");
        a= konvertor.nextDouble();
        USD=1200;
        SUM=USD*a;
        System.out.println(SUM+"SUM");

    }
}
