import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        //taskFirst();
        //second();
//        third();
//        third();
//        third();
//        fourth();
//        fourth();
//        fourth();
//        six();
//        six();
//        six();
//        seven();
//        seven();
//        seven();
//        method();
//        task10();
//        task13();
//        task7();
//        task14();
//        task12();
    }
    //    public static void taskFirst() {
//        for (; ; ) {
//            Scanner first = new Scanner(System.in);
//            System.out.print("Besht sonini kiriting:(0=>Exit) ");
//            int a = first.nextInt();
//            if (a == 0) {
//                return;
//            }
//            int b;
//            for (int i = 1; i <= 10; i++) {
//                b = a * i;
//                if (a != 5) {
//                    System.out.println("Bizda faqat besht sonining qiymati mavjud!");
//                    break;
//                }
//                System.out.println(i + ")5*" + i + "=" + b);
//
//            }
//        }
//    }
//    public static void second() {
//        for (; ; ) {
//            Scanner scanner = new Scanner(System.in);
//            int a, b, c;
//            System.out.print("x-ning qiymatini kiriting:(0=>Chiqish!) ");
//            a = scanner.nextInt();
//            System.out.print("y-ning qiymatini kiriting:(0=>Chiqish!) ");
//            b = scanner.nextInt();
//            System.out.print("biror son kiriting:(0=>Chiqish!) ");
//            c = scanner.nextInt();
//            System.out.println(a + " va " + b + " sonlari orasidagi " + c + "ga karali sonlar:");
//            if (c == 0 || a == 0 || b == 0) {
//                return;
//            }
//            for (int i = a; i <= b; i++) {
//                if (i % c != 0) {
//                    continue;
//                } else if (c < 0 || a < 0 || b < 0) {
//                    break;
//                }
//                System.out.println(i);
//            }
//        }
//    }
//    public static void third() {
//        for (;; ) {
//            int a,sum=0;
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("butun son kiriting:(0=>Chiqish) ");
//            a = scanner.nextInt();
//
//            if (a < 0) {
//                for (int i = 0; i > a; i--) {
//                    sum+=i;
//                }
//               System.out.println(sum);
//            } else if (a > 0) {
//                for (int i = 0; i < a; i++) {
//                    sum+=i;
//                }
//                System.out.println(sum);
//            } else {
//                System.out.println("butun son kiriting!");
//            }
//        }
//    }
//    public static void third() {
//        for (; ; ) {
//        Scanner sub = new Scanner(System.in);
//        System.out.println("Butun son kiriting: ");
//        int a= sub.nextInt();
//        int sum=0;
//        if (a<0) {
//            System.out.println("musbat bo'lgan butun son kiriting");
//           continue;
//        }
//        for (int i = 0; i < a; i++) {
//            sum=sum+i;
//        }
//        System.out.println("yig'indi="+sum);
//    }
//   }
//    public static void third() {
//        Scanner sub = new Scanner(System.in);
//        int a;
//        System.out.print("biror son kiriting");
//        a = sub.nextInt();
//        for (int i = 100; i < 999; i++) {
//            if (i % 10 != i / 100 && i / 100 != (i / 10) % 10 && i % 10 != (i / 10) % 10) {
//                System.out.println(i);
//            }
//        }
//    }
//    public static void fourth() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("7 sonini kiriting: ");
//        int a=scanner.nextInt();
//        int b,c,d;
//        for (int i = 1; i <=14 ; i++) {
//            b=a*i;
//            if (a != 7) {
//                System.out.println("yetti sonini kiriting!");
//            }
//            System.out.println(b);
//        }
//    }
//    public static void six() {
//        int b, c, d, e;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("son kiriting: ");
//        int a = scanner.nextInt();
//        for (int i = 2; i <= a / 2; i++) {
//            if (a % i == 0) {
//                System.out.println(a + " tub son emas");
//                return;
//            }
//        }
//        System.out.println(a + " tub son");
//    }
//    public static void seven() {
//        Scanner scanner = new Scanner(System.in);
//        int a=1;
//        for (int i = 0; i <10; i++) {
//            //System.out.println(Math.pow(2,i));
//            System.out.println(a);
//            a=a*2;
//         }
//
//        }
//           //    public static void task9() {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Alfabitni bosh harfini kiriting (katta harfda!): ");
////        String a=scanner.nextLine();
////        System.out.print("Alfabitni ohirgi harfini kiriting (katta harfda!): ");
////        String b=scanner.nextLine();
////        String c="ABCDEFGIHJKLMNOPQRSTUVWXYZ";
////        int d=c.indexOf(b);
////        String e=c.substring(0,25);
////            System.out.print(e);
////        }
//    }
//    public static void task10() {
//        int a, b, c;
//        for (int i = 100; i < 500; i++) {
//            a = i/100;
//            b=(i/10)%10;
//            c=i%10;
//            if (a + b + c == 15) {
//                System.out.print(i+" ");
//            }
//            }
//        }
//    public static void task13() {
//        for (int i = 30; i <100; i++) {
//            if (i%3==0&&(i%10==2)||i%3==0&&(i%10==4)||i%3==0&&(i%10==8)){
//                System.out.print(i+" ");
//            }
//        }
//    }
//    public static void task7() {
//        int a = 1;
//        for (int i = 1; i <10; i++) {
//            a=a*2;
//            System.out.print(a+" ");
//
//        }
//    }
//    public static void task14() {
//        int a, b, c, d, e = 2;
//        for (int j = 2; j < 8; j++) {
//            if (j % 2 != 0||j==e) {
//                System.out.print(j + " ");
//            }
//        }
//        for (int i = 2; i <= 100; i++) {
//            a = i % 2;
//            b = i % 3;
//            c = i % 7;
//            d = i % 5;
//            if (a != 0 && b != 0 && c != 0 && d != 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}
//    public static void task12() {
//        double s = 10, kun = 1, sum = 0;
//        while (true) {
//            s = s + s / 10;
//            sum += s;
//            kun++;
//            if (s >= 20) {
//                System.out.println("yo'l " + s);
//                System.out.print("kun " + kun);
//                break;
//            } else if (sum > 100) {
//                System.out.println("kun " + kun);
//                System.out.println("umumiy yo'l " + sum);
//            }
//        }
//    }
}






