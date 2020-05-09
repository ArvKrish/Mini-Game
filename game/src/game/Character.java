package game;

public abstract class Character {

	private String name;
	private double health;
	private double power;
	
	public Character(String name,int health,int power) {
		this.name=name;
		this.health=health;
		this.power=power;
	}
	
	protected double getHealth() {
		return this.health;
	}
	
	protected double getPower() {
		return this.power;
	}
	
	protected String getName() {
		return this.name;
	}
	
	abstract void strikeUpdate();
	abstract void getSummary();
	
	protected void boostHealth(double energy) {
		this.health+=this.health*energy;
		if(this.health>100) {
			this.health=100;
		}
	}
	
	protected boolean decreaseHealth(Character c) {
		if(this==c) {
			c.health-=c.getHealth()*(this.getPower()/200);
		}else {

			c.health-=c.getHealth()*(this.getPower()/100);		
		}
		
		if(c.health<=0) {
			c.health=0;
			System.out.println("\n"+c.getName()+"'s Health reduced : "+String.format("%.0f", c.getHealth()));
			return true;
		}
		System.out.println("\n"+c.getName()+"'s Health reduced : "+String.format("%.0f", c.getHealth()));
		return false;
	}
	
	@Override
	public String toString() {
	
		return "\nPlayer's Name: "+getName()+"\n"
				+ "         Health: "+String.format("%.0f", getHealth())+"\n"
				+"         Power: "+getPower();
	}
	
}
