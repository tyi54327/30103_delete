import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int cnt =0;
		String name;
		String[] last = new String[5];
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력해 주세요");
			name = sc.next();
			
			al.add(name);
			
			if(name.startsWith("김")  == true) {
				last[i] = name;
				cnt++;
			}
		
		}
		
		System.out.println("성이 '김'인 분의 이름을 모두 출력합니다.");
		for(int j=0; j<last.length; j++) {
			if(last[j] == null) {
				continue;
			}
			
			System.out.print(" " + last[j] + " ");

		}
		System.out.println("");
		System.out.println("김씨 성을 가진 분은 모두 " + cnt + "명 입니다.");
	}
}
