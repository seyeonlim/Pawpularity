public class Mapp {

    public Building[][] map;

    public Mapp(Meowdol meowdol) {
        map = new Building[10][10];
    }

    public void showMap(Meowdol meowdol) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (meowdol.xPosition == x && meowdol.yPosition == y) {
                    System.out.print("@ ");
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
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public void setBuilding(int x, int y, Building building) {
        map[y][x] = building;
    }

    public Building getCurrentPosition(Meowdol player) {
        return map[player.yPosition][player.xPosition];
    }
    

    
    
}

