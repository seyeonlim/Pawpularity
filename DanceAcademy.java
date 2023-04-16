/**
 * 
 */
public class DanceAcademy {

    public void danceLesson(Meowdol meowdol) {
        if (meowdol.danceLessonCount < 2) {
            System.out.println(meowdol.name + " started their dance lesson!");
            System.out.println("");
            System.out.println(" ⊂_ヽ");
            System.out.println("　 ＼＼ Λ＿＿Λ");
            System.out.println("　　 ＼( ‘ㅅ' ) Dance♬");
            System.out.println("　　　 >　⌒ヽ");
            System.out.println("　　　/ 　 へ＼");
            System.out.println("　　 /　　/　＼＼");
            System.out.println("　　 ﾚ　ノ　　 ヽ_つ");
            System.out.println("　　/　/ Dance♬");
            System.out.println("　 /　/|");
            System.out.println("　(　(ヽ");
            System.out.println("　|　|、＼");
            System.out.println("　| 丿 ＼ ⌒)");
            System.out.println("　| |　　) /");
            System.out.println("`ノ )　　Lﾉ");
            System.out.println(" ");
            meowdol.danceEXP += 10;
            System.out.println(meowdol.name + "'s dance EXP is now " + meowdol.danceEXP + "! ฅ^•ﻌ•^ฅ");
            meowdol.danceLessonCount++;
        } else {
            System.out.println(meowdol.name + " cannot take dance lessons more than twice a day. Please let " + meowdol.name + " sleep if you want them to take more dance lessons!");
        }
        
    }

    public void currentDanceLessonCount(Meowdol meowdol) {
        System.out.println(meowdol.name + "'s current dance lesson count: " + meowdol.danceLessonCount);
    }
    
    public static void main(String[] args) {
        Meowdol steve = new Meowdol("Steve", 0);
        DanceAcademy danceAcademy = new DanceAcademy();
        danceAcademy.danceLesson(steve);
        danceAcademy.currentDanceLessonCount(steve);
        danceAcademy.danceLesson(steve);
        danceAcademy.danceLesson(steve);
    }

}
