import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: A Studio class that extends Building class. Has a studio constructor, a showOptions and makeChoice methods to print out possible action options
 *              and allow users to make choice, and methods for filming a TV show or shooting an advertisement.
 */
public class Studio extends Building {

    /**
     * A studio constructor
     * @param name name of studio
     * @param row the y position of studio
     * @param column the x position of studio
     */
    public Studio(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that prints out possible action options
     */
    public void showOptions() {
        System.out.println("You are at the studio.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Film a TV show");
        System.out.println("2. Shoot an advertisement");
        System.out.println("3. Go outside");
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
        Boolean validation1 = validate(choice, 1, 3);
        if (validation1) {
            switch (choice) {
                case 1:
                    shootTVShow(meowdol);
                    break;
                case 2:
                    shootAd(meowdol);
                    break;
                case 3:
                    meowdol.showWalkOptions(map);
                    meowdol.makeWalkChoice(scanner.nextInt(), map);
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    /**
     * A method that makes a meowdol to film a TV show
     * @param meowdol meowdol of the game
     */
    public void shootTVShow(Meowdol meowdol) {
        if (meowdol.TVShowCount < 1) {
            if (meowdol.fame >= 200 && meowdol.danceEXP >= 300 && meowdol.vocalEXP >= 300
                    && meowdol.attractiveness >= 150) {
                System.out.println(meowdol.name + " shot a TV show! They earned 300 pawrency.");
                meowdol.pawrency += 300;
                meowdol.TVShowCount++;
            } else {
                System.out.println(
                        meowdol.name + " doesn't have enough talent to be on a TV show. Let's get some more training!");
            }
        } else {
            System.out.println(meowdol.name + " cannot shoot a TV show more than once a day! Let's get some sleep.");
        }

    }

    /**
     * A method that make s a meowdol to shoot an advertisement
     * @param meowdol meowdol of the game
     */
    public void shootAd(Meowdol meowdol) {
        if (meowdol.TVShowCount < 1) {
            if (meowdol.fame >= 200 && meowdol.danceEXP >= 100 && meowdol.vocalEXP >= 100
                    && meowdol.attractiveness >= 400) {
                System.out.println(meowdol.name + " shot an advertisement! They earned 250 pawrency.");
                meowdol.pawrency += 250;
                meowdol.adCount++;
            } else {
                System.out.println(
                        meowdol.name
                                + " doesn't have enough talent to shoot an advertisement. Let's get some more training!");
            }
        } else {
            System.out.println(
                    meowdol.name + " cannot shoot an advertisement more than once a day! Let's get some sleep.");
        }
    }

}
