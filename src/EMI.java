import java.util.Scanner;
import java.lang.Math;

public class EMI {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Please enter Principal in INR : ");
        float P = S.nextFloat();

        System.out.println("Please enter Duration in Years : ");
        float N = S.nextFloat();

        System.out.println("Please enter Rate of Intrest in %p.a. : ");
        float R = S.nextFloat();

        S.close();

        //Convert N from years to months
        float n = N*12;

        //Convert R from %p.a. to %p.m.
        float r = R/1200;

        //Calculate EMI
        double x = Math.pow(1+r, n);
        double emi = (P*r*x)/(x-1);

        //Calculate amount paid
        double A = emi*n; 

        //Calculate intrest paid
        double I = A - P;

        //Calculate Intrest as percentage of total amount
        double perI = (I/A)*100;

        //Print the results
        System.out.printf("EMI calculated : %.2f\n",emi);
        System.out.printf("Total amount : %.2f\n",A);
        System.out.printf("Intrest paid : %.2f\n",I);
        System.out.printf("Percent Intrest : %.2f percent \n",perI);
        
    }
}
