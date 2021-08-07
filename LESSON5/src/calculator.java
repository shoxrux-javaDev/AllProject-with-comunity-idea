
public class calculator {
    //    public double test(double x, double b, double k) {
//        if (x > 0 && x < 40) {
//            return k * (x * x) + b;
//        } else {
//            return x;
//        }
//    }
//
//    public double minor(double y, double x) {
//        if (x >= 0 && x <= 5 && y >= 0 && y <= 10) {
//            return 1 / ((x - y) * (x - y) + 1);
//        } else {
//            return 0;
//        }
////    }
//    public double test(double x, double y, double c) {
//        return c = Math.sqrt(x * x + y * y);
//    }
    public double group(double a){
        if (a / 1000000000 >= 1) {
            return 10;
        } else if (a / 100000000 >= 1) {
            return 9;
        } else if (a / 10000000 >= 1) {
            return 8;
        } else if (a / 1000000 >= 1) {
            return 7;
        } else if (a / 100000 >= 1) {
            return 6;
        } else if (a / 10000 >= 1) {
            return 5;
        } else if (a / 1000 >= 1) {
            return 4;
        } else if (a / 100 >= 1) {
            return 3;
        } else if (a / 10 >= 1) {
            return 2;
        } else {
            return 1;
        }
    }
    }




