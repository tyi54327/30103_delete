import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayExam {
	public static void main(String[] args) {
		String[] array = new String[2];
		array[0] = "one";
		array[1] = "two";
		
		for(int i=0; i<array.length; i++) {
			System.out.println("배열 : " + array[i]);
		}
		
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add(1, "Tlqkf");
		
		al.remove(3); // index로 삭제
		al.remove("1"); // 객체로 삭제

		for(int i=0; i<al.size(); i++) {
			System.out.println("arraylist : " + al.get(i));
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		                                                                
		for(int i=0; i<list.size(); i++) {
			System.out.println("list : " + list.get(i));
		}
		
		Collections.sort(list); // 내림차순 Collections.reverse
		for (Integer i : list) {
			System.out.println("list 정렬 후 출력 : "+i + " ");
		}
		
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black","White","Green","Red"));
		
		colors.set(3, "blue"); // 값 변경
		
		//colors.clear(); //리스트 전체 삭제
		
		for (String string : colors) {
			System.out.println("ArrayList 값 초기화 후 출력 : " + string);
		}
		
		System.out.println("값 검색(contains) : " + colors.contains("Red"));
		System.out.println("값 검색(indexOf) : " + colors.indexOf("White"));
		
		for (String string : colors) {
			System.out.println("ArrayList 값 초기화 후 출력 : " + string);
		}
	}
}

class Stu{
	String name;
	String phone;
	int age;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}