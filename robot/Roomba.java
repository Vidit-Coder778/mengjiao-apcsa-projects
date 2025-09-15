package robot;

import kareltherobot.*;

public class Roomba implements Directions {

    public static void main(String[] args) {
        World.readWorld("robot/finalTestWorld2024 (1).wld");
        World.setDelay(0);
        World.setVisible(true);

        Robot rob = new Robot(26, 101, East, 0);

        int numBeeper = 0;
        int numPile = 0;
        int area = 1;
        int numBeepersInPile = 0;
        int numLargestPile = 0;
        int x = 0;
        int y = 0;

        for (int i = 1; i <= 100;) {
            while (rob.frontIsClear()) {
                if (rob.nextToABeeper()) {
                    numPile++;
                }
                while (rob.nextToABeeper()) {
                    rob.pickBeeper();
                    numBeeper++;
                    numBeepersInPile++;
                }
                if (numBeepersInPile > numLargestPile) {
                    numLargestPile = numBeepersInPile;
                    x = rob.avenue();
                    y = rob.street();
                }

                numBeepersInPile = 0;
                rob.move();
                area++;
            }

            if (rob.facingEast()) {
                rob.turnLeft();
                if (rob.nextToABeeper()) {
                    numPile++;
                }
                while (rob.nextToABeeper()) {
                    rob.pickBeeper();
                    numBeeper++;
                    numBeepersInPile++;
                }
                if (numBeepersInPile > numLargestPile) {
                    numLargestPile = numBeepersInPile;
                    x = rob.avenue();
                    y = rob.street();
                }
                numBeepersInPile = 0;

                if (rob.frontIsClear()) {
                    rob.move();
                    area++;
                    rob.turnLeft();
                } else {
                    i = 101;
                }

            } else if (rob.facingWest()) {
                rob.turnLeft();
                rob.turnLeft();
                rob.turnLeft();

                if (rob.nextToABeeper()) {
                    numPile++;
                }
                while (rob.nextToABeeper()) {
                    rob.pickBeeper();
                    numBeeper++;
                    numBeepersInPile++;
                }
                if (numBeepersInPile > numLargestPile) {
                    numLargestPile = numBeepersInPile;
                    x = rob.avenue();
                    y = rob.street();
                }
                numBeepersInPile = 0;

                if (rob.frontIsClear()) {
                    rob.move();
                    area++;
                    rob.turnLeft();
                    rob.turnLeft();
                    rob.turnLeft();
                } else {
                    i = 101;
                }
            }
        }

        System.out.println("The area is " + area + " square units.");
        System.out.println("The total number of piles is " + numPile + ".");
        System.out.println("The total number of beepers is " + numBeeper + ".");
        System.out.println("The largest pile of beepers is " + numLargestPile + ".");
        System.out.println("The largest pile (from top left corner) is right " + x + " and down " + y + ".");
        System.out.println("The percent dirty is " + ((double) numPile / area) + " piles/area.");
        System.out.println("The average pile size is " + ((double) numBeeper / numPile) + ".");
        System.out.println("Roomba cleaned up a total of " + " " + numBeeper + " " + "beepers.");
    }
}
