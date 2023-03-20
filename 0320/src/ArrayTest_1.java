import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int max = 0;
		int idx = 0;
		for(int i=0; i<5; i++) {
			System.out.println("별명을 입력해주세요");
			al.add(sc.next());
		}
		
		for(int j=0; j<al.size(); j++) {
			int cnt = ((String) al.get(j)).length();
			if(max < cnt) {
				max  = cnt;
				idx = j;
			}
		
		}
		System.out.println("가장 길이가 긴 별명은 ~~~ " + al.get(idx));
	}
}
