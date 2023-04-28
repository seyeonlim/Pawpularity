import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 *          Description: 
 */
public class VocalAcademy extends Building {

    public VocalAcademy(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are at the vocal academy.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Get vocal lesson");
        System.out.println("2. Go outside");
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

    public void currentVocalLessonCount(Meowdol meowdol) {
        System.out.println(meowdol.name + "'s current vocal lesson count: " + meowdol.vocalLessonCount);
    }

}
