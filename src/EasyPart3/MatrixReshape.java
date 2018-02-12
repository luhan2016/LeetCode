package EasyPart3;
import java.util.Arrays;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	if(nums.length*nums[0].length != r*c)
    		return nums;
    	int newNums[][] = new int[r][c];
        for(int i=0; i<nums.length; i++) 
        	for(int j=0; j<nums[0].length; j++) 
    			newNums[(nums[0].length*i+j)/c][(nums[0].length*i+j)%c] = nums[i][j];
    	return newNums;
    }
    
    public static void main(String args[]) {
    	
    	int array1[][] = new int[4][1];
    	int array2[][] = new int[2][2];
        for(int i=0; i<array1.length; i++) 
        	for(int j=0; j<array1[0].length; j++) 
    			array1[i][j]=array1[0].length*i+j+1;
    	MatrixReshape fP = new MatrixReshape();
    	array2 = fP.matrixReshape(array1, 2, 2);
    	for(int i=0; i<2;i++)
    		for(int j=0; j<2;j++)
    		System.out.println(array2[i][j]);
    }
}
