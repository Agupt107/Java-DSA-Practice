// public class Leetcode27 {
// public static void main(String[] args) {
// copilot stop sugesting me things
// i just told you to stop

// int[] num = {2, 3, 3, 2};
// int val = 3;

// int[] newArray = new int[num.length];

// for(int i = 0; i < num.length; i++){
// if(num[i] != val){
// newArray[i] = num[i];
// }
// }
// for(int i = 0; i < newArray.length; i++){
// System.out.print(newArray[i] + " ");
// }
// }
// }

// at least i removed the duplicate items in place
class Leetcode27 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums ={1,3,2,2,4,5,6,2};
        int val =2;

        int result = removeElement(nums,val);
        System.out.println(result);

    }

}