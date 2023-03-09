package test;

import java.util.Scanner;

public class JavaScanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자");
		int start = sc.nextInt();
		
		System.out.println("마지막 숫자");
		int end = sc.nextInt();
		int sum=0;
		for(int i=start; i<=end; i++) {
			sum+=i;
		}
		System.out.println(start + "부터" + end +"의 합은 : " + sum);
	}
	
}
