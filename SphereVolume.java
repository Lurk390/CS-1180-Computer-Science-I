import java.util.Scanner;
import java.text.DecimalFormat;

public class SphereVolume {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius of the sphere: ");

    while (!input.hasNextDouble()) {
      System.out.println("Invalid input. Please enter a number.");
      input.next();
    }

    double radius = input.nextDouble();
    float c = 4.0f / 3.0f;
    double exactResult = c * Math.PI * Math.pow(radius, 3);
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("The volume of the sphere is " + df.format(exactResult));
    input.close();
  }
}