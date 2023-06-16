import java.util.Hashtable;
/**
 * Course: CSC 120 (section 2)
 * @author Seyeon Lim
 * @version May 4, 2023
 * Description: A Meowdol class with meowdol constructor with methods for checking balance and skills, walking, and choosing a direction    
 *              to walk to.
 */
public class Meowdol {

    /**
     * Default values needed for a Meowdol.
     */
    public String name;
    public int xPosition = 0;
    public int yPosition = 0;
    public int danceEXP = 0;
    public int vocalEXP = 0;
    public int fame = 0;
    public int attractiveness = 0;
    public int pawrency = 50;
    public int dayCount = 1;
    public int danceLessonCount = 0;
    public int vocalLessonCount = 0;
    public int TVShowCount = 0;
    public int adCount = 0;
    public int radioCount = 0;
    public int gymCount = 0;
    public int competitionCount = 0;
    public Hashtable<String, Boolean> wardrobe = new Hashtable<String, Boolean>();

    /**
     * A meowdol constructor
     * @param name name of Meowdol
     */
    public Meowdol(String name) {
        this.name = name;
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
     * A method that prints out how much pawrency the meowdol owns
     */
    public void checkBalance() {
        System.out.println(this.name + " has " + this.pawrency + " pawrency.");
    }

    /**
     * A method that prints out current skill status of meowdol
     */
    public void checkSkills() {
        System.out.println("=====Skill Report=====");
        System.out.println("/ᐠ｡ꞈ｡ᐟ\\: " + this.name);
        System.out.println("* Dance EXP: " + this.danceEXP);
        System.out.println("* Vocal EXP: " + this.vocalEXP);
        System.out.println("* Fame: " + this.fame);
        System.out.println("* Attractiveness: " + this.attractiveness);
        System.out.println("======================");
    }

    /**
     * A method that prints out the possible directions to walk to 
     * @param map map of the game
     */
    public void showWalkOptions(Mapp map) {
        System.out.println("Which direction would you like to go? @ is your current position.");
        map.showMap(this);
        System.out.println("1. Walk north");
        System.out.println("2. Walk south");
        System.out.println("3. Walk east");
        System.out.println("4. Walk west");
    }

    /**
     * A method that allows a meowdol to walk
     * @param direction the direction the meowdol will walk to
     * @param map map of the game
     */
    public void walk(String direction, Mapp map) {
        if (direction == "North" && this.yPosition > 0) {
            this.yPosition--;
        } else if (direction == "South" && this.yPosition < 9) {
            this.yPosition++;
        } else if (direction == "East" && this.xPosition < 9) {
            this.xPosition++;
        } else if (direction == "West" && this.xPosition > 0) {
            this.xPosition--;
        } else {
            System.out.println(this.name + " reached the end of the map. Let's go to another direction!");
        }
    }

    /**
     * A method that allows user to choose which direction to walk to 
     * @param choice user input
     * @param map map of the game
     */
    public void makeWalkChoice(int choice, Mapp map) {
        Boolean directionChoice = validate(choice, 1, 4);
        if (directionChoice) {
            switch (choice) {
                case 1:
                    walk("North", map);
                    break;
                case 2:
                    walk("South", map);
                    break;
                case 3:
                    walk("East", map);
                    break;
                case 4:
                    walk("West", map);
                    break;

            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

    }

}