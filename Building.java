import java.util.Scanner;

/**
 * Course: CSC 120 (section 2)
 * 
 * @author Seyeon Lim
 * @version
 *          Description:
 */
public class Building {

    public String name;
    public int row;
    public int column;

    public Building(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
    }

    public void showOptions() {
        System.out.println("Overriden");
    }

    public void makeChoice(Meowdol player, Mapp map, int choice, Scanner scanner) {
        System.out.println("Overriden");
    }

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
