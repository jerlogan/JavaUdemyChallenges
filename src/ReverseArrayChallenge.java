import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void reverseArray(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        printArray(testArray);
        reverseArray(testArray);

    }
}

//0    1     2     3     4
//1    2     3     4     5
//5    4     3     2     1
