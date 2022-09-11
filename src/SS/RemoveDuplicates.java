package SS;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	static char c1;

	public static void main(String[] args) {

		String lr = "vishakhapattanam";
		String lr1 = "java";
		char[] ch = lr.toCharArray();
		char[] ch1 = lr1.toCharArray();
		LinkedHashSet<Character> a = new LinkedHashSet<Character>();

		for (char o : ch) {

			a.add(o);
		}

		System.out.println(a);

		for (char o2 : a) {
			System.out.print(o2);
		}
		System.out.println();
		System.err.println("arrayList cannot remove duplicates");
		
		ArrayList ar=new ArrayList();
		for(Object o:ch1) {
			ar.add(o);
		}
		
		System.out.println(ar);
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.print(ar.get(i));
		}
	}

}
