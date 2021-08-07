public class method {
    public static void main(String[] args) {
        method();
    }

    //        public static void method() {
//            int b = 1;
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("");
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(j + "");
//                }
//            }
//        }
//    public static void method3() {
//        int b = 1;
//        for (int i = 1; i <= 4; i++) {
//            System.out.println(" ");
//            for (int j = 0; j < i; j++) {
//                System.out.print(i + " ");
//            }
//        }
//    }
    public static void method() {

        int b = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+b);
                b++;
                if (b == 11) {
                    return;
                }
            }
        }
    }

//        public static void method() {
//        int b = 1;
//        for (int i = 1; i <= 4; i++) {
//            System.out.println("");
//            for (int j = 0; j < i; j++) {
//                System.out.print(b + " ");
//                b++;
//                }
//            }
//        }

    }
