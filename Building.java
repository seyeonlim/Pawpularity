import java.util.Scanner;

public class Building {

    public String name;
    public int row;
    public int column;

    public Building(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
    }

    public void showOptionsAndMakeChoice(Mapp map, Meowdol player, Scanner scanner, Home home,
            Mall mall,
            BeautySalon beautySalon, Studio studio, RadioStation radioStation, DanceAcademy danceAcademy,
            VocalAcademy vocalAcademy, Gym gym, Competition competition, String type) {
        if (map.getCurrentPosition(player) == this) {
            if (this instanceof Home) {
                home.showOptions();
                home.makeChoice(player, map, scanner.nextInt(), scanner);
            } else if (this instanceof Mall) {
                mall.showOptions();
                mall.makeChoice(player, map, scanner.nextInt(), scanner);
            } else if (this instanceof BeautySalon) {
                beautySalon.showOptions();
                beautySalon.makeChoice(player, map, scanner.nextInt(), scanner);
            } else if (this instanceof Studio) {
                studio.showOptions();
                studio.makeChoice(player, map, scanner.nextInt(), scanner);
            } else if (this instanceof RadioStation) {
                radioStation.showOptions();
                radioStation.makeChoice(player, studio, map, scanner.nextInt(), scanner);
            } else if (this instanceof DanceAcademy) {
                danceAcademy.showOptions();
                danceAcademy.makeChoice(player, map, scanner.nextInt(), scanner);
            } else if (this instanceof VocalAcademy) {
                vocalAcademy.showOptions();
                vocalAcademy.makeChoice(player, map, scanner.nextInt(), scanner);
            } else if (this instanceof Gym) {
                gym.showOptions();
                gym.makeChoice(player, map, scanner.nextInt(), scanner);
            } else if (this instanceof Competition) {
                competition.showOptions();
                competition.makeChoice(player, map, scanner.nextInt(), scanner);
            }
        }
    }
}
