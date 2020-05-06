package game;

public class Player extends Character{
	private boolean deathChecker;
	private boolean healthChecker;
	Player(String name){
		super(name,100,25);
	}
	


	public void strike(Villain v) {
		healthChecker=(this.getHealth()-(this.getPower()))>0?true:false;
		if(healthChecker) {
			
			this.decreaseHealth(this.getPower());
			
			deathChecker=v.decreaseHealth(this.getPower());
		
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
		this.boostHealth(10);
	}
	
	public void powerUp(int energy) {
		System.out.println("\nDrinking Boost\nRestoring health");
		this.boostHealth(energy);
	}
	
	void getSummary() {
		 System.out.println(this.toString());
	 }
	
	
}
