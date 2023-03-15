package s;

public class TransportExam {
	public static void main(String[] args) {
		Car c1 = new Car("디젤",5);
		Car c2 = new Car("가스",110);
		
		c1.refuel();
		c2.refuel();
		c1.speedDown();
		c2.speedUp();
		
		Airplane a1 = new Airplane("보일 747",10000,1000);
		Airplane a2 = new Airplane("에어버스 380",20000,5000);
		Airplane a3 = new Airplane("보잉 707",10000,5000);
		
		a1.refuel();
		a2.refuel();
		a3.refuel();
		System.out.println(a1.airplanName+"의 비행시간은 :"+a1.flightTime()+ "시간입니다.");
		System.out.println(a2.airplanName+"의 비행시간은 :"+a2.flightTime()+"시간입니다.");
		a1.speedDown();
		a2.speedUp();
		
	}
}

abstract class Transport{
	abstract void refuel();        // 차 주유    
	abstract void speedUp();       // 차의 속령 증가   
	abstract void speedDown(); 		// 차의 속력 감소
}

class Car extends Transport{
	String oilType;
	int speed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String oilType, int speed) {
		super();
		this.oilType = oilType;
		this.speed = speed;
	}
	
	void refuel() { 
		System.out.println(oilType+"를 주유합니다.");
	}
	void speedUp() {
		speed+=10;
		if(speed>110) {
			System.out.println("속력위한 범칙금 10만원 부과합니다.");
			speed=10;
		}
	}
	void speedDown() {
		speed-=10;
		if(speed <= 0) {
			System.out.println("차가 멈췄습니다.");
			speed=0;
		}
	}
}

class Airplane extends Transport{
	String airplanName;
	int distance;
	int speed;
	static int totalJetFuel=1500; // 1500 리터;
	int jetFuel;
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	public Airplane(String airplanName, int distance, int speed) {
		this.airplanName = airplanName;
		this.distance = distance;
		this.speed = speed;

	}
	
	void refuel() {
		jetFuel = distance/20;
		if(jetFuel <= totalJetFuel) {
			System.out.println("항공유" + jetFuel + "L를 주유합니다");
			totalJetFuel -= jetFuel;
		}
		else {
			System.out.println("항공유가 부족하여 주유할수 없습니다");
		}
	}
	
	void speedUp() {
		speed+=1000;
		if(speed>5500) {
			System.out.println("비행 속도는 5500km를 넘을 수 없습니다.");
			speed=5500;
		}
	}
	
	void speedDown() {
		speed-=1000;
		if(speed<=0) {
			System.out.println("비행기가 멈췄습니다.");
			speed=10;
		}
	}
	double flightTime() {
		return distance/speed;
	}
}
