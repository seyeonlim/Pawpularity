import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 *          Description: 
 */
public class Studio extends Building {

    public Studio(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are at the studio.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Film a TV show");
        System.out.println("2. Shoot an advertisement");
        System.out.println("3. Go outside");
    }

    public Boolean validate3(int input) {
        if (input < 1 || input > 3) {
            return false;
        } else {
            return true;
        }
    }

    public void makeChoice(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate3(choice);
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
