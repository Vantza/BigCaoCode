package TwoSum;
/**
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	
 * @author cary.cao
 *
 */
public class BC_TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
        for(int i=1; i<nums.length; i++) {
            for(int j=0;j<i;j++) {
                if(nums[i] + nums[j] == target) {
                    indices[0] = j;
                    indices[1] = i;
                	return indices;
                } 
            }
        }
		return indices;
    }
	
	public static void main(String[] args) {
		BC_TwoSum ts = new BC_TwoSum();
		int[] nums = new int[]{3,3};
		int target = 6;
		System.out.println("[" + ts.twoSum(nums,target)[0] + "," + ts.twoSum(nums,target)[1] + "]");
	}
}
