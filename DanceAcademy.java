import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: A DanceAcademy class that extends Building class. Has a dance academy constructor, a showOptions and makeChoice methods to print out possible action options
 *              and allow users to make choice, a danceLesson method to make a meowdol take dance lessons, and a currentDanceLessonCount method that counts the number of
 *              dance lessons the meowdol took.
 */
public class DanceAcademy extends Building {

    /**
     * A dance academy constructor
     * @param name name of the dance academy
     * @param row the y position of the dance academy
     * @param column the x position of the dance academy
     */
    public DanceAcademy(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that shows possible action options at the dance academy
     */
    public void showOptions() {
        System.out.println("You are at the dance academy.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Get dance lesson");
        System.out.println("2. Go outside");
    }

    /**
     * A method that validates user input
     * @param input input from the user
     * @param min minimum value of valid input
     * @param max maximum value of valid input
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
                    danceLesson(meowdol);
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
     * A method that allows the meowdol to take a dance lesson
     * @param meowdol the meowdol of the game
     */
    public void danceLesson(Meowdol meowdol) {
        if (meowdol.danceLessonCount < 2) {
            System.out.println(meowdol.name + " started their dance lesson!");
            System.out.println("");
            System.out.println(" ⊂_ヽ");
            System.out.println("　 ＼＼ Λ＿＿Λ");
            System.out.println("　　 ＼( ‘ㅅ'_) Dance♬");
            System.out.println("　　　 >　⌒ヽ");
            System.out.println("　　　/ 　 へ＼");
            System.out.println("　　 /　　/　＼＼");
            System.out.println("　　 ﾚ　ノ　　 ヽ_つ");
            System.out.println("　　/　/ Dance♬");
            System.out.println("　 /　/");
            System.out.println("　(　(ヽ");
            System.out.println("　|　|、＼");
            System.out.println("　| 丿 ＼ ⌒)");
            System.out.println("　| |　　) /");
            System.out.println("`ノ__) 　Lﾉ");
            System.out.println(" ");
            meowdol.danceEXP += 10;
            System.out.println(meowdol.name + "'s dance EXP is now " + meowdol.danceEXP + "! ฅ^•ﻌ•^ฅ");
            meowdol.danceLessonCount++;
        } else {
            System.out.println(meowdol.name + " cannot take dance lessons more than twice a day. Please let "
                    + meowdol.name + " sleep if you want them to take more dance lessons!");
        }

    }

    /**
     * A method that counts the number of dance lessons taken by the meowdol
     * @param meowdol the meowdol of the game
     */
    public void currentDanceLessonCount(Meowdol meowdol) {
        System.out.println(meowdol.name + "'s current dance lesson count: " + meowdol.danceLessonCount);
    }
}
