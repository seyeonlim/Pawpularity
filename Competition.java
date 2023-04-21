import java.util.Random;

public class Competition {

    Random random = new Random();
    int randomNumber = random.nextInt(4);

    public void compete(Meowdol meowdol) {
        if (meowdol.competitionCount < 1) {
            if (randomNumber == 0) {
                System.out.println(meowdol.name + " found an opponent! They are a newbie.");
                System.out.println(meowdol.name + " and newbie started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 10 && meowdol.danceEXP >= 10 && meowdol.vocalEXP >= 10) {
                    System.out.println(meowdol.name + " won! Fame increased by 20.");
                    meowdol.fame += 20;
                } else {
                    System.out.println("Oh, no! " + meowdol.name + " lost to a newbie. Let's get some more training!");
                }
            }
            if (randomNumber == 1) {
                System.out.println(meowdol.name + " found an opponent! They are a beginner.");
                System.out.println(meowdol.name + " and beginner started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 50 && meowdol.danceEXP >= 50 && meowdol.vocalEXP >= 50) {
                    System.out.println(meowdol.name + " won! Fame increased by 50.");
                    meowdol.fame += 50;
                } else {
                    System.out
                            .println("Oh, no! " + meowdol.name + " lost to a beginner. Let's get some more training!");
                }
            }
            if (randomNumber == 2) {
                System.out.println(meowdol.name + " found an opponent! They are an intermediate.");
                System.out.println(meowdol.name + " and intermediate started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 100 && meowdol.danceEXP >= 100 && meowdol.vocalEXP >= 100) {
                    System.out.println(meowdol.name + " won! Fame increased by 100.");
                    meowdol.fame += 100;
                } else {
                    System.out.println(
                            "Oh, no! " + meowdol.name + " lost to an intermediate. Let's get some more training!");
                }
            }
            if (randomNumber == 3) {
                System.out.println(meowdol.name + " found an opponent! They are a professional.");
                System.out.println(meowdol.name + " and professional started their talent battle!");
                System.out.println("♪  ∧_____∧     ∧_____∧  ♪");
                System.out.println("   (● ㅅ ●)∩  ∩(● ㅅ ●)");
                System.out.println("   ⊂ﾉ     |    |      ⊂ﾉ");
                System.out.println("♪ ⊂___    |    |     ___⊃  ♪");
                System.out.println("         ⌒U'   し⌒");
                System.out.println("-----------------------------");
                if (meowdol.attractiveness >= 300 && meowdol.danceEXP >= 300 && meowdol.vocalEXP >= 300) {
                    System.out.println(meowdol.name + " won! Fame increased by 300.");
                    meowdol.fame += 300;
                } else {
                    System.out.println(
                            "Oh, no! " + meowdol.name + " lost to a professional. Let's get some more training!");
                }
            }
        } else {
            System.out.println(meowdol.name + " cannot participate in a competition more than once a day! (T^T)");
        }

    }

    public static void main(String[] args) {
        Meowdol cat = new Meowdol("Steve", 11);
        Competition competition = new Competition();
        competition.compete(cat);
    }

}
