package MinimumElementChallenge;
import java.util.Scanner;
import java.util.Arrays;

public class MinimumElement {
    public static int[] readIntegers(int count) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter " + count + " numbers \n");
        int[] enteredArray = new int[count];
        for (int i = 0; i < enteredArray.length; i++) {
            enteredArray[i] = sc.nextInt();
        }
        return enteredArray;
    }

    public static void printIntegers(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        printIntegers(readIntegers(5));
    }


}
