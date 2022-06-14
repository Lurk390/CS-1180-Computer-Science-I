import java.util.Scanner;

public class HW2_HowManyGames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people are playing? ");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }

        int numberOfPeople = input.nextInt();
        int numberOfGames = numberOfPeople / 4;
        System.out.print("There is enough people for " + numberOfGames + " game(s)");
        input.close();
    }
}