import java.util.Random;
import java.util.Scanner;

public class RandExam {
	public static void main(String[] args) {
		Random rand  = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위를 던질 횟수 입력");
		int cnt = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=cnt; i++) {
			int num = rand.nextInt(6)+1;
			System.out.println(i+"번쨰 숫자는" + num);
			sum+=num;
		}
		System.out.println("주사위를 "+cnt+"번 던진 결과 , 총 합은" + sum + "입니다.");
	}
}
