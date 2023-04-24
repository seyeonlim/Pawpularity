import java.util.Map;
import java.util.Scanner;

public class Home extends Building {

    public Home(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are at home.");
        System.out.println("What would you like your meowdol to do?");
        System.out.println("1. Open wardrobe");
        System.out.println("2. Go to sleep");
        System.out.println("3. Go outside");
        System.out.println("4. Check balance");
        System.out.println("5. Check skills");
    }

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

    public Boolean validate5(int input) { // should it be input??
        if (input < 1 || input > 5) {
            return false;
        } else {
            return true;
        }
    }

    public void makeWardrobeChoice(Meowdol meowdol, int choice) {
        Boolean wardrobeChoice = validate5(choice);
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

    public void makeChoice(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate5(choice);
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
        // move the 'continue' statement here
        // continue; will be after the if statement in main
    }

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

/*
 * // perform the chosen action
 * switch (choice) {
 * case 1:
 * System.out.println(player.name +
 * " opened the wardrobe. This is what they have:");
 * home.seeWardrobe(player);
 * System.out.println(
 * "What would you like your meowdol to do? (These actions can be done only if you have the item"
 * );
 * System.out.println("1. Wear fedora");
 * System.out.println("2. Wear beanie");
 * System.out.println("3. Wear birthday cone");
 * int clothesChoice = scanner.nextInt();
 * boolean validClothesChoice = false;
 * while (!validClothesChoice) {
 * try {
 * clothesChoice = scanner.nextInt();
 * if (clothesChoice < 1 || clothesChoice > 3) {
 * System.out.println("Invalid choice. Please enter a number between 1 and 3.");
 * } else {
 * validClothesChoice = true;
 * }
 * } catch (InputMismatchException e) {
 * System.out.println("Invalid input. Please enter a number.");
 * scanner.next(); // discard invalid input
 * }
 * }
 * switch (clothesChoice) {
 * case 1:
 * home.wearFedora(player);
 * break;
 * case 2:
 * home.wearBeanie(player);
 * break;
 * case 3:
 * home.wearBirthdayCone(player);
 * break;
 * }
 * break;
 * case 2:
 * home.sleep(player);
 * break;
 * case 3:
 * // execute the walk method and offer options for walking direction
 * System.out.
 * println("Which direction would you like to go? @ is your current position.");
 * map.showMap(player);
 * System.out.println("1. Walk north");
 * System.out.println("2. Walk south");
 * System.out.println("3. Walk east");
 * System.out.println("4. Walk west");
 * int directionChoice = scanner.nextInt();
 * boolean validDirectionChoice = false;
 * while (!validDirectionChoice) {
 * try {
 * directionChoice = scanner.nextInt();
 * if (directionChoice < 1 || directionChoice > 4) {
 * System.out.println("Invalid choice. Please enter a number between 1 and 4.");
 * } else {
 * validDirectionChoice = true;
 * }
 * } catch (InputMismatchException e) {
 * System.out.println("Invalid input. Please enter a number.");
 * scanner.next(); // discard invalid input
 * }
 * }
 * switch (directionChoice) {
 * case 1:
 * player.walk("North", map);
 * break;
 * case 2:
 * player.walk("South", map);
 * break;
 * case 3:
 * player.walk("East", map);
 * break;
 * case 4:
 * player.walk("West", map);
 * break;
 * 
 * }
 * break;
 * case 4:
 * player.checkBalance();
 * break;
 * case 5:
 * player.checkSkills();
 * break;
 * }
 * 
 * // go back to the top of the loop
 * continue;
 */
