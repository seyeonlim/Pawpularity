import java.util.Random;
import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: 
 */
public class Competition extends Building {

    public Competition(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are at a competition.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Compete with other meowdol");
        System.out.println("2. Go outside");
    }

    public Boolean validate2(int input) { //min and a max
        if (input < 1 || input > 2) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean validate4(int input) {
        if (input < 1 || input > 4) {
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
                    compete(meowdol);
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

    public void compete(Meowdol meowdol) {
        if (meowdol.competitionCount < 1) {
            Random random = new Random();
            int randomNumber = random.nextInt(4);
            if (randomNumber == 0) {
                System.out.println(meowdol.name + " found an opponent! They are a newbie.");
                System.out.println(meowdol.name + " and newbie started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 10 && meowdol.danceEXP >= 10 && meowdol.vocalEXP >= 10) {
                    System.out.println(meowdol.name + " won! Fame increased by 20.");
                    meowdol.fame += 20;
                } else {
                    System.out.println("Oh, no! " + meowdol.name + " lost to a newbie. Let's get some more training!");
                }
                meowdol.competitionCount++;
            }
            if (randomNumber == 1) {
                System.out.println(meowdol.name + " found an opponent! They are a beginner.");
                System.out.println(meowdol.name + " and beginner started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 50 && meowdol.danceEXP >= 50 && meowdol.vocalEXP >= 50) {
                    System.out.println(meowdol.name + " won! Fame increased by 50.");
                    meowdol.fame += 50;
                } else {
                    System.out
                            .println("Oh, no! " + meowdol.name + " lost to a beginner. Let's get some more training!");
                }
                meowdol.competitionCount++;
            }
            if (randomNumber == 2) {
                System.out.println(meowdol.name + " found an opponent! They are an intermediate.");
                System.out.println(meowdol.name + " and intermediate started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 100 && meowdol.danceEXP >= 100 && meowdol.vocalEXP >= 100) {
                    System.out.println(meowdol.name + " won! Fame increased by 100.");
                    meowdol.fame += 100;
                } else {
                    System.out.println(
                            "Oh, no! " + meowdol.name + " lost to an intermediate. Let's get some more training!");
                }
                meowdol.competitionCount++;
            }
            if (randomNumber == 3) {
                System.out.println(meowdol.name + " found an opponent! They are a professional.");
                System.out.println(meowdol.name + " and professional started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 300 && meowdol.danceEXP >= 300 && meowdol.vocalEXP >= 300) {
                    System.out.println(meowdol.name + " won! Fame increased by 300.");
                    meowdol.fame += 300;
                } else {
                    System.out.println(
                            "Oh, no! " + meowdol.name + " lost to a professional. Let's get some more training!");
                }
                meowdol.competitionCount++;
            }
        } else {
            System.out.println(meowdol.name + " cannot participate in a competition more than once a day! (T^T)");
        }

    }

}
