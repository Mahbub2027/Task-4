package mahbub;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AdvancedArithmetic advancedArithmetic = new MyCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for find the sum of all divisors : ");
        int a = input.nextInt();
        advancedArithmetic.divisorSum(a);

        System.out.println("\nEnter a number for find the factorial value: ");
        int b  = input.nextInt();
        advancedArithmetic.findFactorial(b);
    }
}
/**
 Name:  Md. Mahbub Alam
 Id No: 2012020127
 Section: C
 Email: cse_2012020127@lus.ac.bd
        mahbub510474@gmail.com
 Date: 16.10.2021
 */