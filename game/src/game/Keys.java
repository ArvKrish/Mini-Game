package game;
import java.util.ArrayList;
import java.util.Scanner;



public class Keys {
	static ArrayList<Villain> villains=new ArrayList<>();
	static Player p;
	static Scanner sc = new Scanner(System.in);
	static int opponentCount=0;
	
	static int getPowerInput() {
		while (true) {
			int power=0;
			System.out.println("Enter Character's power between 1 to 100\n");
			if(sc.hasNextInt()) {
				power=sc.nextInt();
				
				
				if(power>0 &&power<101) {
					return power;
				}
				else {
					sc.nextLine();
					System.out.println("\nPower out of range!");
				}
			}
			else {
				System.out.println("\nInvalid character!");
				sc.nextLine();
			}
		
		}
	
	}
	
	static String getNameInput()
	{
	
		while(true) {
		
			String name=sc.nextLine();
		
			if(!name.isBlank()) {
			return name;
		
			}
			System.out.println("Try again");
	
		}
		
	}

	public static void main(String[] args) {
		
		
		
		
		int choice;
		boolean looper=true;
		
		String name;
		
		System.out.println("\nHi Player! Please enter your character's name");
		name=getNameInput();
		
		
		p= new Player(name,getPowerInput());
		sc.nextLine();
		
		
		addNewVillain();
		
				
		
		while(looper) {
			
			System.out.println("\nChoose an action\n"
					+ "1.Strike Opponent\n"
					+ "2.Strike all Opponents\n"	
					+ "3.Drink Coffee\n"
					+ "4.Drink Boost\n"
					+ "5.Get Summary\n"
					+ "6.Add new Villain\n"
					+ "7.Show Villain List\n"
					+ "0.Exit\n");
			if(sc.hasNextInt()) {
				choice=sc.nextInt();
				
				switch (choice) {
				
					case 0 :System.out.println("\nThanks for playing");
							p.getSummary();
							getSummaryAll();
							looper=false;
							break;
				
					case 1: strikeVillain();
						
						break;
						
					case 2: strikeVillainAll();break;	
				
					case 3: p.powerUp();break;
					
					case 4: p.powerUp(1);break;
					
					case 5: p.getSummary();
							getSummaryAll();
							break;
							
					case 6:sc.nextLine();
						addNewVillain();
						break;
						
					case 7:showList();break;
					
						
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
		
		

	
	static void addNewVillain() {
		String name;
		opponentCount++;
		System.out.println("Opponent #"+opponentCount+":\t");	
		name=getNameInput();
		
		villains.add(new Villain(name,getPowerInput()));
		
		
	}
	
	
	static void showList() {
	
		System.out.println("The list of Villains are:\n");
		
		for(Villain v:villains) {
		
			System.out.println(v.getName()) ;
		 }
		  
	}
	 


	static void strikeVillain() {
		
		if(villains.size()<2) {
			for(Villain v:villains)
			{
				p.strike(v);
			}
			
		}
		else {
			String name;
			boolean striker=false;
			sc.nextLine();
			System.out.println("Choose an Opponent \n");
			name=getNameInput();
			 
			for(Villain v:villains)
			{
				if(v.getName().equals(name))
				{
					System.out.println("Villain Found");
					p.strike(v);
					striker=true;
				}
			}
			if(!striker)
				System.out.println("Opponent does not exist!");
		}
		
				
	 
		
	  }


	static void strikeVillainAll() {
	
		for(Villain v:villains) {
		
			p.strike(v);
			
		}
		 
	}	
	
	static void getSummaryAll() {
	
		for(Villain v:villains) {
		
			v.getSummary();
			
		}
		
	}	
	
	
	
	

	
}
