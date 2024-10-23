public class Question4 {
    public static void main(String[] args) {
    int[] nums = {3,7,2,9,4};
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
        System.out.print("/ i ="+i);
        System.out.print("/ min ="+max);
        System.out.print("/ num[i] = "+nums[i]);
        if (nums[i] > max) {
            max = nums[i];
        }
    }
    System.out.println(max);
    }
}
