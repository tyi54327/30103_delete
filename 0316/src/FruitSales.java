
public class FruitSales {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		buyer.buyApple(seller, 2000);
		System.out.println("과일 판매자의 현재상황");	
		seller.shawSaleResult();
		
		System.out.println("과일 구매자의 현재 상황");
		buyer.shawBuyResult();
		
	}
}

class FruitSeller{
	int numOfApple=20;
	int myMondey=0;
	final int APPLE_PRICE = 1000;
	
	public FruitSeller() {
		// TODO Auto-generated constructor stub
	}

	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMondey += money;
		return num;
	}	
	
	void shawSaleResult() {
		System.out.println("남은 사과 개수 : " +numOfApple);
		System.out.println("판매 수익 " + myMondey);
	}
}

class FruitBuyer{
	int numOfApple = 0;
	int myMoney = 5000;
	
	public FruitBuyer() {
		// TODO Auto-generated constructor stub
	}

	
	public void buyApple(FruitSeller fs,int money) {	
		numOfApple += fs.saleApple(money);
		myMoney -=money;
	}
	public void shawBuyResult() {
		System.out.println("현재 사과 개수 출력" + numOfApple);
		System.out.println("현재 잔액" + myMoney);
	}
	
}