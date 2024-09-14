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
//This is kinda hard
        randomNumberGenerator();
        randomNumberFromRange10();
        randomNumberNonRepeatingFromRange10();
        }

    public static void randomNumberGenerator(){ // I'll start by randomising a row of numbers first
        int randomNumber = (int) (Math.random()*10);
        System.out.println(randomNumber);
    }
    public static int randomN(){
        int randomNumber = (int) (Math.random()*10);
        return((int) (Math.random()*10));
    }


    public static void randomNumberNonRepeatingFromRange10(){
        int[] OneToNine = {1,2, 3, 4, 5, 6, 7, 8, 9}; // 0-8 index
        // see if I can replace any numbers from a list using Substring
        String testing1 = "---------";
        int[] Randomized = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < 9; i++) {
            Randomized[(int) (Math.random()*10)] = OneToNine[i];
        }
        boolean flag = Arrays.toString(Randomized).contains("3");
        System.out.println(Arrays.toString(Randomized));
        System.out.println(flag);
    }


    public static void randomNumberFromRange10(){
        int[] tenNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // What if I try array (This is my first time)
        //System.out.println(tenNumbers[2]);
        //Using the same random number method from above, I can make it generate 5 random numbers (a test)
        int randomNumber = (int) (Math.random()*10);
        //System.out.println(tenNumbers[randomNumber]+ "," + tenNumbers[randomNumber] + "," + tenNumbers[randomNumber] + "," + tenNumbers[randomNumber] + "," + tenNumbers[randomNumber]);
        //Issue: all of the numbers are based on the same index lmao
        System.out.println(tenNumbers[randomN()]+ "," + tenNumbers[randomN()]+ "," + tenNumbers[randomN()]+ "," + tenNumbers[randomN()]+ "," + tenNumbers[randomN()]);
        // works but there's repeated numbers
    }
}
