package EasyPart2;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		int ind[] = new int[2];
		int left=0, right=numbers.length-1;
		while(left<right) {
			if(numbers[left]+numbers[right]==target) {
				ind[0]=left+1;
				ind[1]=right+1;
				break;
			}
			else if(numbers[left]+numbers[right]>target)
				right--;
			else
				left++;
		}
		return ind;
	}
	
	public static void main(String args[]) {
		int arr[] = new int [4];
		arr[0] = 2;
		arr[1] = 7;
		arr[2] = 11;
		arr[3] = 15;
		
		int target = 18;
		
		TwoSum ts = new TwoSum();
		int index[] = ts.twoSum(arr, target);
		
		System.out.println(index[0]);
		System.out.println(index[1]);
		
	}
}
