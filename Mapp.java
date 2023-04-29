/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: A class for making a 2D array map of buildings. Has methods for visualizing the map, allocate buildings in the map, 
 *              and getting the current position of the meowdol.
 */
public class Mapp {

    /**
     * A 2D array of Buildings.
     */
    public Building[][] map;

    /**
     * A map(wrote as Mapp to make distinction between the 2D array map and the Map for hashtable) constructor
     * @param meowdol meowdol of the game
     */
    public Mapp(Meowdol meowdol) {
        map = new Building[10][10];
    }

    /**
     * A method for printing out the map
     * @param meowdol meowdol of the game
     */
    public void showMap(Meowdol meowdol) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (meowdol.xPosition == x && meowdol.yPosition == y) {
                    System.out.print("@ ");
                } else if (x == 0 && y == 0) {
                    System.out.print("H ");
                } else if (x == 2 && y == 2) {
                    System.out.print("V ");
                } else if (x == 4 && y == 0) {
                    System.out.print("D ");
                } else if (x == 0 && y == 8) {
                    System.out.print("S ");
                } else if (x == 5 && y == 9) {
                    System.out.print("R ");
                } else if (x == 1 && y == 5) {
                    System.out.print("M ");
                } else if (x == 3 && y == 5) {
                    System.out.print("B ");
                } else if (x == 8 && y == 6) {
                    System.out.print("C ");
                } else if (x == 6 && y == 2) {
                    System.out.print("G ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    /**
     * A method for allocating buildings in the map
     * @param x x position of the building
     * @param y y position of the building
     * @param building the building to allocate
     */
    public void setBuilding(int x, int y, Building building) {
        map[y][x] = building;
    }

    /**
     * A method that returns the current position of the meowdol
     * @param player meowdol of the game
     * @return current position of the meowdol
     */
    public Building getCurrentPosition(Meowdol player) {
        return map[player.yPosition][player.xPosition];
    }
    

    
    
}

