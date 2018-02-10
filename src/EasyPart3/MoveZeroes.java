package EasyPart3;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
    	int tmp[] = new int[nums.length], j=0;
    	for(int i=0; i<nums.length; i++) 
    		if(nums[i]!=0) {
    			tmp[j] = nums[i];
    			j++;
    		}
    	for(int i=0; i<nums.length; i++) 
    		nums[i]= tmp[i]; 
    }
    
    public static void main(String args[]) {
    	int arr[] = new int[3];
    	arr[0] = 0;
    	arr[1] = 0;
    	arr[2] = 1;
    	MoveZeroes a = new MoveZeroes();
    	a.moveZeroes(arr);
    	for(int i=0; i<3; i++)
    		System.out.println(arr[i]);
    }
}