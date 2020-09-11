package udemy;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int reverse=0;
		int n = sc.nextInt();
		while(n!=0) {
		int end=n%10;
		reverse=reverse*10+end;
		n=n/10;
		
		}
		System.out.println(reverse);

	}

}
