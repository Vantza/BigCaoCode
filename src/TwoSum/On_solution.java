package TwoSum;
/**
 * It only go through the list once. 
 * It's shorter and easier to understand. 
 * Hope this can help someone. 
 * Please tell me if you know how to make this better :)
 */

import java.util.HashMap;
import java.util.Map;

public class On_solution {
	public int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i);
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		On_solution ts = new On_solution();
		int[] nums = new int[]{2,3,5,7};
		int target = 8;
		System.out.println("[" + ts.twoSum(nums,target)[0] + "," + ts.twoSum(nums,target)[1] + "]");
	}
}
