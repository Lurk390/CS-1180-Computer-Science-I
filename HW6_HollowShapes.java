import java.util.*;

public class HW6_HollowShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the square(or radius of circle): ");
        int size = input.nextInt();
        System.out.print("Enter the character to be used: ");
        char character = input.next().charAt(0);
        input.close();
        System.out.println();
        System.out.println("The hollow square is:");
        System.out.println();
        printHollowSquare(size, character);
    }

    public static void printHollowSquare(int size, char character) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
Write a method that outputs a hollow square. It must take the length of a
side (Integer) and the
character to draw the square with (Character). The method must output a
hollow square of height
“length” using the given character. You must use a method to do this – if you
write the code in main,
you will not receive credit.
Enter Height: 5
Enter Character: o
ooooo 
o   o
o   o
o   o
ooooo
*/