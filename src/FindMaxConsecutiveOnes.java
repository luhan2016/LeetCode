
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
		int ones=0, max=0;
    	for(int i=0; i<nums.length; i++) {
    		ones=nums[i]==1?ones+1:0;
			max=max<ones?ones:max;
    	}
    	return max;
    }
    public static void main(String args[]) {
    	int nums[] = new int[6];
    	nums[0] = 1;
    	nums[1] = 0;
    	nums[2] = 1;
    	nums[3] = 1;
    	nums[4] = 0;
    	nums[5] = 1;
    	
    	FindMaxConsecutiveOnes fM = new FindMaxConsecutiveOnes();
    	
    	System.out.println(fM.findMaxConsecutiveOnes(nums));
    }
    
    
}
