package udemy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "abcabcbb";
       char[] arr= s.toCharArray();
       int start=0;
       int result=0;
       Set<Character> hset= new HashSet();
       for(int i=0;i<arr.length;i++){
    	  while(hset.contains(arr[i])) {
    			  hset.remove(arr[start]);
    			  start++;
    		  }
    		  hset.add(arr[i]);
    		   result=Math.max(result,hset.size());  
    	  
       }
       System.out.println(result);
       }
	}


