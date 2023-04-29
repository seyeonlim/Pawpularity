import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: A VocalAcademy class that extends Building class. Has a vocal academy constructor, a showOptions and makeChoice methods to print out possible action options
 *              and allow users to make choice, a vocalLesson method to make a meowdol take dance lessons, and a currentVocalLessonCount method that counts the number of
 *              vocal lessons the meowdol took.
 */
public class VocalAcademy extends Building {

    /**
     * A vocal academy constructor
     * @param name name of vocal academy
     * @param row the y position of vocal academy
     * @param column the x position of vocal academy
     */
    public VocalAcademy(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that prints out possible action options
     */
    public void showOptions() {
        System.out.println("You are at the vocal academy.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Get vocal lesson");
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
                    vocalLesson(meowdol);
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
     * A method that allows the meowdol to take a vocal lesson
     * @param meowdol the meowdol of the game
     */
    public void vocalLesson(Meowdol meowdol) {
        if (meowdol.vocalLessonCount < 2) {
            System.out.println(meowdol.name + " started their vocal lesson!");
            System.out.println("  /\\___/\\");
            System.out.println(" ( >   ● ) MEOW-♬");
            System.out.println(" =\\  △  /=");
            System.out.println("   )   (");
            System.out.println("♬ (     ) PUUURRRRR-♬");
            System.out.println("   | | |");
            System.out.println(" ♬( | | )");
            System.out.println("  ( | | )");
            System.out.println("  _|| |_ ♬");
            System.out.println("(___| |___)");
            meowdol.vocalEXP += 10;
            System.out.println(meowdol.name + "'s vocal EXP is now " + meowdol.vocalEXP + "! ฅ^•ﻌ•^ฅ");
            meowdol.vocalLessonCount++;
        } else {
            System.out.println(meowdol.name + " cannot take vocal lessons more than twice a day. Please let "
                    + meowdol.name + " sleep if you want them to take more dance lessons!");
        }

    }

    /**
     * A method that counts the number of vocal lessons taken by the meowdol
     * @param meowdol the meowdol of the game
     */
    public void currentVocalLessonCount(Meowdol meowdol) {
        System.out.println(meowdol.name + "'s current vocal lesson count: " + meowdol.vocalLessonCount);
    }

}
