import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: A RadioStation class that extends Building class. Has a radio station constructor, a showOptions and makeChoice methods to print out possible action options
 *              and allow users to make choice, and a recordRadioProgram method to make a meowdol record a radio program
 */
public class RadioStation extends Building {

    /**
     * A radio station constructor
     * @param name name of radio station
     * @param row the y position of the radio station
     * @param column the x position of the radio station
     */
    public RadioStation(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that prints out possible action options
     */
    public void showOptions() {
        System.out.println("You are at the radio station.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Record a radio program");
        System.out.println("2. Go outside");

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
        Boolean validation1 = validate(choice, 1, 2);
        if (validation1) {
            switch (choice) {
                case 1:
                    recordRadioProgram(meowdol);
                    break;
                case 2:
                    meowdol.showWalkOptions(map);
                    meowdol.makeWalkChoice(scanner.nextInt(), map);
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    /**
     * A method that makes a meowdol to record a radio program
     * @param meowdol meowdol of the game
     */
    public void recordRadioProgram(Meowdol meowdol) {
        if (meowdol.radioCount < 1) {
            if (meowdol.fame >= 100 && meowdol.danceEXP >= 100 && meowdol.vocalEXP >= 100) {
                System.out.println(meowdol.name + " recorded a radio program! They earned 200 pawrency.");
                meowdol.pawrency += 200;
                meowdol.radioCount++;
            } else {
                System.out.println(
                        meowdol.name
                                + " doesn't have enough talent to record a radio program. Let's get some more training!");
            }
        } else {
            System.out.println(
                    meowdol.name + " cannot record a radio program more than once a day! Let's get some sleep.");
        }
    }

}
