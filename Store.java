import java.util.Scanner;

public class Store extends Building {

  public Store(String name, int row, int column) {
    super(name, row, column);
  }

  public void showOptionsClothes() {
    System.out.println("You are inside the mall.");
    System.out.println("What would you like your meowdol to do?");
    System.out.println("1. Buy fedora");
    System.out.println("2. Buy beanie");
    System.out.println("3. Buy birthday cone");
    System.out.println("4. Go outside");
  }

  public void showOptionsSalon() {
    System.out.println("You are inside the beauty salon.");
    System.out.println("What would you like your meowdol to do?");
    System.out.println("1. Get hair done");
    System.out.println("2. Get make up done");
    System.out.println("3. Get nails done");
    System.out.println("4. Go outside");
  }

  public Boolean validate4(int input) {
    if (input < 1 || input > 4) {
      return false;
    } else {
      return true;
    }
  }

  public void makeChoiceClothes(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
    Boolean validation1 = validate4(choice);
    if (validation1) {
      switch (choice) {
        case 1:
          buyFedora(meowdol);
          break;
        case 2:
          buyBeanie(meowdol);
          break;
        case 3:
          buyBirthdayCone(meowdol);
          break;
        case 4:
          meowdol.showWalkOptions(map);
          meowdol.makeWalkChoice(scanner.nextInt(), map);
          break;
      }
    } else {
      System.out.println("Invalid choice. Please try again.");
    }
  }

  public void makeChoiceSalon(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
    Boolean validation1 = validate4(choice);
    if (validation1) {
      switch (choice) {
        case 1:
          getHairDone(meowdol);
          break;
        case 2:
          getMakeUpDone(meowdol);
          break;
        case 3:
          getNailsDone(meowdol);
          break;
        case 4:
          while (true) {
            int directionChoice = scanner.nextInt();
            Boolean validation2 = validate4(directionChoice);
            if (validation2) {
              meowdol.makeWalkChoice(directionChoice, map);
              break;
            } else {
              System.out.println("Invalid choice. Please try again.");
            }
          }
      }
    } else {
      System.out.println("Invalid choice. Please try again.");
    }
  }

  // should check if the store the user is in is clothing store not beauty salon
  public void buyFedora(Meowdol meowdol) {
    if (meowdol.wardrobe.containsKey("Fedora")) {
      System.out.println(meowdol.name + " already has a fedora. Let's not waste our pawrency!");
    } else if (meowdol.pawrency >= 100) {
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
    } else if (meowdol.pawrency >= 100) {
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
    } else if (meowdol.pawrency >= 100) {
      meowdol.wardrobe.put("Birthday Cone", true);
      System.out.println("A birthday cone has been added to " + meowdol.name + "'s wardrobe. YAY!");
      meowdol.pawrency -= 100;
    } else {
      System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
    }
  }

  public void getHairDone(Meowdol meowdol) {
    if (meowdol.pawrency >= 100) {
      System.out.println(meowdol.name + " got their hair done! Attractiveness increased by 10!");
      meowdol.attractiveness += 10;
    } else {
      System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
    }
  }

  public void getMakeUpDone(Meowdol meowdol) {
    if (meowdol.pawrency >= 150) {
      System.out.println(meowdol.name + " got their make up done! Attractiveness increased by 15!");
      meowdol.attractiveness += 15;
    } else {
      System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
    }
  }

  public void getNailsDone(Meowdol meowdol) {
    if (meowdol.pawrency >= 50) {
      System.out.println(meowdol.name + " got their nails done! Attractiveness increased by 5!");
      meowdol.attractiveness += 5;
    } else {
      System.out.println(meowdol.name + " doesn't have enough pawrency... Let's make some money first!");
    }
  }
}
