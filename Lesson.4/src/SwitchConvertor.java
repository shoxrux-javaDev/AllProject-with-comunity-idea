import java.util.Scanner;

public class SwitchConvertor {
    public static void main(String[] args) {
        double amount, result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("    Bizning konvertor dasturimizga xush kelibsiz");
        System.out.print("Miqdorni kiriting :");
        amount = scanner.nextDouble();
        System.out.println("USD");
        System.out.println("EUR");
        System.out.println("CNY");
        System.out.println("Pul birligini tanlang :");
        scanner = new Scanner(System.in);
        String from = scanner.nextLine();
        System.out.println("USD");
        System.out.println("EUR");
        System.out.println("CNY");
        System.out.println("Qaysi pul birlikga :");
        String to = scanner.nextLine();
        switch (to) {
            case "eur":
                if (from.equals("CNY")) {
                    result = amount * 0.123703;//1 CNY = 0.123703 EUR
                } else if (from.equals("USD")) {
                    result = amount * 0.842567;//1 USD = 0.842567 EUR
                } else {
                    result = amount;
                }
                break;
            case "usd":
                if (from.equals("EUR")) {
                    result = amount * 1.18685;//1 EUR = 1.18685 USD
                } else if (from.equals("CNY")) {
                    result = amount * 0.146321;//1 CNY = 0.146321 USD
                } else {
                    result = amount;
                }
                break;
            case "cny":
                if (from.equals("EUR")) {
                    result = amount * 8.08385;//1 EUR = 8.08385 CNY
                } else if (from.equals("USD")) {
                    result = amount * 6.83428;//1 USD = 6.83428 CNY
                } else {
                    result = amount;
                }
            default:
                System.out.println("noto'g'ri pul birlik");
        }
        System.out.println(result);

    }
}
