import java.util.Scanner;
public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner S= new Scanner(System.in);
        System.out.println("Enter First Year ");
        int firstYear= S.nextInt();
        System.out.println("Enter second Year ");
        int secondYear= S.nextInt();
        S.close();

        int counter=0;
        for(int i=firstYear;i<=secondYear;i++){
            if (i%4==0){
                counter =counter +1;
                System.out.printf("The leap years is : %d\n", i);
            
            }
        }
        System.out.printf("The Number of leap years between %d and %d are: %d ",firstYear,secondYear,counter);
    }
}
