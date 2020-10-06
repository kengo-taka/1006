import java.util.Scanner;

public class Find {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
   double num1;
   System.out.println("Please enter mitutes");

  num1 = scanner.nextDouble();

   double year = Math.floor(num1/(24*60*365));
   double day = Math.floor((num1%(24*60*365))/(24*60));

   

   System.out.println(year +" year and " + day + " days");

  }
}