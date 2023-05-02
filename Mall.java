import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version May 4, 2023
 * Description: A Mall class that extends Building class. Has a mall constructor and methods for showing possible action options
 *              , allowing user to choose an option, and buy fedora, beanie, or birthday cone
 */
public class Mall extends Building {

    /**
     * A mall constructor
     * @param name name of mall
     * @param row the y position of mall
     * @param column the x position of mall
     */
    public Mall(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that prints out possible action options
     */
    public void showOptions() {
        System.out.println("You are inside the mall.");
        System.out.println("What would you like your meowdol to do?");
        System.out.println("1. Buy fedora");
        System.out.println("2. Buy beanie");
        System.out.println("3. Buy birthday cone");
        System.out.println("4. Go outside");
    }

    /**
     * A method that validates user input
     * @param input user input
     * @param min minimum valid user input
     * @param max maxiumum valid user input
     * @return Boolean that tells if the user input is valid or not
     */
    public Boolean validate(int input, int min, int max) {
        if (input < min || input > max) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * A method that allows user to make choice among possible options
     * @param meowdol the meowdol of the game
     * @param map the map of the game
     * @param choice input from user
     * @param scanner scanner for scanning user input
     */
    public void makeChoice(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate(choice, 1, 4);
        if (validation1) {
            switch (choice) {
                case 1:
                    buyFedora(meowdol);
                    break;
                case 2:
                    buyBeanie(meowdol);
                    break;
                case 3:
                    buyBirthdayCone(meowdol);
                    break;
                case 4:
                    meowdol.showWalkOptions(map);
                    meowdol.makeWalkChoice(scanner.nextInt(), map);
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    /**
     * A method that allows user to buy a ferora
     * @param meowdol meowdol of the game
     */
    public void buyFedora(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Fedora")) {
            System.out.println(meowdol.name + " already has a fedora. Let's not waste our pawrency!");
        } else if (meowdol.pawrency >= 100) {
            meowdol.wardrobe.put("Fedora", true);
            System.out.println("A fedora has been added to " + meowdol.name + "'s wardrobe.");
            meowdol.pawrency -= 100;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    /**
     * A method that allows user to buy a beanie
     * @param meowdol meowdol of the game
     */
    public void buyBeanie(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Beanie")) {
            System.out.println(meowdol.name + " already has a beanie. Let's not waste our pawrency!");
        } else if (meowdol.pawrency >= 100) {
            meowdol.wardrobe.put("Beanie", true);
            System.out.println("A beanie has been added to " + meowdol.name + "'s wardrobe. YAY!");
            meowdol.pawrency -= 100;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    /**
     * A method that allows user to buy a birthday cone
     * @param meowdol meowdol of the game
     */
    public void buyBirthdayCone(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Birthday Cone")) {
            System.out.println(meowdol.name + " already has a birthday cone. Let's not waste our pawrency!");
        } else if (meowdol.pawrency >= 100) {
            meowdol.wardrobe.put("Birthday Cone", true);
            System.out.println("A birthday cone has been added to " + meowdol.name + "'s wardrobe. YAY!");
            meowdol.pawrency -= 100;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

}
