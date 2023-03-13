import java.util.Scanner;

//1번
public class BookManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title;
		String writer;
		int number;
		String pos;
		int book_count;
		
		String name;
		Book bk = new Book();
		Book b1 = new Book("이것이 자바다","신용권",100);
		Book b2 = new Book("정보보안 개론","양대일",200);
		Book b3 = new Book("모의해킹이란 무엇인가","조정원",300);
		Book b4 = new Book("인생의 태도","웨인 다이어",400);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 >> ");
		name = sc.nextLine();
		System.out.println(name + "님 안녕하세요.");
		System.out.println("현재 대여 가능한 책은 " + b1.book_count);
		b1.rental();
		b2.rental();
		b3.rental();
		b1.back();
		b3.back();
		b2.check();
		b3.check();
		System.out.println("현재 대여 가능한 책은 " +b1.book_count);
		
	}

}

class Book{
	 String title;
	 String writer;
	 int number;
	 boolean pos;
	 static int book_count=4;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String writer, int number) {
		super();
		this.title = title;
		this.writer = writer;
		this.number = number;
	}


	public void rental() {
		this.book_count-=1;
		System.out.println(number + "대여 완료");
		pos=false;
	}
	
	public void back() {
		this.book_count+=1;
		System.out.println(number + "반납 완료");
		pos=true;
	}
	
	public void check() {
		if(pos==true) {
			System.out.println(title+"대여 가능함");
		}
		else {
			System.out.println(title+"대여 중 입니다.");
		}
	}
	

	
}