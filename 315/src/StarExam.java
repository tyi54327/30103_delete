

import java.util.Scanner;

public class StarExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("별의 개수");
		int cnt = sc.nextInt();
		
		System.out.println("방향 ; ");
		int num = sc.nextInt();
		if(num==1) {
			for(int i=1; i<=cnt; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		else if(num==2){
			for(int i=cnt; i>=1; i--) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
