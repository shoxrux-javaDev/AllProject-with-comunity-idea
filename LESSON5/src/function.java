import java.util.Scanner;

public class function {
    public static void main(String[] args) {
//        double y, x;
//        Scanner func = new Scanner(System.in);
//        System.out.println(" f(x,y) =1/((x − y)^2 +1), 0 ≤x≤ 5, 0≤y≤10 Funksiya qiymatini hisoblaymiz");
//        System.out.print("y ning qiymatini kiriting =");
//        y = func.nextDouble();
//        System.out.print("x ning qiymatini kiriting =");
//        x = func.nextDouble();
//        calculator nomalum = new calculator();
//        System.out.println(nomalum.minor(y, x));
//    }
//        yil();
//        yil();
//        yil();
//        yil();
        //}

//    public static void yil() {
//        int a, b, c;
//        Scanner asr = new Scanner(System.in);
//        System.out.print("biror yil sonini kiriting :");
//        a = asr.nextInt();
//        b = a / 100;
//        if (a%100==0) {
//            System.out.println(b + " asrga teng");
//        } else  {
//            System.out.println((b+1) + " asrga teng");
//        }
        //gipot();


//        public static void gipot () {
//            Scanner katet = new Scanner(System.in);
//            double x, y, c = 0;
//            System.out.println("To'g'ri burchakli uchburchakni gipotenuzasini topilsin!");
//            System.out.print("1 katetni qiymatini kiriting :");
//            x = katet.nextDouble();
//            System.out.print("2 katetni qiymatini kiriting :");
//            y = katet.nextDouble();
//            calculator gip = new calculator();
//            System.out.println(gip.test(x, y, c));
//        }
        exerciseSix();
        exerciseSix();
        exerciseSix();
    }

    public static void exerciseSix() {
        Scanner fly = new Scanner(System.in);
        double a;
        System.out.println("Qiymati 0 dan 1 000 000 000 ixtiyoriy son kiriting!");
        a = fly.nextDouble();
        calculator tartib = new calculator();
        System.out.println("bu son "+tartib.group(a)+" xonali son turkumiga mansub.");

    }
}



