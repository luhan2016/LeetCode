package EasyPart3;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int tmp[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        	tmp[i] = nums[(i+k)%nums.length];
    	nums = tmp;
    	for(int i=0; i<nums.length;i++)
    		System.out.println(nums[i]);
    }
    
    public static void main(String args[]) {
    	int nums[] = new int[7];
    	for(int i=0; i<7; i++)
    		nums[i] = i+1;
    	Rotate r = new Rotate();
    	r.rotate(nums, 3);
    }
}
