import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) 
     {
        Map<Integer, Integer> map = new HashMap<>();
        int find = 0;
     
        for(int i = 0; i < nums.length; i++)
        {
            find = target - nums[i];
            if(map.containsKey(find))
            {
            return new int[]{map.get(find), i};
        
            }
            else
            {
                map.put(nums[i], i);
            }
       }

       
       throw new IllegalArgumentException("No solution found.");
     }
}