package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int residue = target - nums[i];
            if(m.containsKey(residue)){
                return new int [] {m.get(residue), i};
            }
            m.put(nums[i], i);
        }
        throw new IllegalArgumentException("No numbers for Target");
    }
}
