public class taskFive {
    public static void main(String[] args) {
        taskEnd();
    }
    static void taskEnd() {
        int b = 0, c = 0,d;
        int[] nums = {4, 6, 4, 8, 10, 4, 2, 6, 14};
        for (int i = 0; i <nums.length; i++) {
            c++;
            if (nums[i] % 2 != 0) {
                b += nums[i];
                break;
            }else if(c==nums.length){
                b-(b);
                break;
            }
        }

        System.out.println("masivlar yig'indisi = " + b);
        System.out.println("masivlar yig'indisi = " + b);
        System.out.println("masivlar yig'indisi = " + b);
        System.out.println("masivlar yig'indisi = " + b);
    }
}

