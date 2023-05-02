import java.util.Scanner;

/**
 * Course: CSC 120 (section 2)
 * 
 * @author Seyeon Lim
 * @version
 * Description: A Main class for the execution of the game.
 */
public class Main {

        private static String meowdolName;

        public static void main(String[] args) {
                System.out.println(
                                "╔═══════════════════════════════*.·:·.✧ ✦ ✧.·:·.*═════════════════════════════════╗");
                System.out.println(
                                "✧      _____                           _            _ _                           ✧");
                System.out.println(
                                "✧     |  __ \\                         | |          (_) |                          ✧");
                System.out.println(
                                "✧     | |__) |_ ___      ___ __  _   _| | __ _ _ __ _| |_ _   _    /\\  ♥  /\\      ✧");
                System.out.println(
                                "✧     |  ___/ _` \\ \\ /\\ / / '_ \\| | | | |/ _` | '__| | __| | | |  /  \\___/  \\     ✧");
                System.out.println(
                                "✧     | |  | (_| |\\ V  V /| |_) | |_| | | (_| | |  | | |_| |_| | |   ●   ●   |    ✧");
                System.out
                                .println("✧     |_|   \\__,_| \\_/\\_/ | .__/ \\__,_|_|\\__,_|_|  |_|\\__|\\__, | | ==  △  == |    ✧");
                System.out.println(
                                "✧                         | |                              __/ |  \\_________/     ✧");
                System.out.println(
                                "✧                         |_|                             |___/                   ✧");
                System.out.println(
                                "✧    _____ _          ___              _   _____      ___      _         _        ✧");
                System.out.println(
                                "✧   |_   _| |_  ___  | _ \\___  __ _ __| | |_   _|__  |   \\ ___| |__ _  _| |_      ✧");
                System.out.println(
                                "✧     | | | ' \\/ -_) |   / _ \\/ _` / _` |   | |/ _ \\ | |) / -_) '_ \\ || |  _|     ✧");
                System.out
                                .println("✧     |_| |_||_\\___| |_|_\\___/\\__,_\\__,_|   |_|\\___/ |___/\\___|_.__/\\_,_|\\__|     ✧");
                System.out.println(
                                "✧                                                                                 ✧");
                System.out.println(
                                "╚═══════════════════════════════*.·:·.✧ ✦ ✧.·:·.*═════════════════════════════════╝");

                System.out.println(
                                "Welcome to <Pawpularity: The Road To Debut>! I'm Mr.Whisker Biscuits, your guide for this game! ฅ^•ﻌ•^ฅ");
                System.out.println("You are now a manager of a meowdol (meow + idol), who is a cat idol trainee.");
                System.out.println("You need to train your meowdol so they can debut!");
                System.out.println(" ");
                System.out
                                .println("Your meowdol's talent is determined by their danceEXP, vocalEXP, attractiveness, and fame.");
                System.out.println("You have many ways to increase these EXPs!");
                System.out.println("Your skills must be higher than 400 for every section to debut.");
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
                System.out.println(
                                "H: Home, M: Mall, B: Beauty Salon, D: Dance Academy, V: Vocal Academy, S: Studio, R: Radio Station, G: Gym, C: Competition");
                System.out.println(" ");
                System.out.println(
                                "That's it for the tutorial! I gave your meowdol 50 pawrency as a welcome gift. ENJOY! ฅ^•ﻌ•^ฅ");

                Scanner scanner = new Scanner(System.in);

                System.out.print("Name your meowdol: ");
                meowdolName = scanner.nextLine();
                System.out.println(
                                "Great! Your meowdol's name is " + meowdolName + ".");

                Meowdol player = new Meowdol(meowdolName);
                Mapp map = new Mapp(player);
                Mall mall = new Mall("Mall", 5, 1);
                BeautySalon beautySalon = new BeautySalon("Beauty Salon", 5, 3);
                RadioStation radioStation = new RadioStation("Radio Station", 9, 5);
                Studio studio = new Studio("Studio", 8, 0);
                DanceAcademy danceAcademy = new DanceAcademy("Dance Academy", 0, 4);
                VocalAcademy vocalAcademy = new VocalAcademy("Vocal Academy", 2, 2);
                Competition competition = new Competition("Competition", 6, 8);
                Gym gym = new Gym("Gym", 2, 6);
                Home home = new Home("Home", 0, 0);

                map.setBuilding(0, 0, home);
                map.setBuilding(1, 5, mall);
                map.setBuilding(3, 5, beautySalon);
                map.setBuilding(5, 9, radioStation);
                map.setBuilding(0, 8, studio);
                map.setBuilding(4, 0, danceAcademy);
                map.setBuilding(2, 2, vocalAcademy);
                map.setBuilding(8, 6, competition);
                map.setBuilding(6, 2, gym);

                while (true) {
                        Building currentPostition = map.getCurrentPosition(player); // returns
                                                                                    // map[player.yPosition][player.xPosition]
                        if (currentPostition == null) {
                                player.showWalkOptions(map);
                                try {
                                        player.makeWalkChoice(scanner.nextInt(), map);
                                } catch (Exception e) {
                                        System.out.println("Invalid input. Please try again.");
                                        scanner.nextLine();
                                }
                        } else {
                                //do scanner.nextLine too in the building
                                currentPostition.showOptionsAndMakeChoice(map, player, scanner);
                        }

                        if(player.danceEXP >= 400 && player.vocalEXP >= 400 && player.attractiveness >= 400 && player.fame >= 400) {
                                System.out.println("Congratulations! Your meowdol successfully debuted!");
                                System.out.println("You may continue the game, but this message will still be here!");
                        }
                        continue;

                        
                }

                

        }
}