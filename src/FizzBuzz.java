import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        int i;
        Scanner S1= new Scanner(System.in);
        System.out.println("Enter a number");
        int N = S1.nextInt();
        S1.close();

        for(i=1;i<N+1;i++){

            if (i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            
            else if (i%3==0)
                System.out.println("Fizz");
            
            else if (i%5==0)
                System.out.println("Buzz");
            
            else System.out.println(i);
        }        
    } 
}
