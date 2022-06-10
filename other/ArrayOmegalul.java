package other;
import java.util.Scanner;

public class ArrayOmegalul {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number to add to the array: ");
            array[i] = input.nextInt();
            //System.out.println(Arrays.toString(array));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
