public class Store extends Building{

    
    public Store(String name, int row, int column) {
        super(name, row, column);
    }

    //should check if the store the user is in is clothing store not beauty salon
    public void buyFedora(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Fedora")) {
            System.out.println(meowdol.name + " already has a fedora. Let's not waste our pawrency!");
          } else if (meowdol.pawrency >= 100){
            meowdol.wardrobe.put("Fedora", true);
            System.out.println("A fedora has been added to " + meowdol.name + "'s wardrobe.");
            meowdol.pawrency -= 100;
          } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
          }
    }

    public void buyBeanie(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Beanie")) {
            System.out.println(meowdol.name + " already has a beanie. Let's not waste our pawrency!");
          } else if (meowdol.pawrency >= 100){
            meowdol.wardrobe.put("Beanie", true);
            System.out.println("A beanie has been added to " + meowdol.name + "'s wardrobe. YAY!");
            meowdol.pawrency -= 100;
          } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
          }
    }

    public void buyBirthdayCone(Meowdol meowdol) {
        if (meowdol.wardrobe.containsKey("Birthday Cone")) {
            System.out.println(meowdol.name + " already has a birthday cone. Let's not waste our pawrency!");
          } else if (meowdol.pawrency >= 100){
            meowdol.wardrobe.put("Birthday Cone", true);
            System.out.println("A birthday cone has been added to " + meowdol.name + "'s wardrobe. YAY!");
            meowdol.pawrency -= 100;
          } else {
            System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
          }
    }

    public void getHairDone(Meowdol meowdol) {
      if (meowdol.pawrency >= 100){
        System.out.println(meowdol.name + " got their hair done! Attractiveness increased by 10!");
        meowdol.attractiveness += 10;
      } else {
        System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
      }
    }

    public void getMakeUpDone(Meowdol meowdol) {
      if (meowdol.pawrency >= 150){
        System.out.println(meowdol.name + " got their make up done! Attractiveness increased by 15!");
        meowdol.attractiveness += 15;
      } else {
        System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
      }
    }

    public void getNailsDone(Meowdol meowdol) {
      if (meowdol.pawrency >= 50){
        System.out.println(meowdol.name + " got their nails done! Attractiveness increased by 5!");
        meowdol.attractiveness += 5;
      } else {
        System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
      }
    }
}
