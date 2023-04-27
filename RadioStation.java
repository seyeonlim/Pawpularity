import java.util.Scanner;

public class RadioStation extends Building {

    public RadioStation(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are at the radio station.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Record a radio program");
        System.out.println("2. Go outside");

    }

    public Boolean validate2(int input) {
        if (input < 1 || input > 2) {
            return false;
        } else {
            return true;
        }
    }

    public void makeChoice(Meowdol meowdol, Studio studio, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate2(choice);
        if (validation1) {
            switch (choice) {
                case 1:
                    recordRadioProgram(meowdol);
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

    public void recordRadioProgram(Meowdol meowdol) {
        if (meowdol.radioCount < 1) {
            if (meowdol.fame >= 100 && meowdol.danceEXP >= 100 && meowdol.vocalEXP >= 100) {
                System.out.println(meowdol.name + " recorded a radio program! They earned 200 pawrency.");
                meowdol.pawrency += 200;
                meowdol.radioCount++;
            } else {
                System.out.println(
                        meowdol.name
                                + " doesn't have enough talent to record a radio program. Let's get some more training!");
            }
        } else {
            System.out.println(
                    meowdol.name + " cannot record a radio program more than once a day! Let's get some sleep.");
        }
    }

}
