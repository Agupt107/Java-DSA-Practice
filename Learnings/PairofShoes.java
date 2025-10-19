/*Given an array of integers where each number represents a shoe size, 
find the maximum number of pairs that can be formed. A pair is valid only if 
two shoes have the same size.
*/
public class PairofShoes {
    public static int getMax(int[] nums) {
        int max = nums[0];
        for (int x : nums) {
            if (x > max) {
                max = x;
            }

        }
        return max;
    }

    /*
     * Count frequencies → Use a frequency array (or HashMap) to count how many
     * shoes of each size exist.
     * Form pairs → For each shoe size, the number of pairs = frequency / 2. Add
     * these up to get the total.
     */

    public static void main(String[] args) {

        int[] nums = { 2, 2, 1, 1 };

        int max = getMax(nums);

        int[] count = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int sum = 0;

        for (int x : count) {

            int result = x / 2;
            sum = sum + result;
        }

        System.out.println(sum);

    }
}
