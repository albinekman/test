

public class Elevator {
	
	public int goUpp(int nextlvl, int currentlvl){
		 try {
	            while(nextlvl > currentlvl){
	            	currentlvl = currentlvl + 1;
	        		System.out.println("pling...at floor: " + currentlvl);            
	                Thread.sleep(1000);
	            }
	        }
	        catch(InterruptedException e) {   
	        	 }
		return currentlvl;
	}
	


public int goDown(int nextlvl, int currentlvl){        
        try {
            while(nextlvl < currentlvl){
            	currentlvl = currentlvl - 1;
        		System.out.println("pling...at floor: " + currentlvl);            
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {   
        	 }
	return currentlvl;
}
public void  same_floor() {
	System.out.println("You are alredy on that floor");
}

}
