import java.util.Scanner;

public class cc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Dollar");
        System.out.println("2 - Rubl");
        System.out.println("3 - Sum");

        System.out.print("Valyuta turini tanlang = ");

        int holder;
        double b, holderSumma;
        int a = scanner.nextInt();

        switch (a){
            case 1:{
                System.out.println("Dollar dan qaysi valyutaga konvert qilmoqchisiz?");
                System.out.println("1 - Rubl");
                System.out.println("2 - Sum");
                System.out.print("Konvert turini tanlang = ");

                holder = scanner.nextInt();

                switch (holder){
                    case 1:{
                        System.out.print("Summasini kiriting =");
                        holderSumma = scanner.nextDouble();
                        b = holderSumma * 75.9645;
                        System.out.println(holderSumma +  " - Dollar " + b + " - Rubl bo'ladi");
                        break;
                    }
                    case 2:{
                        System.out.print("Summasini kiriting =");
                        holderSumma = scanner.nextDouble();
                        b = holderSumma * 10274.17;
                        System.out.println(holderSumma +  " - Dollar " + b + " - Sum bo'ladi");
                        break;
                    }
                    default:{
                        System.out.println("Bunday valyuta turi yoq!!!");
                        break;
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Rubl dan qaysi valyutaga konvert qilmoqchisiz?");
                System.out.println("1 - Dollar");
                System.out.println("2 - Sum");
                System.out.print("Konvert turini tanlang = ");

                holder = scanner.nextInt();
                switch (holder){
                    case 1:{
                        System.out.print("Summasini kiriting =");
                        holderSumma = scanner.nextDouble();
                        b = holderSumma / 75.9645;
                        System.out.println(holderSumma +  " - Rubl " + b + " - Dollar bo'ladi");
                        break;
                    }
                    case 2:{
                        System.out.print("Summasini kiriting =");
                        holderSumma = scanner.nextDouble();
                        b = holder * 136.28;
                        System.out.println(holderSumma +  " - Rubl " + b + " - Sum bo'ladi");
                        break;
                    }
                    default:{
                        System.out.println("Bunday valyuta turi yoq!!!");
                        break;
                    }
                }
                break;
            }
            case 3:{
                System.out.println("Sum dan qaysi valyutaga konvert qilmoqchisiz?");
                System.out.println("1 - Dollar");
                System.out.println("2 - Rubl");
                System.out.print("Konvert turini tanlang = ");

                holder = scanner.nextInt();

                switch (holder){
                    case 1:{
                        System.out.print("Summasini kiriting =");
                        holderSumma = scanner.nextDouble();
                        b = holderSumma / 10274.17;
                        System.out.println(holderSumma +  " - Sum " + b + " - Dollar bo'ladi");
                        break;
                    }
                    case 2:{
                        System.out.print("Summasini kiriting =");
                        holderSumma = scanner.nextInt();
                        b = holderSumma / 136.28;
                        System.out.println(holderSumma +  " - Sum " + b + " - Rubl bo'ladi");
                        break;
                    }
                    default:{
                        System.out.println("Bunday valyuta turi yoq!!!");
                        break;
                    }
                }
                break;
            }
            default:{
                System.out.println("Bunday valyuta turi yoq!!!");
                break;
            }
        }
    }
}

