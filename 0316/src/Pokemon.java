public class Pokemon {
	String pokeName;
	int legs;
	String skill;
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}
	public Pokemon(String pokeName, int legs, String skill) {
		super();
		this.pokeName = pokeName;
		this.legs = legs;
		this.skill = skill;
	}
	
	void showInformation() {
		System.out.println("이름 : " + pokeName);
		System.out.println("다리" + legs);
		System.out.println("기술" +skill);
		
	}
}
