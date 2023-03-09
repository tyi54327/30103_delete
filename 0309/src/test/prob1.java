package test;

import java.util.Scanner;

public class prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			if(i%4==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("1~"+num+"까지의 배수의 합은 : " + sum);
	}
}
