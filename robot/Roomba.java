package robot;

import kareltherobot.*;

public class Roomba implements Directions {

    
	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/TestWorld-1.wld";
        World.setDelay(1);
		Roomba cleaner = new Roomba(); 
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba;

	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {
		
		Robot rob = new Robot(25,12,East,0);

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.
		
 
		World.readWorld(worldName);
		World.setVisible(true);
		

/* 

		rob.move();
		rob.move();
		rob.move();
		rob.turnLeft();
		rob.turnLeft();
		rob.turnLeft();
		rob.move();
		
		
        while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.move();

		while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.move();
		rob.turnLeft();
		rob.turnLeft();
		rob.turnLeft();
		rob.move();
		rob.move();

		while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.turnLeft();
		rob.turnLeft();
		rob.turnLeft();
		rob.move();
		rob.move();
		rob.move();
		rob.move();

		while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.turnLeft();
		rob.turnLeft();
		rob.turnLeft();
		rob.move();

		while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.turnLeft();
		rob.turnLeft();
		rob.move();
		rob.move();
		rob.turnLeft();
		rob.move();
		rob.move();

		while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.move();
		rob.turnLeft();
		rob.turnLeft();
		rob.turnLeft();
		rob.move();

		while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.turnLeft();
		rob.turnLeft();
		rob.turnLeft();
		rob.move();
		rob.move();

		while(rob.nextToABeeper()){

			rob.pickBeeper();
		}

		rob.move();
		rob.move();
		rob.move();
		
*/
     int TotalBeepers = 0;
     int count = 0;
	 int area = 0;
     boolean x = true;
	 int currentpile = 0;
	 int amountpiles = 0;
     int largestpile = 0;
	while (x == true) {
		if (rob.nextToABeeper() == true) {
            currentpile = 0;
		}
		while (rob.nextToABeeper() == true) {
		    
			rob.pickBeeper();
			TotalBeepers++;
			currentpile ++;
			if (currentpile > largestpile) {
				largestpile = currentpile;
			} 


			
		}
		rob.move();
		area ++;
		if (rob.frontIsClear() == false ) {
            if (count % 2 == 0) {
             	count += 1;
				rob.turnLeft();
				if (rob.frontIsClear() == false) {
					break;
				}
				rob.move();
				area ++;
				rob.turnLeft();
			}
			else {
				count += 1;
				rob.turnLeft();
				rob.turnLeft();
				rob.turnLeft();
				rob.move();
				area++;
				rob.turnLeft();
				rob.turnLeft();
				rob.turnLeft();

			

		  }

		}

		

			
		
	  }
    
     System.out.println("The total area is" + ' ' + area);
	 System.out.println("There are" + " " + TotalBeepers + " " + "beepers");
	 System.out.print("The largest pile is" + " " + largestpile + " " + "beepers");
	 
    




		

		
		
		










	
		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		roomba.move();


		int totalBeepers = 0; // Need to move this somewhere else.
        // This method should return the total number of beepers cleaned up.
		return totalBeepers;
	}
}
