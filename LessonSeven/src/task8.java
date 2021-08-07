public class task8 {
    public static void main(String[] args) {
        int a = 7, b = 7;

        // method3(a, b);
        method5();
    }
//    public static void method3(int a) {
//        for (int i = 1; i <= 4; i++) {
//            System.out.println("");
//            for (int j = a - i; j > 0; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" "+i);
//            }
//        }
//    }
    //    }

//    public static void method3(int a, int b) {
//        for (int i = 1; i <= 7; i++) {
//            System.out.println("");
//            for (int j = a - i; j > 0; j--) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" " + i);
//            }
//            for (int j = 6; j <= 7; j++) {
//                System.out.println("");
//                for (int k = b - j; k > 0; k--) {
//                    System.out.print(" ");
//                }
//                for (int k = 1; k <= j; k++) {
//                    System.out.print(" " + j);
//                }
//            }
//        }
//    }
    public static void method5() {
        for (int i = 1; i <= 7; i++) {
            int a = 7;
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = 6; i >= 1; i--) {
            int b = 6;

            for (int j = 0; j <= b - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}


