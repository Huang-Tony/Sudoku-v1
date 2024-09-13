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
        }

    public static void randomNumberGenerator(){ // I'll start by randomising a row of numbers first
        int randomNumber = (int) (Math.random()*10);
        System.out.println(randomNumber);
    }
    public static int randomN(){
        int randomNumber = (int) (Math.random()*10);
        return((int) (Math.random()*10));
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
