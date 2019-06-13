package ArrayChallenge;
import java.util.Scanner;

public class arrayChal {

    public static int[] getIntegers(int number){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + number + " values! \n");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i < array.length - 1; i ++) {
                if (array[i] < array [i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    temp = array[i + 1];
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] allIntegers = getIntegers(5);
        printArray(allIntegers);
        int[] sortedInts = sortIntegers(allIntegers);
        printArray(sortedInts);
    }
}
