package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
	        Map<Integer,Integer> map = new HashMap<>();
	        
	        for(int i=0;i<nums.length;i++){
	            int temp = (target-nums[i]);
	            if(map.containsKey(temp)){
	                return (new int[]{map.get(temp),i});
	            }else{
	                map.put(nums[i],i);
	            }
	        }
	        
	        throw new IllegalAccessException("No Match found");
	        
	      
	    }
	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		int[] input=new int[] {1,2,3,4};
		int target = 3;
		int result[] = twoSum(input,target);

			System.out.println(Arrays.toString(result));
		
		
	}

}
