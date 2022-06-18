
import java.util.*;
public class condition{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        int number= sc.nextInt();
        int ans = number%2;
        if(ans != 0){
            System.out.println("number entered is odd");
            
        }else{
            System.out.println("number entered is even");
        }


    } 
}
