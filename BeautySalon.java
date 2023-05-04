import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version May 4, 2023
 * Description: A BeautySalon class that extends Building class. Can construct a beauty salon, show options of activities that can be done
 *              in a beauty salon, validate user input, make choice of action, and get hair, make up, and nails done.
 */
public class BeautySalon extends Building {

    /**
     * A beauty salon constructor.
     * @param name name of the beauty salon
     * @param row the y position of the beauty salon in the map
     * @param column the x position of the beauty salon in the map
     */
    public BeautySalon(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that prints out the options of activities that the player can do in the beauty salon.
     */
    public void showOptions() {
        System.out.println("You are inside the beauty salon.");
        System.out.println("What would you like your meowdol to do?");
        System.out.println("1. Get hair done");
        System.out.println("2. Get make up done");
        System.out.println("3. Get nails done");
        System.out.println("4. Go outside");
    }

    /**
     * A method that validates the user input by checking if the input integer is within the range. 
     * @param input the input from the user
     * @param min the minimum vale of the input
     * @param max the maxumum value of the input
     * @return Boolean that checks if the input is valid or not
     */
    public Boolean validate(int input, int min, int max) {
        if (input < min || input > max) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * A method that allows the user to make choice within the options.
     * @param meowdol the player's character
     * @param map the map of the game
     * @param choice the input from the user
     * @param scanner Scanner for getting user input
     */
    public void makeChoice(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate(choice, 1, 4);
        if (validation1) {
            switch (choice) {
                case 1:
                    getHairDone(meowdol);
                    break;
                case 2:
                    getMakeUpDone(meowdol);
                    break;
                case 3:
                    getNailsDone(meowdol);
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
     * A method for a meowdol to get their hair done
     * @param meowdol the meowdol getting hair done
     */
    public void getHairDone(Meowdol meowdol) {
        if (meowdol.pawrency >= 100) {
            System.out.println(meowdol.name + " got their hair done! Attractiveness increased by 10!");
            meowdol.pawrency -= 100;
            meowdol.attractiveness += 10;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    /**
     * A method for a meowdol to get their make up done
     * @param meowdol the meowdol getting make up done
     */
    public void getMakeUpDone(Meowdol meowdol) {
        if (meowdol.pawrency >= 150) {
            System.out.println(meowdol.name + " got their make up done! Attractiveness increased by 15!");
            meowdol.pawrency -= 150;
            meowdol.attractiveness += 15;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    /**
     * A method for a meowdol to get their nails done
     * @param meowdol the meowdol getting nails done
     */
    public void getNailsDone(Meowdol meowdol) {
        if (meowdol.pawrency >= 50) {
            System.out.println(meowdol.name + " got their nails done! Attractiveness increased by 5!");
            meowdol.pawrency -= 50;
            meowdol.attractiveness += 5;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }
}
