import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 *          Description: 
 */
public class Gym extends Building {

    public Gym(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are at the gym.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Exercise");
        System.out.println("2. Go outside");
    }

    public Boolean validate4(int input) {
        if (input < 1 || input > 4) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean validate2(int input) {
        if (input < 1 || input > 2) {
            return false;
        } else {
            return true;
        }
    }

    public void makeChoice(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate2(choice);
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
