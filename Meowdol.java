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

    public Meowdol(String name, int age) {
        if (age >= 0) {
            this.name = name;
            this.age = age;
        } else {
            throw new RuntimeException("Your Meowdol's age cannot be negative. Σ(;Φ ω Φ)");
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

    public static void main(String[] args) {
        Meowdol cat = new Meowdol("Steve", 11);
        cat.checkBalance();
        cat.checkSkills();
        cat.changeName("Lisa");
        cat.checkSkills();
    }

}