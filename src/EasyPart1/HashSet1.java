package EasyPart1;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            System.out.println(set);
            if (set.contains(ch)) {
            	System.out.println("exit allUnique function");
            	return false;
            }
            set.add(ch);
            System.out.println(set);
        }
        return true;
    }
    public static void main(String args[]) {
    	String s1 = new String("pwwkew");
    	System.out.println(lengthOfLongestSubstring(s1));
    }
}