import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 *          Description: 
 */
public class Mall extends Building {

    public Mall(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are inside the mall.");
        System.out.println("What would you like your meowdol to do?");
        System.out.println("1. Buy fedora");
        System.out.println("2. Buy beanie");
        System.out.println("3. Buy birthday cone");
        System.out.println("4. Go outside");
    }

    public Boolean validate4(int input) {
        if (input < 1 || input > 4) {
            return false;
        } else {
            return true;
        }
    }

    public void makeChoice(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate4(choice);
        if (validation1) {
            switch (choice) {
                case 1:
                    buyFedora(meowdol);
                    break;
                case 2:
                    buyBeanie(meowdol);
                    break;
                case 3:
                    buyBirthdayCone(meowdol);
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

    // should check if the store the user is in is clothing store not beauty salon
    public void buyFedora(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Fedora")) {
            System.out.println(meowdol.name + " already has a fedora. Let's not waste our pawrency!");
        } else if (meowdol.pawrency >= 100) {
            meowdol.wardrobe.put("Fedora", true);
            System.out.println("A fedora has been added to " + meowdol.name + "'s wardrobe.");
            meowdol.pawrency -= 100;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    public void buyBeanie(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Beanie")) {
            System.out.println(meowdol.name + " already has a beanie. Let's not waste our pawrency!");
        } else if (meowdol.pawrency >= 100) {
            meowdol.wardrobe.put("Beanie", true);
            System.out.println("A beanie has been added to " + meowdol.name + "'s wardrobe. YAY!");
            meowdol.pawrency -= 100;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    public void buyBirthdayCone(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Birthday Cone")) {
            System.out.println(meowdol.name + " already has a birthday cone. Let's not waste our pawrency!");
        } else if (meowdol.pawrency >= 100) {
            meowdol.wardrobe.put("Birthday Cone", true);
            System.out.println("A birthday cone has been added to " + meowdol.name + "'s wardrobe. YAY!");
            meowdol.pawrency -= 100;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

}
