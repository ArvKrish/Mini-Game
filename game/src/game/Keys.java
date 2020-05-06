package game;
import java.util.Scanner;



public class Keys {

	public static void main(String[] args) {
		Player p1;
		Villain v1;
		
		int choice;
		boolean looper=true;
		
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hi Player! Please enter your character's name");
		name=sc.nextLine();
		
		p1= new Player(name);
		
		
		System.out.println("Who will you be fighting today");
		name=sc.nextLine();

		v1= new Villain(name);
		
		
		while(looper) {
			
			System.out.println("\nChoose an action\n"
					+ "1.Strike Opponent\n"
					+ "2.Drink Coffee\n"
					+ "3.Drink Boost\n"
					+ "4.Get Summary\n"
					+ "0.Exit\n");
			if(sc.hasNextInt()) {
				choice=sc.nextInt();
				
				switch (choice) {
				
					case 0 :p1.getSummary();
							v1.getSummary();
							looper=false;
							break;
				
					case 1: p1.strike(v1);break;
				
					case 2: p1.powerUp();break;
					
					case 3: p1.powerUp(50);break;
					
					case 4: System.out.println("\nThanks for playing");
							p1.getSummary();
							v1.getSummary();
							break;
					
					default: System.out.println("Invalid choice try again");break;
				}	
			}
			else {
				sc.nextLine();
				System.out.println("Enter a valid choice within the given range!");
			}
				
			
		}
		
		sc.close();
	
	}

	
	
	

	
}
