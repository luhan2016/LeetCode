package EasyPart3;
import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++)
			if(nums[i]!=i)
				return i;
		return nums.length;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0] = 3;
		arr[1] = 1;
		arr[2] = 0;
		MissingNumber mn = new MissingNumber();
		System.out.println(mn.missingNumber(arr));
	}
}
