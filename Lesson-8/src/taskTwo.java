public class taskTwo {
    public static void main(String[] args) {
        int b = 0;
        int[] nums = {2, 18, 347, 43, 51, 6, 778, 8, 90, 10, 1001, 7, 33,};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                b++;
            }
        }
        System.out.println("massivdagi juft sonlar soni-"+b+"ta");
    }
}



