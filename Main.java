import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static String meowdolName;

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════*.·:·.✧ ✦ ✧.·:·.*═════════════════════════════════╗");
        System.out.println("✧      _____                           _            _ _                           ✧");
        System.out.println("✧     |  __ \\                         | |          (_) |                          ✧");
        System.out.println("✧     | |__) |_ ___      ___ __  _   _| | __ _ _ __ _| |_ _   _    /\\  ♥  /\\      ✧");
        System.out.println("✧     |  ___/ _` \\ \\ /\\ / / '_ \\| | | | |/ _` | '__| | __| | | |  /  \\___/  \\     ✧");
        System.out.println("✧     | |  | (_| |\\ V  V /| |_) | |_| | | (_| | |  | | |_| |_| | |   ●   ●   |    ✧");
        System.out
                .println("✧     |_|   \\__,_| \\_/\\_/ | .__/ \\__,_|_|\\__,_|_|  |_|\\__|\\__, | | ==  △  == |    ✧");
        System.out.println("✧                         | |                              __/ |  \\_________/     ✧");
        System.out.println("✧                         |_|                             |___/                   ✧");
        System.out.println("✧    _____ _          ___              _   _____      ___      _         _        ✧");
        System.out.println("✧   |_   _| |_  ___  | _ \\___  __ _ __| | |_   _|__  |   \\ ___| |__ _  _| |_      ✧");
        System.out.println("✧     | | | ' \\/ -_) |   / _ \\/ _` / _` |   | |/ _ \\ | |) / -_) '_ \\ || |  _|     ✧");
        System.out
                .println("✧     |_| |_||_\\___| |_|_\\___/\\__,_\\__,_|   |_|\\___/ |___/\\___|_.__/\\_,_|\\__|     ✧");
        System.out.println("✧                                                                                 ✧");
        System.out.println("╚═══════════════════════════════*.·:·.✧ ✦ ✧.·:·.*═════════════════════════════════╝");

        System.out.println(
                "Welcome to <Pawpularity: The Road To Debut>! I'm Mr.Whisker Biscuits, your guide for this game! ฅ^•ﻌ•^ฅ");
        System.out.println("You are now a manager of a meowdol (meow + idol), who is a cat idol trainee.");
        System.out.println("You need to train your meowdol so they can debut!");
        System.out.println(" ");
        System.out
                .println("Your meowdol's talent is determined by their danceEXP, vocalEXP, attractiveness, and fame.");
        System.out.println("You have many ways to increase these EXPs!");
        System.out.println("What you can do are the followings:");
        System.out.println(
                "* Make your meowdol take dance and vocal lessons at the academy to increase danceEXP and vocalEXP");
        System.out.println(
                "* Take your meowdol to the clothing store or the beauty salon to increase their attractiveness");
        System.out.println("* Take your meowdol to the gym to exercise and increase their attractiveness");
        System.out.println(
                "* Make your meowdol film TV shows or shoot advertisements at the studio to earn pawrency (pawrency is the currency in Pawpularity world!)");
        System.out.println("* Make your meowdol record radio programs at the radio station to earn pawrency");
        System.out.println("* Make your meowdol compete with other meowdols at competitions to increase fame");
        System.out.println(
                "* Make your meowdol wear the clothes they bought at the clothing store or sleep to move on to the next day at home.");
        System.out.println(
                "IMPORTANT NOTE: There are limits on how many times you can do these activities a day; your meowdol should go to sleep to get more training!");
        System.out.println(" ");
        System.out.println(
                "Phew! That was a lot of explanation. I still have several things left to tell you! Please keep up.");
        System.out.println(
                "You can't just train you meowdol at your house; You and your meowdol should walk to where you want to go!");
        System.out.println(
                "The buildings are marked on the map, and you can open your map whenever you want to see your current position.");
        System.out.println("The buildings are indicated as initials.");
        System.out.println("H: Home, M: Mall, B: Beauty Salon, D: Dance Academy, V: Vocal Academy, S: Studio, R: Radio Station, G: Gym, C: Competition");
        System.out.println(" ");
        System.out.println(
                "That's it for the tutorial! I gave your meowdol 50 pawrency as a welcome gift. ENJOY! ฅ^•ﻌ•^ฅ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name your meowdol: ");
        meowdolName = scanner.nextLine();
        System.out.println(
                "Great! Your meowdol's name is " + meowdolName + ".");

        Meowdol player = new Meowdol(meowdolName);
        Map map = new Map(player);
        Store clothingStore = new Store("Clothing Store", 5, 1);
        Store beautySalon = new Store("Beauty Salon", 5, 3);
        Studio radioStation = new Studio("Radio Station", 9, 5);
        Studio studio = new Studio("Studio", 8, 0);
        TrainingAcademy danceAcademy = new TrainingAcademy("Dance Academy", 0, 4);
        TrainingAcademy vocalAcademy = new TrainingAcademy("Vocal Academy", 2, 2);
        Competition competition = new Competition("Competition", 6, 8);
        Gym gym = new Gym("Gym", 2, 6);
        Home home = new Home("Home", 0, 0);

        int input = 0;

        while (true) {
            // check if the character is inside a building
            if (player.xPosition == 0 && player.yPosition == 0) {
                // display the available actions for home
                System.out.println("You are at home.");
                System.out.println("What would you like your meowdol to do?");
                System.out.println("1. Open wardrobe");
                System.out.println("2. Go to sleep");
                System.out.println("3. Go outside");
                System.out.println("4. Check balance");
                System.out.println("5. Check skills");

                // get the user's choice
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 5) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                // perform the chosen action
                switch (choice) {
                    case 1:
                        System.out.println(player.name + " opened the wardrobe. This is what they have:");
                        home.seeWardrobe(player);
                        System.out.println(
                                "What would you like your meowdol to do? (These actions can be done only if you have the item");
                        System.out.println("1. Wear fedora");
                        System.out.println("2. Wear beanie");
                        System.out.println("3. Wear birthday cone");
                        int clothesChoice = scanner.nextInt();
                        boolean validClothesChoice = false;
                        while (!validClothesChoice) {
                            try {
                                clothesChoice = scanner.nextInt();
                                if (clothesChoice < 1 || clothesChoice > 3) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                                } else {
                                    validClothesChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (clothesChoice) {
                            case 1:
                                home.wearFedora(player);
                                break;
                            case 2:
                                home.wearBeanie(player);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                        }
                        break;
                    case 2:
                        home.sleep(player);
                        break;
                    case 3:
                        // execute the walk method and offer options for walking direction
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;
                    case 4:
                        player.checkBalance();
                        break;
                    case 5:
                        player.checkSkills();
                        break;
                }

                // go back to the top of the loop
                continue;

            } else if (player.xPosition == 1 && player.yPosition == 5) {
                // display the available actions for the store
                System.out.println("You are inside the mall.");
                System.out.println("What would you like your meowdol to do?");
                System.out.println("1. Buy fedora");
                System.out.println("2. Buy beanie");
                System.out.println("3. Buy birthday cone");
                System.out.println("4. Go outside");

                // get the user's choice
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 4) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }

                // perform the chosen action
                switch (choice) {
                    case 1:
                        clothingStore.buyFedora(player);
                        break;
                    case 2:
                        clothingStore.buyBeanie(player);
                        break;
                    case 3:
                        clothingStore.buyBirthdayCone(player);
                        break;
                    case 4:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;
                }

                // go back to the top of the loop
                continue;

            } else if (player.xPosition == 3 && player.yPosition == 5) {
                // display the available actions for the store
                System.out.println("You are inside the beauty salon.");
                System.out.println("What would you like your meowdol to do?");
                System.out.println("1. Get hair done");
                System.out.println("2. Get make up done");
                System.out.println("3. Get nails done");
                System.out.println("4. Go outside");

                // get the user's choice
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 4) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }

                // perform the chosen action
                switch (choice) {
                    case 1:
                        beautySalon.getHairDone(player);
                        break;
                    case 2:
                        beautySalon.getMakeUpDone(player);
                        break;
                    case 3:
                        beautySalon.getNailsDone(player);
                        break;
                    case 4:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;
                }

                // go back to the top of the loop
                continue;

            } else if (player.xPosition == 0 && player.yPosition == 8) {
                System.out.println("You are at the studio.");
                System.out.println("What do you want your meowdol to do?");
                System.out.println("1. Film a TV show");
                System.out.println("2. Shoot an advertisement");
                System.out.println("3. Go outside");
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 3) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                switch (choice) {
                    case 1:
                        studio.shootTVShow(player);
                        break;
                    case 2:
                        studio.shootAd(player);
                        break;
                    case 3:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;

                }
                continue;

            } else if (player.xPosition == 5 && player.yPosition == 9) {
                System.out.println("You are at the radio station.");
                System.out.println("What do you want your meowdol to do?");
                System.out.println("1. Record a radio program");
                System.out.println("2. Go outside");
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 2) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 2.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                switch (choice) {
                    case 1:
                        studio.recordRadioProgram(player);
                        break;
                    case 2:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;

                }
                continue;

            } else if (player.xPosition == 4 && player.yPosition == 0) {
                System.out.println("You are at the dance academy.");
                System.out.println("What do you want your meowdol to do?");
                System.out.println("1. Get dance lesson");
                System.out.println("2. Go outside");
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 2) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 2.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                switch (choice) {
                    case 1:
                        danceAcademy.danceLesson(player);
                        break;
                    case 2:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;

                }
                continue;
            } else if (player.xPosition == 2 && player.yPosition == 2) {
                System.out.println("You are at the vocal academy.");
                System.out.println("What do you want your meowdol to do?");
                System.out.println("1. Get vocal lesson");
                System.out.println("2. Go outside");
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 2) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 2.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                switch (choice) {
                    case 1:
                        danceAcademy.vocalLesson(player);
                        break;
                    case 2:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;

                }
                continue;
            } else if (player.xPosition == 8 && player.yPosition == 6) {
                System.out.println("You are at a competition.");
                System.out.println("What do you want your meowdol to do?");
                System.out.println("1. Compete with other meowdol");
                System.out.println("2. Go outside");
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 2) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 2.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                switch (choice) {
                    case 1:
                        competition.compete(player);
                        break;
                    case 2:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;

                }
                continue;
            } else if (player.xPosition == 6 & player.yPosition == 2) {
                System.out.println("You are at the gym.");
                System.out.println("What do you want your meowdol to do?");
                System.out.println("1. Exercise");
                System.out.println("2. Go outside");
                int choice = scanner.nextInt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 2) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 2.");
                        } else {
                            validChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                switch (choice) {
                    case 1:
                        gym.exercise(player);
                        break;
                    case 2:
                        System.out.println("Which direction would you like to go? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. Walk north");
                        System.out.println("2. Walk south");
                        System.out.println("3. Walk east");
                        System.out.println("4. Walk west");
                        int directionChoice = scanner.nextInt();
                        boolean validDirectionChoice = false;
                        while (!validDirectionChoice) {
                            try {
                                directionChoice = scanner.nextInt();
                                if (directionChoice < 1 || directionChoice > 4) {
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                } else {
                                    validDirectionChoice = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); // discard invalid input
                            }
                        }
                        switch (directionChoice) {
                            case 1:
                                player.walk("North", map);
                                break;
                            case 2:
                                player.walk("South", map);
                                break;
                            case 3:
                                player.walk("East", map);
                                break;
                            case 4:
                                player.walk("West", map);
                                break;

                        }
                        break;

                }
                continue;
            } else {
                System.out.println("Which direction would you like to go? @ is your current position.");
                map.showMap(player);
                System.out.println("1. Walk north");
                System.out.println("2. Walk south");
                System.out.println("3. Walk east");
                System.out.println("4. Walk west");
                int directionChoice = scanner.nextInt();
                boolean validDirectionChoice = false;
                while (!validDirectionChoice) {
                    try {
                        directionChoice = scanner.nextInt();
                        if (directionChoice < 1 || directionChoice > 4) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        } else {
                            validDirectionChoice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // discard invalid input
                    }
                }
                switch (directionChoice) {
                    case 1:
                        player.walk("North", map);
                        break;
                    case 2:
                        player.walk("South", map);
                        break;
                    case 3:
                        player.walk("East", map);
                        break;
                    case 4:
                        player.walk("West", map);
                        break;

                }
                continue;
            }

            

        }
    }
}