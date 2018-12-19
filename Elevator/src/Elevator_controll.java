import java.util.Scanner;

public class Elevator_controll {
	public static void main(String[] args) {		
	
		Elevator elevator = new Elevator();			
		int currentlvl = 0;				
		try(Scanner scanner = new Scanner(System.in)){
		while(true) {
			System.out.println("You are at floor " + currentlvl + ". Where do you want to go?");
			if(scanner.hasNextInt()) {
			int nextlvl = scanner.nextInt();
			
			if (nextlvl > 25 || nextlvl < 0 ) {
				System.out.println("You can only choose between levels 0-25");			
			}
			else if (nextlvl == currentlvl) {
				elevator.same_floor();
			}
			else if (nextlvl > currentlvl) {
				currentlvl = elevator.goUpp(nextlvl, currentlvl);
			}
			else if (nextlvl < currentlvl) {
				currentlvl = elevator.goDown(nextlvl, currentlvl);
			}
			}else {
				System.out.println("Only numbers, take the stairs back you floor 0 and try again");
				break;
				
			}
			 			
		}	
	  
	} 	
}
}