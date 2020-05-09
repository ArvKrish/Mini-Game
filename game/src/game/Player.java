package game;

public class Player extends Character{
	private boolean deathChecker;
	private boolean healthChecker;
	Player(String name, int power){
		super(name,100,power);
	}
	


	public void strike(Villain v) {
		healthChecker=(this.getHealth()-(this.getHealth()*(this.getPower()/200)))>0?true:false;
		if(healthChecker) {
			
			this.decreaseHealth(this);
			
			deathChecker=this.decreaseHealth(v);
		
			if(deathChecker) {
				System.out.println("\nK.O.");
			}
			else {
				this.strikeUpdate();
			}
		}
		else {
			System.out.println("\nEnergy too low\nPlease use powerups");
		}
	
	}
	
	void strikeUpdate() {
		
		System.out.println("\nWhaat a strike!");
	}
	public void powerUp() {
		System.out.println("\nDrinking Boost\nRestoring health");
		this.boostHealth(.10);
	}
	
	public void powerUp(int energy) {
		System.out.println("\nDrinking Boost\nRestoring health");
		this.boostHealth(.25);
	}
	
	void getSummary() {
		 System.out.println(this.toString());
	 }
	
	
}
