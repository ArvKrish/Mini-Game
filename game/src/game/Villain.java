package game;

public class Villain extends Character {
	
	Villain(String name){
		super(name,100,20);
	}
	 void strikeUpdate() {
		System.out.println("Does not apply\n Villians can't strike players(for now) :D");
	}
	 
	 void getSummary() {
		 System.out.println(this.toString());
	 }
}
