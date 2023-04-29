import java.util.Map;
import java.util.Scanner;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version 
 * Description: A Home class that extends Building class. Has a home constructor and methods for showing possible action options
 *              , allowing user to choose an option, a meowdol to sleep, see wardrobe, and get changed
 */
public class Home extends Building {

    /**
     * A Home constructor
     * @param name name of home
     * @param row the y position of home
     * @param column the x position of home
     */
    public Home(String name, int row, int column) {
        super(name, row, column);
    }

    /**
     * A method that prints out possible action options at home
     */
    public void showOptions() {
        System.out.println("You are at home.");
        System.out.println("What would you like your meowdol to do?");
        System.out.println("1. Open wardrobe");
        System.out.println("2. Go to sleep");
        System.out.println("3. Go outside");
        System.out.println("4. Check balance");
        System.out.println("5. Check skills");
    }

    /**
     * A method that shows possible action options after opening the wardrobe
     * @param meowdol the meowdol of the game
     */
    public void showWardrobeOptions(Meowdol meowdol) {
        System.out.println(meowdol.name + " opened the wardrobe. This is what they have:");
        seeWardrobe(meowdol);
        System.out.println(
                "What would you like your meowdol to do? (These actions can be done only if you have the item");
        System.out.println("1. Wear fedora");
        System.out.println("2. Wear beanie");
        System.out.println("3. Wear birthday cone");
        System.out.println("4. Take off hat");
        System.out.println("5. Close wardrobe");

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
     * A method that allows user to make choice among wardrobe options
     * @param meowdol the meowdol of the game
     * @param choice user input
     */
    public void makeWardrobeChoice(Meowdol meowdol, int choice) {
        Boolean wardrobeChoice = validate(choice, 1, 5);
        if (wardrobeChoice) {
            switch (choice) {
                case 1:
                    wearFedora(meowdol);
                    break;
                case 2:
                    wearBeanie(meowdol);
                    break;
                case 3:
                    wearBirthdayCone(meowdol);
                    break;
                case 4:
                    takeOffHat(meowdol);
                    break;
                case 5:
                    System.out.println(meowdol.name + " closed the wardrobe.");
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
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
        Boolean validation1 = validate(choice, 1, 5);
        if (validation1) {
            switch (choice) {
                case 1:
                    showWardrobeOptions(meowdol);
                    makeWardrobeChoice(meowdol, scanner.nextInt());
                    break;
                case 2:
                    sleep(meowdol);
                    break;
                case 3:
                    meowdol.showWalkOptions(map);
                    meowdol.makeWalkChoice(scanner.nextInt(), map);
                    break;
                case 4:
                    meowdol.checkBalance();
                    break;
                case 5:
                    meowdol.checkSkills();
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    /**
     * A method to make a meowdol go to sleep
     * @param meowdol meowdol of the game
     */
    public void sleep(Meowdol meowdol) {
        // make sure to reset all counts
        if (meowdol.xPosition == 0 && meowdol.yPosition == 0) {
            meowdol.dayCount++;
            meowdol.danceLessonCount = 0;
            meowdol.vocalLessonCount = 0;
            meowdol.TVShowCount = 0;
            meowdol.adCount = 0;
            meowdol.gymCount = 0;
            meowdol.competitionCount = 0;
            System.out.println(meowdol.name + " went to bed. It is now day " + meowdol.dayCount + "! y( ꒪◊꒪)y");
        } else {
            System.out.println(meowdol.name + " is not at home. Take your meowdol to their home first! ☆～（ゝ。∂)");
        }
    }

    /**
     * A method that prints out a list of hats the meowdol owns
     * @param meowdol meowdol of the game
     */
    public void seeWardrobe(Meowdol meowdol) {
        System.out.println("=====" + meowdol.name + "'s wardrobe!=====");
        for (Map.Entry<String, Boolean> entry : meowdol.wardrobe.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            if (value == true)
                System.out.println("* " + key);
        }
        System.out.println("===========================");
    }

    /**
     * A method that makes the meowdol wear a fedora
     * @param meowdol the meowdol of the game
     */
    public void wearFedora(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Fedora")) {
            if (meowdol.wardrobe.containsKey("Beanie") && meowdol.wardrobe.get("Beanie") == false
                    || meowdol.wardrobe.containsKey("Birthday Cone")
                            && meowdol.wardrobe.get("Birthday Cone") == false) {
                System.out.println(meowdol.name + " cannot wear multiple hats! Take off the current hat first.");
            } else {
                meowdol.wardrobe.replace("Fedora", true, false);
                System.out.println(meowdol.name + " wore a fedora! Attractiveness increased by 10.");
                System.out.println("  ___");
                System.out.println("_|___|__");
                System.out.println("( ‘ㅅ' ) ✧.·:· ");
                meowdol.attractiveness += 10;
            }
        } else {
            System.out.println(meowdol.name + " doesn't have a fedora.");
        }
    }

    /**
     * A method that makes the meowdol wear a beanie
     * @param meowdol the meowdol of the game
     */
    public void wearBeanie(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Beanie")) {
            if (meowdol.wardrobe.containsKey("Fedora") && meowdol.wardrobe.get("Fedora") == false
                    || meowdol.wardrobe.containsKey("Birthday Cone")
                            && meowdol.wardrobe.get("Birthday Cone") == false) {
                System.out.println(meowdol.name + " cannot wear multiple hats! Take off the current hat first.");
            } else {
                meowdol.wardrobe.replace("Beanie", true, false);
                System.out.println(meowdol.name + " wore a beanie! Attractiveness increased by 10.");
                System.out.println("  ___");
                System.out.println("|_____|");
                System.out.println("( ‘ㅅ' ) ✧.·:· ");
                meowdol.attractiveness += 10;
            }
        } else {
            System.out.println(meowdol.name + " doesn't have a beanie.");
        }
    }

    /**
     * A method that makes the meowdol wear a birthday cone
     * @param meowdol the meowdol of the game
     */
    public void wearBirthdayCone(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Birthday Cone")) {
            if (meowdol.wardrobe.containsKey("Fedora") && meowdol.wardrobe.get("Fedora") == false
                    || meowdol.wardrobe.containsKey("Beanie") && meowdol.wardrobe.get("Beanie") == false) {
                System.out.println(meowdol.name + " cannot wear multiple hats! Take off the current hat first.");
            } else {
                meowdol.wardrobe.replace("Birthday Cone", true, false);
                System.out.println(meowdol.name + " wore a birthday cone! Attractiveness increased by 10.");
                System.out.println("   /\\");
                System.out.println(" Λ/__\\Λ");
                System.out.println("( ‘ㅅ' ) ✧.·:· ");
                meowdol.attractiveness += 10;
            }
        } else {
            System.out.println(meowdol.name + " doesn't have a birthday cone.");
        }
    }

    /**
     * A method that makes a meowdol to take off their hat
     * @param meowdol meowdol of the game
     */
    public void takeOffHat(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Fedora") || meowdol.wardrobe.containsKey("Beanie")
                || meowdol.wardrobe.containsKey("Birthday Cone")) {
            if (meowdol.wardrobe.get("Fedora") == false) {
                System.out.println(meowdol.name + " took off their hat! Attractiveness decreased by 10.");
                meowdol.wardrobe.replace("Fedora", false, true);
                meowdol.attractiveness -= 10;
            } else if (meowdol.wardrobe.get("Beanie") == false) {
                System.out.println(meowdol.name + " took off their hat! Attractiveness decreased by 10.");
                meowdol.wardrobe.replace("Beanie", false, true);
                meowdol.attractiveness -= 10;
            } else if (meowdol.wardrobe.get("Birthday Cone") == false) {
                System.out.println(meowdol.name + " took off their hat! Attractiveness decreased by 10.");
                meowdol.wardrobe.replace("Birthday Cone", false, true);
                meowdol.attractiveness -= 10;
            }
        } else {
            System.out.println(meowdol.name + " doen't have any hat to take off!");
        }

    }

}
