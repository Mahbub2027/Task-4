package mahbub;
import java.math.BigInteger;
    public class MyCalculator implements AdvancedArithmetic{
        @Override
        public void divisorSum(int n) {
            int sum = 0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    sum = sum+i;
                } }
            System.out.println("Sum of all divisors of "+n+" = "+sum);
        }
        @Override
        public void findFactorial(int n) {
            BigInteger result = BigInteger.ONE;
            for(int i=1; i<=n; i++){
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of " +n+"! = "+result);
        }}
/**
 Name:  Md. Mahbub Alam
 Id No: 2012020127
 Section: C
 Email: cse_2012020127@lus.ac.bd
        mahbub510474@gmail.com
 Date: 16.10.2021
 */