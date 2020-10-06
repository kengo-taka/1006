import java.util.Scanner;

public class Cylinder {

  public static void main(String[] args) {
    final double pi = 3.14;
    Scanner scanner = new Scanner(System.in);
   double num1,num2;
   System.out.println("Please enter radius & length");

  num1 = scanner.nextDouble();
  num2 = scanner.nextDouble();



   double area = num1*num1*pi;
   double volume = area*num2;

   System.out.println("Area is " + area + ". Volume is " +volume +".");

  }
}