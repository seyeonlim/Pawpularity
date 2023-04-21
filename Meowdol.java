import java.util.Hashtable;

/**
 * 
 */
public class Meowdol {

    public String name;
    public int xPosition = 0;
    public int yPosition = 0;
    public int age;
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

    public Meowdol(String name, int age) {
        if (age >= 0) {
            this.name = name;
            this.age = age;
        } else {
            throw new RuntimeException("Your Meowdol's age cannot be negative. Σ(;Φ ω Φ)");
            //should it be sout?
        }
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
        System.out.println("/ᐠ｡ꞈ｡ᐟ\\: " + this.name + " (" + this.age + ")");
        System.out.println("* Dance EXP: " + this.danceEXP);
        System.out.println("* Vocal EXP: " + this.vocalEXP);
        System.out.println("* Fame: " + this.fame);
        System.out.println("* Attractiveness: " + this.attractiveness);
        System.out.println("======================");
    }

    public void walk(String direction) {
        if (direction == "North" && this.yPosition > 0) {
            this.yPosition++;
        } else {
            System.out.println(this.name + " reached the end of the map. Let's go to another direction!");
        }
        if (direction == "South" && this.yPosition < 7) {
            this.yPosition--;
        } else {
            System.out.println(this.name + " reached the end of the map. Let's go to another direction!");
        }
        if (direction == "East" && this.xPosition > 0) {
            this.xPosition++;
        } else {
            System.out.println(this.name + " reached the end of the map. Let's go to another direction!");
        }
        if (direction == "West" && this.xPosition < 7) {
            this.xPosition--;
        } else {
            System.out.println(this.name + " reached the end of the map. Let's go to another direction!");
        }
    }

    public void takeTaxi(int newXPosition, int newYPosition) {
        if (this.pawrency >= 100) {
            this.xPosition = newXPosition;
            this.yPosition = newYPosition;
        } else {
            System.out.println(this.name + " doesn't have enough pawrency to take the taxi! T^T");
        }
    }

    public static void main(String[] args) {
        Meowdol cat = new Meowdol("Steve", 11);
        cat.checkBalance();
        cat.checkSkills();
        cat.changeName("Lisa");
        cat.checkSkills();
    }

}