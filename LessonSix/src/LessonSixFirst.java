
import java.util.Scanner;

public class LessonSixFirst {
    public static void main(String[] args) {
//      matn();
//      matn();
//      matn();
//        takror();
//        takror();
//        louse();
//        louse();
//        louse();
//        firth();
//        firth();
//        firth();
//        five();
//        five();
//        five();
//        six();
//        six();
//        six();
//        seven();
//        seven();
//        seven();
//        lookat();
//        lookat();
//        lookat();
//        nine();
//        nine();
//        nine();
        ten();
        ten();
        ten();
        ten();
        ten();
    }

    //    public static void matn(){
//        Scanner first = new Scanner(System.in);
//        System.out.print("Birinchi matni kiriting: ");
//        String a=first.nextLine();
//        System.out.print("Ikkinchi matni kiriting: ");
//        String b= first.nextLine();
//        System.out.println(a+b+b+a);
//    }
//public static void takror(){
//    Scanner second = new Scanner(System.in);
//    System.out.print("5 ta harfli ism kiriting: ");
//    String a= second.nextLine();
//    System.out.println(a.substring(3,5)+a.substring(3,5)+a.substring(3,5));
//}
//public static void louse(){
//    Scanner second = new Scanner(System.in);
//    System.out.print("Matn kiriting: ");
//    String a= second.nextLine();
//    int b=a.length();
//    if(b>2){
//        System.out.println(a.substring(0,2));
//    }else{
//        System.out.println(a);
//    }
//}
//    public static void firth() {
//        Scanner second = new Scanner(System.in);
//        System.out.print("5 ta harli matn kiriting: ");
//        String a = second.nextLine();
//        System.out.println(a.substring(1,4));
//    }

    //    public static void five() {
//        Scanner satr = new Scanner(System.in);
//        System.out.print("Birinchi matni kiriting: ");
//        String a = satr.nextLine();
//        System.out.print("Ikkinchi matni kiriting: ");
//        String b = satr.nextLine();
//        int c = a.length();
//        int d = b.length();
//        if (c >= 2 && d >= 2) {
//            System.out.println(a.substring(1) + b.substring(1));
//        } else {
//            System.out.println("Satr 2 harfdan kam bo'lmasin");
//        }
//    }
//public static void six() {
//    Scanner look = new Scanner(System.in);
//    System.out.print("Matni kiriting: ");
//    String a = look.nextLine();
//    int b = a.length();
//    if (b == 4) {
//        System.out.println(a.substring(1,3));
//    } else if(b == 6) {
//        System.out.println(a.substring(2,4));
//    }else if(b == 8){
//        System.out.println(a.substring(3,5));
//    }else{
//        System.out.println("juft hamda juftligi 8 harfdan oshmagan matn kiriting");
//    }
    //  }
//    public static void seven() {
//        Scanner book = new Scanner(System.in);
//        System.out.print("Matni kiriting: ");
//        String a = book.nextLine();
//        System.out.println("index raqamini kiriting");
//        int b = book.nextInt();
//        int c = a.length();
//
//        if (b >= 0 && (b+2)<=c) {
//            System.out.println(a.substring(b, b+2));
//        } else {
//            System.out.println(a.substring(0, 2));
//        }
//    }

    //    public static void lookat() {
//        Scanner eight = new Scanner(System.in);
//        System.out.print("Birinchi matni kiriting: ");
//        String a = eight.nextLine();
//        System.out.print("Ikkinchi matni kiriting: ");
//        String b = eight.nextLine();
//        String  c = a.substring(a.length() - 1);
//        String d = b.substring(0,1);
//        String e= a.substring(0,a.length()-1);
//        if (c.equals(d)) {
//            System.out.println(e+b);
//        }else{
//            System.out.println(a+b);
//        }
    // }
//    public static void nine() {
//        Scanner change = new Scanner(System.in);
//        System.out.println("matn kiriting: ");
//        String a = change.nextLine();
//        String b = a.substring(a.length() - 1);
//        String c = a.substring(a.length() - 2, a.length() - 1);
//        String d = a.substring(0,a.length()-2);
//        System.out.println(d+b+c);
//    }
    public static void ten() {
        Scanner start = new Scanner(System.in);
        System.out.print("Matn kiriting: ");
        String a = start.nextLine();
        String b = a.substring(0, 1);
        String c = a.substring(1, 2);
        String d = a.substring(2);
        if (b.equals("a") && c.equals("b")) {
            System.out.println(b + c + d);
        } else if (c.equals("b")) {
            System.out.println(c + d);
        } else if (b.equals("a")) {
            System.out.println(b + d);
        } else {
            System.out.println(d);
        }
    }
}


