public class Gym {
    
    public void exercise(Meowdol meowdol) {
        System.out.println("    /\\ __ /\\");
        System.out.println("   (˶● ㅅ ●˶)     NO PAIN");
        System.out.println(" ＿ノ ヽ ノ＼＿   NO GAIN");
        System.out.println("/　 `/ ⌒Ｙ⌒ Ｙ　\\");
        System.out.println("( 　(三ヽ人　 / |");
        System.out.println("|　ﾉ⌒＼ ￣￣ヽ　ノ");
        System.out.println("ヽ＿＿＿＞､＿＿／");
        System.out.println("    ｜( 王 ﾉ〈");
        System.out.println("    /ﾐ`ー―彡\\");
        System.out.println("   |╰       ╯|");
        System.out.println("   |   /\\    |");
        System.out.println("   |  /  \\   |");
        System.out.println("   | /    \\  |");
    }

    public static void main(String[] args) {
        Meowdol steve = new Meowdol("Steve", 0);
        Gym gym = new Gym();
        gym.exercise(steve);
    }
}


