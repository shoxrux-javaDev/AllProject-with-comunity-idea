import java.util.Scanner;

class taskFive {
    public static void main(String[] args) {

        System.out.print("Son kiriting = ");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = n, b = 0;
        while (a != 0) {
            a /= 10;
            b++;
        }

        long i = 1, d = 1;
        while (i < b) {
            d *= 10;
            i++;
        }

        while (b >= 1) {
            a = n / d;
            if (b % 3 == 2 || b == 2) {
                switch ((int) a) {
                    case 1: {
                        System.out.print("o'n ");
                        break;
                    }
                    case 2: {
                        System.out.print("yigirma ");
                        break;
                    }
                    case 3: {
                        System.out.print("o'ttiz ");
                        break;
                    }
                    case 4: {
                        System.out.print("qirq ");
                        break;
                    }
                    case 5: {
                        System.out.print("ellik ");
                        break;
                    }
                    case 6: {
                        System.out.print("oltmish ");
                        break;
                    }
                    case 7: {
                        System.out.print("yetmish ");
                        break;
                    }
                    case 8: {
                        System.out.print("sakson ");
                        break;
                    }
                    case 9: {
                        System.out.print("to'qson ");
                        break;
                    }
                }
            } else {
                switch ((int) a) {
                    case 1: {
                        System.out.print("bir ");
                        break;
                    }
                    case 2: {
                        System.out.print("ikki ");
                        break;
                    }
                    case 3: {
                        System.out.print("uch ");
                        break;
                    }
                    case 4: {
                        System.out.print("to'rt ");
                        break;
                    }
                    case 5: {
                        System.out.print("besh ");
                        break;
                    }
                    case 6: {
                        System.out.print("olti ");
                        break;
                    }
                    case 7: {
                        System.out.print("yetti ");
                        break;
                    }
                    case 8: {
                        System.out.print("sakkiz ");
                        break;
                    }
                    case 9: {
                        System.out.print("to'qqiz ");
                        break;
                    }
                }
            }
            if (b % 3 == 0) {
                System.out.print("yuz ");
            }
            switch ((int) b) {
                case 4: {
                    System.out.print("ming ");
                    break;
                }
                case 7: {
                    System.out.print("million ");
                    break;
                }
                case 10: {
                    System.out.print("milliard ");
                    break;
                }
                case 13: {
                    System.out.print("trillion ");
                    break;
                }
            }
            n = n % d;//12%10=2
            d /= 10;//1
            b--;
        }

    }
}

