public class TrainingAcademy {

    String name;
    int xPosition;
    int yPosition;

    public TrainingAcademy(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
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

    public void vocalLesson(Meowdol meowdol) {
        if (meowdol.vocalLessonCount < 2) {
            System.out.println(meowdol.name + " started their vocal lesson!");
            System.out.println("  /\\___/\\");
            System.out.println(" ( >   ● ) MEOW-♬");
            System.out.println(" =\\  △  /=");
            System.out.println("   )   (");
            System.out.println("♬ (     ) PUUURRRRR-♬");
            System.out.println("   | | |");
            System.out.println(" ♬( | | )");
            System.out.println("  ( | | )");
            System.out.println("  _|| |_ ♬");
            System.out.println("(___| |___)");
            meowdol.vocalEXP += 10;
            System.out.println(meowdol.name + "'s vocal EXP is now " + meowdol.vocalEXP + "! ฅ^•ﻌ•^ฅ");
            meowdol.vocalLessonCount++;
        } else {
            System.out.println(meowdol.name + " cannot take vocal lessons more than twice a day. Please let "
                    + meowdol.name + " sleep if you want them to take more dance lessons!");
        }

    }

    public void currentVocalLessonCount(Meowdol meowdol) {
        System.out.println(meowdol.name + "'s current vocal lesson count: " + meowdol.vocalLessonCount);
    }

    public static void main(String[] args) {
        
    }

}
