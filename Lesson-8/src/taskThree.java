public class taskThree {
    public static void main(String[] args) {
        int b = 0;
        int[] nums = {9,24,14, 18, 347, 42, 51, 6, 778, 28, 90, 72, 1001, 7,77, 33,};
        for (int num : nums) {
            if (num % 3 == 0&&num%7!=0) {
                b++;
            }
        }
        System.out.println("massivdagi toq 3 ga bo'linadigan va 7 ga bo'linmaydigan sonlar soni - "+b+"ta");
    }
}

