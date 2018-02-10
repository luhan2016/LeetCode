package Facebook;

import java.util.ArrayList;

public class PerformOps {
	static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
            for (int j = 0; j < A.get(i).size(); j++) 
                B.get(i).add(0);
            for (int j = 0; j < A.get(i).size(); j++) 
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
        }
        return B;
	}
	
	public static void main(String []args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		a.add(1);		a.add(2);		a.add(3);		a.add(4);
		b.add(5);		b.add(6);		b.add(7);		b.add(8);
		c.add(9);		c.add(10); 		c.add(11);		c.add(12);
		A.add(a);	A.add(b); 	A.add(c);
		
		for(int i=0;i<3;i++)
			System.out.println(A.get(i));
		
		ArrayList<ArrayList<Integer>> B = performOps(A);
		for (int i = 0; i < B.size(); i++) 
		    for (int j = 0; j < B.get(i).size(); j++) 
		            System.out.print(B.get(i).get(j) + " ");
	}
}
