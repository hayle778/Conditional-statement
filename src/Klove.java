import java.util.Scanner;

public class Klove {
public static void main(String[]args) {


   long a, b, c;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first number: ");
      a = input.nextLong();
     System.out.println("Enter the second number: ");
      b = input.nextLong();
    System.out.println("Enter the third number: ");
      c  = input.nextLong();

     if(a == b && b == c && a == c){
         System.out.println("All numbers are equal: ");
     }
     if(a != b && a != c && b != c){
         System.out.println("All numbers are not equal:");
     }
     else  {
         System.out.println("Neither all are equal or different: ");
    }


}
}
