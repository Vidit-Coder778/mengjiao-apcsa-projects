package robot;

import kareltherobot.*;

public class Roomba implements Directions {

    
	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/finalTestWorld2024 (1).wld";
        World.setDelay(0);
		Roomba cleaner = new Roomba(); 
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba;

	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {
		
		roomba = new Robot(26, 101, East, 0);
        Robot rob = roomba;
		//Robot rob = new Robot(26,101,East,0);

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.
		
 
		World.readWorld(worldName);
		World.setVisible(true);
		

    // all my variables
     int TotalBeepers = 0;
     int count = 0;
	 int area = 1;
     boolean x = true;
	 int currentpile = 0;
	 int totalpile = 0;
     int largestpile = 0;
	int avenue2 =rob.avenue();
    int street2 =rob.street();
	while (x == true) {
		//start of while loop
		if (rob.nextToABeeper() == true) {
            currentpile = 0;
			totalpile ++;
			
		}
		
		while (rob.nextToABeeper() == true) {
		    // amount of beepers increases and finding the largest pile
			rob.pickBeeper();
			TotalBeepers++;
			currentpile ++;
			if (currentpile > largestpile) {
				largestpile = currentpile;
				avenue2 =rob.avenue();
                street2 =rob.street();
				
			} 


			
		}
		//ensures it keeps moving
		rob.move();
		area ++;
		//determines which way its going to move
		if (rob.frontIsClear() == false ) {
			while (rob.nextToABeeper() == true) {
				rob.pickBeeper();
				TotalBeepers++;
			}
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
				if (rob.frontIsClear() == false) {
					break;
				}
				rob.move();
				area++;
				rob.turnLeft();
				rob.turnLeft();
				rob.turnLeft();

			

		  }

		}

		

			
		
	  }
    
     System.out.println("The total area is" + ' ' + area + " " + "square units");
	 System.out.println("There are" + " " + TotalBeepers + " " + "beepers");
	 System.out.println("The largest pile is" + " " + largestpile + " " + "beepers");
     System.out.println("There are" +" " + totalpile + " " + "piles");
	 System.out.println("The average amount of beepers per pile was" + " " + (double)TotalBeepers/totalpile + " " + "beepers" );
	 System.out.println("The dirty percentage was" + " " + (double)totalpile/area + "%");
      System.out.println("The largest pile (from top left corner) is right " + avenue2 + " and down " + street2 + ".");




		

		
		
		










	
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
