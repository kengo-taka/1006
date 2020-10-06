import java.util.Scanner;

public class Convert {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
   System.out.println("Please enter a Celsius degree");

   double num1 = scanner.nextDouble();


   double fahrenheit = (9 / 5) * num1 + 32;
   System.out.println("It is " + fahrenheit + " ℉ today.");

  }
}