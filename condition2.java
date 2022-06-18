import java.net.SocketTimeoutException;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class condition2 {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter two Numbers");
float n1 = sc.nextFloat();
float n2= sc.nextFloat();
if(n1==n2){
    System.out.println("both numbers are EQUAL");
}
else if(n1>n2){
    System.out.println("1st number is GREATER");
}
else{
    System.out.println("2nd number is GREATER");
}
}
    
}
