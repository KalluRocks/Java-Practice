import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner S1= new Scanner(System.in);
        System.out.println("Enter Principle Amounnt");
        float P= S1.nextFloat();
        System.out.println("Enter Rate of Interest");
        float R =S1.nextFloat();
        System.out.println("Enter Duration in years");
        float N = S1.nextFloat();

        float I= (P*N*R)/100;
        float Amt = P + I;

        System.out.printf("Simple Interest %.4f\n", I);
        System.out.printf("The total Amount is %.4f\n", Amt);
    
        S1.close();
    }
}