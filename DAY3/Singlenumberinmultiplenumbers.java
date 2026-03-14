
public class Singlenumberinmultiplenumbers {

    public static void main(String[] args) {
        int[] nums = {7, 3, 5, 3, 7};
        Singlenumberinmultiplenumbers s = new Singlenumberinmultiplenumbers();
        System.out.println(s.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        // write your code here
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
