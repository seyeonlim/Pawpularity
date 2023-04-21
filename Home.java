public class Home {

    public void sleep(Meowdol meowdol) {
        //make sure to reset all counts
        if (meowdol.xPosition == 0 && meowdol.yPosition == 0) {
            meowdol.dayCount++;
            meowdol.danceLessonCount = 0;
            meowdol.vocalLessonCount = 0;
            System.out.println(meowdol.name + " went to bed. It is now day " + meowdol.dayCount + "! y( ꒪◊꒪)y");
        } else {
            System.out.println(meowdol.name + " is not at home. Take your meowdol to their home first! ☆～（ゝ。∂)");
        }
    }

    public void wearFedora(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Fedora")) {
            
        }
    }

    public static void main(String[] args) {
        Meowdol steve = new Meowdol("Steve", 0);
        Home home = new Home();
        home.sleep(steve);
    }
}
