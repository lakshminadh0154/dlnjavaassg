import java.util.Random;

public class Assgarray {
    public static void main(String[] args) {

        int[] origArray = {1, 2, 3, 4, 5, 6, 7};
        ShuffleArray(origArray);
        System.out.print("Here is the shuffeld array : ");
        for (int value : origArray) {
            System.out.print(value + " ");
        }
    }
// here we are shuffling array
    static void ShuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
