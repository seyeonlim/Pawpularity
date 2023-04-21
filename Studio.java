public class Studio extends Building {

    public Studio(String name, int xPosition, int yPosition) {
        super(name, xPosition, yPosition);
    }

    public void shootTVShow(Meowdol meowdol) {
        if (meowdol.TVShowCount < 1) {
            if (meowdol.fame >= 200 && meowdol.danceEXP >= 300 && meowdol.vocalEXP >= 300
                    && meowdol.attractiveness >= 150) {
                System.out.println(meowdol.name + " shot a TV show! They earned 300 pawrency.");
                meowdol.pawrency += 300;
                meowdol.TVShowCount++;
            } else {
                System.out.println(
                        meowdol.name + " doesn't have enough talent to be on a TV show. Let's get some more training!");
            }
        } else {
            System.out.println(meowdol.name + " cannot shoot a TV show more than once a day! Let's get some sleep.");
        }

    }

    public void shootAd(Meowdol meowdol) {
        if (meowdol.TVShowCount < 1) {
            if (meowdol.fame >= 200 && meowdol.danceEXP >= 100 && meowdol.vocalEXP >= 100
                    && meowdol.attractiveness >= 400) {
                System.out.println(meowdol.name + " shot an advertisement! They earned 250 pawrency.");
                meowdol.pawrency += 250;
                meowdol.adCount++;
            } else {
                System.out.println(
                        meowdol.name
                                + " doesn't have enough talent to shoot an advertisement. Let's get some more training!");
            }
        } else {
            System.out.println(
                    meowdol.name + " cannot shoot an advertisement more than once a day! Let's get some sleep.");
        }
    }

    public void recordRadioProgram(Meowdol meowdol) {
        if (meowdol.radioCount < 1) {
            if (meowdol.fame >= 100 && meowdol.danceEXP >= 100 && meowdol.vocalEXP >= 100) {
                System.out.println(meowdol.name + " recorded a radio program! They earned 200 pawrency.");
                meowdol.pawrency += 200;
                meowdol.radioCount++;
            } else {
                System.out.println(
                        meowdol.name
                                + " doesn't have enough talent to record a radio program. Let's get some more training!");
            }
        } else {
            System.out.println(
                    meowdol.name + " cannot record a radio program more than once a day! Let's get some sleep.");
        }
    }

}
