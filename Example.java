package udemy;

import java.util.*;

public class Example {
	

	public static void main(String S[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		//char[] arr=s.toCharArray();
		Set<Character> hset=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hset.add(s.charAt(i));
		}
		//System.out.println(hset.toString());
		for(Character ch : hset) 
            System.out.print(ch);
		
		
		System.out.println("");
		
		
    } 
		

	}


