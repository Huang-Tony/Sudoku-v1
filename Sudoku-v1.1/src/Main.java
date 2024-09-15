import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //The idea:
        System.out.println("+---------+-------+-----------+");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("+---------+---------+---------+");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("+---------+---------+---------+");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("| 0  0  0 | 0  0  0 | 0  0  0 |");
        System.out.println("+---------+---------+---------+");
        randomNumberNonRepeatingFromRange10();
    }

    public static void randomNumberNonRepeatingFromRange10() {
        int[] OneToNine = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 0-8 index
        int[] TargetList = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 9; i++) {
            if (Arrays.toString(TargetList).contains("" + i + 1)) {
                //do nothing
                System.out.println(i + 1 + " somehow repeated");
            } else {
                int randomInt = (int) (Math.random() * 9);
                while (TargetList[randomInt] != 0) {
                    randomInt = (int) (Math.random() * 9);
                }
                if (TargetList[randomInt] == 0) {
                    TargetList[randomInt] = i + 1;
                    System.out.println(i + 1);
                }
                System.out.println(i + 1 + " is ran");
            }
        }
        System.out.println(Arrays.toString(TargetList));
        System.out.println("Stop");

        //Planning
        // repeats 9 times for randomising
        // i+1 is the number you want to add to list
        //1: check if the number exists already in the list
        //2: If it does, increment to the next i
        //3: Otherwise check if a random position is a 0
        //4: if it is, add it to the random index
        //5: if not, re-roll until it is


    }
}