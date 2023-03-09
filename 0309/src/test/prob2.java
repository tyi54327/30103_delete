package test;

import java.util.Scanner;

public class prob2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int idx=0;
		int max=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+"번 입력 : ");
			arr[i]=sc.nextInt();
			if(max < arr[i]) {
				idx = i+1;
				max = arr[i];
				
			}
		}
		System.out.println("가자 큰 수는 "  + idx + "번째 숫자인" + max );
		
	}
}
