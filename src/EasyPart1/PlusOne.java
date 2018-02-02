package EasyPart1;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }
    
    public static void main(String args[]) {
    	int digits[] = new int[2];
    	digits[0] = 1;
    	digits[1] = 0;
    	int result [] = plusOne(digits);
    	for(int i=0; i<result.length;i++)
    		System.out.println(result[i]);
    }
}
