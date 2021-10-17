package kadane;

public class MaxSubArray {

	  public static int maxSubArray(int[] nums) {
	        
	        if(nums.length>1){
	        int localMax=0;
	        int globalMax=Integer.MIN_VALUE;
	        
	        for(int num: nums)
	        {
	            localMax=Math.max(num,num+localMax);
	            if(localMax>globalMax)
	            {
	                globalMax=localMax;
	            }
	        }
	        return globalMax;
	        }
	        else
	            return nums[0];
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}
