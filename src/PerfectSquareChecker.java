import java.util.Scanner;
import java.lang.Math;
public class PerfectSquareChecker {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double number;
    double sqrt;
    double remainder;
    System.out.println("Please enter a number:");
     number = scan.nextDouble();
     sqrt = Math.sqrt(number);
     remainder = sqrt % 1;
     if (remainder == 0) {
         System.out.println("Output: True");
     } else{
         System.out.println("Output: False");
     }
}
}
