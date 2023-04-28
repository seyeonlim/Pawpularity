import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: 
 */
public class BeautySalon extends Building {

    public BeautySalon(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are inside the beauty salon.");
        System.out.println("What would you like your meowdol to do?");
        System.out.println("1. Get hair done");
        System.out.println("2. Get make up done");
        System.out.println("3. Get nails done");
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

    public void getHairDone(Meowdol meowdol) {
        if (meowdol.pawrency >= 100) {
            System.out.println(meowdol.name + " got their hair done! Attractiveness increased by 10!");
            meowdol.attractiveness += 10;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    public void getMakeUpDone(Meowdol meowdol) {
        if (meowdol.pawrency >= 150) {
            System.out.println(meowdol.name + " got their make up done! Attractiveness increased by 15!");
            meowdol.attractiveness += 15;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }

    public void getNailsDone(Meowdol meowdol) {
        if (meowdol.pawrency >= 50) {
            System.out.println(meowdol.name + " got their nails done! Attractiveness increased by 5!");
            meowdol.attractiveness += 5;
        } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
        }
    }
}
