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
    }

    public void showMap() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                System.out.print(map[y][x] + " ");
            }
            System.out.println();
        }
    }

    public void walk(Meowdol meowdol, String direction) {
        if (direction == "North" && meowdol.yPosition > 0) {
            meowdol.yPosition--;
        } else if (direction == "South" && meowdol.yPosition < 9) {
            meowdol.yPosition++;
        } else if (direction == "East" && meowdol.xPosition < 9) {
            meowdol.xPosition++;
        } else if (direction == "West" && meowdol.xPosition > 0) {
            meowdol.xPosition--;
        } else {
            System.out.println(meowdol.name + " reached the end of the map. Let's go to another direction!");
        }
        map[meowdol.yPosition][meowdol.xPosition] = userPosition;
    }



    public static void main(String[] args) {
        Meowdol steve = new Meowdol("Steve", 0);
        steve.pawrency += 1000;
        Map map = new Map(steve);
        //map.showMap();
        //steve.walk("North");
        map.walk(steve, "South");
        map.walk(steve, "South");
        //steve.walk("East");
        map.showMap();
    }

}
