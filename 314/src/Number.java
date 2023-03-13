import java.util.Random;
import java.util.Scanner;

//2번
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int num = (int)(Math.random()*50+1);
		
		for(int i=1; i<=5; i++) {
			System.out.println("1~50 까지 중 숫자 입력");
			int answer = sc.nextInt();
			if(num > answer) {
				System.out.println("너무 작습니다." + i + "회");
			}
			else if(num < answer) {
				System.out.println("너무 큽니다." + i + "회");
			}
			else if(num==answer) {
				System.out.println("*** 축하합니다 . ***");
				break;
			}
				
		}   
		System.out.println("랜덤숫자는" + num + "입니다.");
	   }
}
