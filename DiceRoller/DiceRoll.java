import java.util.Random;

public class DiceRoll {
    public static int rollDie(int dice){
        int dieFace = 0;
        Random randFace = new Random();
        dieFace = randFace.nextInt(7);
        return dieFace;
    }
    public static void main(String[] args){
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int die4 = 0;
        int die5 = 0;

        rollDie(die1);
        rollDie(die2);
        rollDie(die3);
        rollDie(die4);
        rollDie(die5);

        System.out.println(die1 + die2 + die3 + die4 + die5);
    }

}
