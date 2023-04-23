import java.util.Map;

public class Home extends Building{

    public Home(String name, int row, int column) {
        super(name, row, column);
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
