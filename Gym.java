import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: A Gym class that extends Building class. Has a gym constructor, a showOptions and makeChoice methods to print out possible action options
 *              and allow users to make choice, and an exercise method that makes a meowdol to exercise. 
 */
public class Gym extends Building {

    /**
     * A gym constructor
     * @param name name of the gym
     * @param row the y position of the gym
     * @param column the x position of the gym
     */
    public Gym(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that prints out possible action options at the gym
     */
    public void showOptions() {
        System.out.println("You are at the gym.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Exercise");
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
                    exercise(meowdol);
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
     * A method that makes a meowdol to exercise
     * @param meowdol the meowdol of the game
     */
    public void exercise(Meowdol meowdol) {
        if (meowdol.gymCount < 2) {
            System.out.println("    /\\ __ /\\");
            System.out.println("   (˶● ㅅ ●˶)     NO PAIN");
            System.out.println(" ＿ノ ヽ ノ＼＿   NO GAIN");
            System.out.println("/　 `/ ⌒Ｙ⌒ Ｙ　\\");
            System.out.println("( 　(三ヽ人　 / |");
            System.out.println("|　ﾉ⌒＼ ￣￣ヽ　ノ");
            System.out.println("ヽ＿＿＿＞､＿＿／");
            System.out.println("    ｜( 王 ﾉ〈");
            System.out.println("    /ﾐ`ー―彡\\");
            System.out.println("   |╰       ╯|");
            System.out.println("   |   /\\    |");
            System.out.println("   |  /  \\   |");
            System.out.println("   | /    \\  |");
            System.out.println(meowdol.name + " did some good exercise! Attractiveness increased by 50.");
            meowdol.attractiveness += 50;
            meowdol.gymCount++;
        } else {
            System.out.println(meowdol.name + " cannot exercise more than twice a day. Let's give them a break!");
        }

    }

}
