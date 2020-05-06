package game;

public class chr {

	private String name;
	private int health;
	private int power;
	
	public chr(String name,int health,int power) {
		this.name=name;
		this.health=health;
		this.power=power;
	}
	
	protected int getHealth() {
		return this.health;
	}
	
	protected int getPower() {
		return this.power;
	}
	
	protected String getName() {
		return this.name;
	}
	
	
	protected void boostHealth(int energy) {
		this.health+=energy;
		if(this.health>100) {
			this.health=100;
		}
	}
	
	protected boolean decreaseHealth(int power) {
		this.health=this.health+this.power-(power*2);
		if(this.health<=0) {
			this.health=0;
			System.out.println("\n"+this.getName()+"'s Health reduced : "+this.getHealth());
			return true;
		}
		System.out.println("\n"+this.getName()+"'s Health reduced : "+this.getHealth());
		return false;
	}
	
	@Override
	public String toString() {
	
		return "\nPlayer's Name: "+getName()+"\n"
				+ "         Health: "+getHealth()+"\n"
				+"         Power: "+getPower();
	}
	
}
