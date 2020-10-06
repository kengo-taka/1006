import java.util.Scanner;

public class Gratuity {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
   double num1,num2;
   System.out.println("Please enter subtotal & grauity rate");

  num1 = scanner.nextDouble();
  num2 = scanner.nextDouble();



   double tip = num1*num2*0.01;
   double total = num1 + tip;

   System.out.println("$" + tip +" as gratuity and $" + total + " as total");

  }
}