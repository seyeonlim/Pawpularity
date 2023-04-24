public class Map {

    private char[][] map;
    private char userPosition = '@';

    public Map(Meowdol meowdol) {
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



public static void main(String[] args) {
    Meowdol meowdol = new Meowdol("Steve");
    Map map = new Map(meowdol);
    map.showMap(meowdol);
}
}

