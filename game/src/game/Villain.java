package game;

public class Villain extends Character {
	
	
	Villain(String name,int power){
		super(name,100,power);
	}
	 void strikeUpdate() {
		System.out.println("Does not apply\n Villians can't strike players(for now) :D");
	}
	 	 
	public void getSummary() {
		 System.out.println(this.toString());
	 }
	}

