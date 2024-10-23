public class Question5 {
    public static void main(String[] args) {
        int[] nums = {12, 3, 19, 7, 5};
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            System.out.print("/ i ="+i);
            System.out.print("/ min ="+min);
            System.out.print("/ num[i] = "+nums[i]);
            if (nums[i] < min) {
                min = nums[i];
            }
            System.out.println();
        }
        System.out.println(min);
    }
}
