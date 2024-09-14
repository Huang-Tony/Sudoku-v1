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
        int[] testing = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        testing[0] = 3;
        System.out.println(elementAtIndex(testing, 2));
        System.out.println(testing[0]);
        System.out.println(elementAtIndex(testing, 8));
        }

    public static void randomNumberGenerator(){ // I'll start by randomising a row of numbers first
        int randomNumber = (int) (Math.random()*10);
        System.out.println(randomNumber);
    }
    public static int randomN(){
        int randomNumber = (int) (Math.random()*10);
        return((int) (Math.random()*10));
    }
    public static String elementAtIndex(int[] array, int element){
        int len = array.length + 1;
        int flag = 0;
        int[] ElementIndexList = {0, 0};
            for(int i = 0; i < len; i++) {
                if (i == element) {
                    ElementIndexList[flag] = element;
                    flag += 1;
                }

                else {
                    i += 1;
                }
            }
        return (Arrays.toString(ElementIndexList));
    }

    public static void randomNumberNonRepeatingFromRange10(){
        int[] OneToNine = {1,2, 3, 4, 5, 6, 7, 8, 9}; // 0-8 index
        int[] TargetList = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i = 0; i < 9; i++) { // repeats 9 times for randomising
            // i+1 is the number you want to add to list
            //1: check if the number exists already in the list
            //2: If it does, increment to the next i
            //3: Otherwise, add the number to a random position of 0s
                if (Arrays.toString(TargetList).contains(""+i)) {
                        //do nothing
                     }
                    else {

                    }

            //TargetList[(int) (Math.random()*10)] = OneToNine[i+1];
        }
        boolean flag = Arrays.toString(TargetList).contains("3");
        System.out.println(Arrays.toString(TargetList));
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
