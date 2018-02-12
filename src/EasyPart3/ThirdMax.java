package EasyPart3;

import java.util.Arrays;

public class ThirdMax {
	public static int thirdMax(int[] nums) {
		int count=0;;	
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i++)
			nums[i]=nums[i]==nums[i+1]?-1:nums[i];
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) 
			count = nums[i]!=-1?count+1:count;
		if(count >2)
			return nums[nums.length-3];
		return nums[nums.length-1];
	}
	public static void main(String args[]) {
		int array[] = new int[4];
		array[0] = 2;
		array[1] = 2;
		array[2] = 2;
		array[3] = 1;
		
		ThirdMax tM = new ThirdMax();
		System.out.println(tM.thirdMax(array));
	}
}
