import java.util.Scanner;

/**
 * Course: CSC 120 (section 2)
 * 
 * @author Seyeon Lim
 * @version
 * Description: A building class for constructing a building. Has showOpsions() and makeChoice() methods that are overridden and a showOptionsAndMakeChoice method for
 *              printing out the appropriate action options at a certain building and making choices.
 */
public class Building {

    /**
     * String name name of the building
     * int row the y position of the building
     * int col the x position of the building
     */
    public String name;
    public int row;
    public int column;

    /**
     * A building constructor
     * @param name name of the building
     * @param row the y position of the building
     * @param column the x position of the building
     */
    public Building(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
    }

    /**
     * A showOptions method that is overridden.
     */
    public void showOptions() {
        System.out.println("Overridden");
    }

    /**
     * A makeChoice method that is overridden.
     * @param player the meowdol of the game
     * @param map the map of the game
     * @param choice the choice the user makes
     * @param scanner scanner for scanning user input
     */
    public void makeChoice(Meowdol player, Mapp map, int choice, Scanner scanner) {
        System.out.println("Overridden");
    }
    
    /**
     * A method for showing options of a building and allwoing user to make choice
     * @param map the map of the game
     * @param player the meowdol of the game
     * @param scanner scanner for scanning user input
     */
    public void showOptionsAndMakeChoice(Mapp map, Meowdol player, Scanner scanner) {

        this.showOptions();
        try {
            int choice = scanner.nextInt();
            this.makeChoice(player, map, choice, scanner);
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine();
        }
    }
}
