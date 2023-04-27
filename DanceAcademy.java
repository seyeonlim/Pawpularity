import java.util.Scanner;

public class DanceAcademy extends Building {

    public DanceAcademy(String name, int row, int column) {
        super(name, row, column);
    }

    public void showOptions() {
        System.out.println("You are at the dance academy.");
        System.out.println("What do you want your meowdol to do?");
        System.out.println("1. Get dance lesson");
        System.out.println("2. Go outside");
    }

    public Boolean validate2(int input) {
        if (input < 1 || input > 2) {
            return false;
        } else {
            return true;
        }
    }

    public void makeChoice(Meowdol meowdol, Mapp map, int choice, Scanner scanner) {
        Boolean validation1 = validate2(choice);
        if (validation1) {
            switch (choice) {
                case 1:
                    danceLesson(meowdol);
                    break;
                case 2:
                    meowdol.showWalkOptions(map);
                    meowdol.makeWalkChoice(scanner.nextInt(), map);
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public void danceLesson(Meowdol meowdol) {
        if (meowdol.danceLessonCount < 2) {
            System.out.println(meowdol.name + " started their dance lesson!");
            System.out.println("");
            System.out.println(" ⊂_ヽ");
            System.out.println("　 ＼＼ Λ＿＿Λ");
            System.out.println("　　 ＼( ‘ㅅ'_) Dance♬");
            System.out.println("　　　 >　⌒ヽ");
            System.out.println("　　　/ 　 へ＼");
            System.out.println("　　 /　　/　＼＼");
            System.out.println("　　 ﾚ　ノ　　 ヽ_つ");
            System.out.println("　　/　/ Dance♬");
            System.out.println("　 /　/");
            System.out.println("　(　(ヽ");
            System.out.println("　|　|、＼");
            System.out.println("　| 丿 ＼ ⌒)");
            System.out.println("　| |　　) /");
            System.out.println("`ノ__) 　Lﾉ");
            System.out.println(" ");
            meowdol.danceEXP += 10;
            System.out.println(meowdol.name + "'s dance EXP is now " + meowdol.danceEXP + "! ฅ^•ﻌ•^ฅ");
            meowdol.danceLessonCount++;
        } else {
            System.out.println(meowdol.name + " cannot take dance lessons more than twice a day. Please let "
                    + meowdol.name + " sleep if you want them to take more dance lessons!");
        }

    }

    public void currentDanceLessonCount(Meowdol meowdol) {
        System.out.println(meowdol.name + "'s current dance lesson count: " + meowdol.danceLessonCount);
    }
}
