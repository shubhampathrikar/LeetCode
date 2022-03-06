import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
public class ContainsDuplicate {

	public boolean containsDuplicate(Integer[] nums) {

		boolean result = false;

		outerLoop: for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println(j);
				if (nums[i] == nums[j]) {
					result = true;
					break outerLoop;
				}
			}
		}

		return result;
	}

	public boolean containsDuplicateHashMap(Integer[] nums) {

		boolean result = false;

		Map<Integer,Integer> hashMap = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			if(hashMap.containsKey(nums[i])) {
				result = true;
			}else {
				hashMap.put(nums[i], i);
			}
		}

		return result;
	}
	
	public boolean containsDuplicateHashSet(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }
        if (nums.length <= 1) {
            return false;
        }

        HashSet<Integer> found = new HashSet<>();
        for (int n : nums) {
            if (!found.add(n)) {
                return true;
            }
        }

        return false;
    }

}
