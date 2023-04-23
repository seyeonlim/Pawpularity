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
                System.out.print(map[y][x] + " ");
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

}
