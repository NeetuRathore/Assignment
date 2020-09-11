package udemy;

public class subPalindrome {
	public static String palindrome(int i,int j,String s){
        while(i>=0 && j<s.length()-1 && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
	public static int addition(int i,int j) {
		return i+j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="aaaaaaaaaabbabccccccccccccaacccaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacccccccccccccbabbaaaaaaaaaaaaaaaaaaaaaaaaa";
       if(s.length()<2){
           System.out.println(s);
       }
      String result="";
       for(int i=0;i<s.length()-1;i++){
           String s1=palindrome(i,i,s);
           String s2=palindrome(i,i+1,s);
           
           if(s1.length()>result.length())
               result=s1;
           if(s2.length()>result.length())
               result=s2;
       }
       System.out.println(result);
		System.out.println(addition(3,2));
	}

}
