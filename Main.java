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
        System.out.println(
                "But watch out, you might encounter paparazzis on your way! If you're lucky, you can meet your meowdol's fans, too ฅ^•ﻌ•^ฅ");
        System.out.println(" ");
        System.out.println(
                "That's it for the tutorial! I gave your meowdol 50 pawrency as a welcome gift. ENJOY! ฅ^•ﻌ•^ฅ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name your meowdol: ");
        meowdolName = scanner.nextLine();
        System.out.println(
                "Great! Your meowdol's name is " + meowdolName + ". Type any character or number to continue.");

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
        Paparazzi p1 = new Paparazzi("Paparazzi 1", 3, 4);
        Paparazzi p2 = new Paparazzi("Paparazzi 2", 7, 1);
        Paparazzi p3 = new Paparazzi("Paparazzi 3", 7, 6);
        Paparazzi p4 = new Paparazzi("Paparazzi 4", 3, 4);

        int input = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                // home
                if (player.xPosition == 0 && player.yPosition == 0) {
                    while (true) {
                        System.out.println("You are at home. What do you want " + player.name + " to do?");
                        System.out.println("1. Open wardrobe");
                        System.out.println("2. Go to bed");
                        System.out.println("3. Go outside");
                        input = scanner.nextInt();
                        if (input == 1) {
                            System.out.println(player.name + " opened the wardrobe. This is what they have:");
                            home.seeWardrobe(player);
                            System.out.println("What do you want" + player.name + "to do?");
                            System.out.println("1. Wear fedora");
                            System.out.println("2. Wear beanie");
                            System.out.println("3. Wear birthday cone"); // need to work more
                        } else if (input == 2) {
                            home.sleep(player);
                        } else if (input == 3) {
                            player.yPosition = 1;
                            break;
                        } else {
                            System.out.println(
                                    "Please enter a valid number! Your response should not include any characters nor numbers that are not in the option.");
                            System.out.println("Enter any character or number to continue.");
                            scanner.next();
                        }
                    }
                    // Clothing store
                } else if (player.xPosition == 1 && player.yPosition == 5) {
                    System.out.println("You are at the clothing store. What do you want your meowdol to do?");
                    System.out.println("1. Buy a fedora");
                    System.out.println("2. Buy a beanie");
                    System.out.println("3. Buy a birthday cone");

                    // When user is not inside a building
                } else {
                    System.out.println("You are outside. These are your options:");
                    System.out.println("1. Walk");
                    System.out.println("2. Take a taxi (Consumes 100 pawrency)");
                    if (input == 1) {
                        System.out.println(
                                "You chose to walk. Which direction do you want to go to? @ is your current position.");
                        map.showMap(player);
                        System.out.println("1. North");
                        System.out.println("2. South");
                        System.out.println("3. East");
                        System.out.println("4. West");
                    }
                }
            } else {
                System.out.println(
                        "Please enter a valid number! Your response should not include any characters.");
                scanner.next();
            }

            /*
             * // beauty salon
             * if (player.xPosition == 3 && player.yPosition == 5) {
             * System.out.
             * println("You are at the beauty salon. What do you want your meowdol to do?");
             * }
             * // radio station
             * if (player.xPosition == 5 && player.yPosition == 9) {
             * System.out.
             * println("You are at the radio station. What do you want your meowdol to do?"
             * );
             * }
             * // studio
             * if (player.xPosition == 0 && player.yPosition == 8) {
             * System.out.
             * println("You are at the studio. What do you want your meowdol to do?");
             * }
             * // dance academy
             * if (player.xPosition == 4 && player.yPosition == 0) {
             * System.out.
             * println("You are at the dance academy. What do you want your meowdol to do?"
             * );
             * }
             * // vocal academy
             * if (player.xPosition == 2 && player.yPosition == 2) {
             * System.out.
             * println("You are at the vocal academy. What do you want your meowdol to do?"
             * );
             * }
             * // competition
             * if (player.xPosition == 8 && player.yPosition == 6) {
             * System.out.
             * println("You are at the competition. What do you want your meowdol to do?");
             * }
             * // gym
             * if (player.xPosition == 6 && player.yPosition == 2) {
             * System.out.println("You are at the gym. What do you want your meowdol to do?"
             * );
             * }
             * // p1
             * if (player.xPosition == 4 && player.yPosition == 3) {
             * System.out.
             * println("You are spotted by a paparazzi! What do you want your meowdol to do?"
             * );
             * }
             * // p2
             * if (player.xPosition == 1 && player.yPosition == 7) {
             * System.out.
             * println("You are spotted by a paparazzi! What do you want your meowdol to do?"
             * );
             * }
             * // p3
             * if (player.xPosition == 6 && player.yPosition == 7) {
             * System.out.
             * println("You are spotted by a paparazzi! What do you want your meowdol to do?"
             * );
             * }
             * // p4
             * if (player.xPosition == 4 && player.yPosition == 3) {
             * System.out.
             * println("You are spotted by a paparazzi! What do you want your meowdol to do?"
             * );
             * }
             */

        }

        // scanner.close();

    }
}
