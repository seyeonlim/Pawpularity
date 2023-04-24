import java.util.Scanner;

public class Mapp {

    public char[][] map; //make this as building array instead
    public char userPosition = '@';

    public Mapp(Meowdol meowdol) {
        map = new char[10][10];
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                map[y][x] = '.';
            }
        }
        map[meowdol.yPosition][meowdol.xPosition] = userPosition;
    }

    public void showMap(Meowdol meowdol) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (meowdol.xPosition == x && meowdol.yPosition == y) {
                    System.out.print(userPosition + " ");
                } else if (x == 0 && y == 0) {
                    System.out.print("H ");
                } else if (x == 2 && y == 2) {
                    System.out.print("V ");
                } else if (x == 4 && y == 0) {
                    System.out.print("D ");
                } else if (x == 0 && y == 8) {
                    System.out.print("S ");
                } else if (x == 5 && y == 9) {
                    System.out.print("R ");
                } else if (x == 1 && y == 5) {
                    System.out.print("M ");
                } else if (x == 3 && y == 5) {
                    System.out.print("B ");
                } else if (x == 8 && y == 6) {
                    System.out.print("C ");
                } else if (x == 6 && y == 2) {
                    System.out.print("G ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public Boolean validate4(int input) {
        if (input < 1 || input > 4) {
            return false;
        } else {
            return true;
        }
    }


    public void updateMap(Meowdol meowdol) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (map[y][x] == userPosition) {
                    map[y][x] = '.';
                }
            }
        }
        map[meowdol.yPosition][meowdol.xPosition] = userPosition;
    }
}

    // execute the walk method and offer options for walking direction
    
    /* 
    while (!validDirectionChoice) {
        try {
            directionChoice = scanner.nextInt();
            if (directionChoice < 1 || directionChoice > 4) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            } else {
                validDirectionChoice = true;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // discard invalid input
        }
    }
    switch (directionChoice) {
        case 1:
            player.walk("North", map);
            break;
        case 2:
            player.walk("South", map);
            break;
        case 3:
            player.walk("East", map);
            break;
        case 4:
            player.walk("West", map);
            break;

    }
    break;


public static void main(String[] args) {
    Meowdol meowdol = new Meowdol("Steve");
    Map map = new Map(meowdol);
    map.showMap(meowdol);
}
}

*/