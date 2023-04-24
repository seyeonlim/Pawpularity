import java.util.Hashtable;

/**
 * 
 */
public class Meowdol {

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

    public Meowdol(String name) {
            this.name = name;
        }
    

    public void changeName(String newName) {
        this.name = newName;
        System.out.println("Your Meowdol's name is now " + this.name + ". /ᐠ｡▿｡ᐟ\\*ᵖᵘʳʳ*");
    }

    public void checkBalance() {
        System.out.println(this.name + " has " + this.pawrency + " pawrency.");
    }

    public void checkSkills() {
        System.out.println("=====Skill Report=====");
        System.out.println("/ᐠ｡ꞈ｡ᐟ\\: " + this.name);
        System.out.println("* Dance EXP: " + this.danceEXP);
        System.out.println("* Vocal EXP: " + this.vocalEXP);
        System.out.println("* Fame: " + this.fame);
        System.out.println("* Attractiveness: " + this.attractiveness);
        System.out.println("======================");
    }

    public void walk(String direction, Map map) {
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
        map.updateMap(this);
    }


}