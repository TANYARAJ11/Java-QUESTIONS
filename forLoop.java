import java.util.*;
public class  forLoop {
    public static void main(String args[]){

        /*int counter = 1;
while(counter<=18){
    counter=counter+1;
    System.out.println(counter);
}*/





/* int a=0;
do{
    a=a+1;
    System.out.println(a);
}while(a<10);*/

/*for(int i=0;i<=10;i++){
    System.out.println(i);
}*/


/*print the sum of first n natural no.*/
/*int sum=0;
for(int i=1;i<=8;i++){
     sum=sum+i;
}
System.out.println(sum);*/


/*now  take n from user*/

/*Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n ");
int n = sc.nextInt();
int sum = 0;
for(int i = 0; i<=n; i++){
    sum=sum+i;
}
System.out.println(sum); */

/*Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int answer=1;
for(int i=0;i<=10;i++){
answer =n*i;
System.out.println(answer);
}*/

/*PRINT ALL EVEN NO. TILL N */
/*Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int i=0;
for(i=0;i<=n;i++){
    if(i%2==0){
        System.out.println(i);
    }
}*/


/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
 */


/*Scanner sc = new Scanner(System.in);
int input;
do{
    int mark = sc.nextInt();
    if(mark<=100 && mark>=90){
        System.out.println("THIS IS GOOD");
    }else if(mark<=80 && mark>=60){
        System.out.println("THIS IS ALSO GOOD");
    }else{
        System.out.println("THIS IS GOOD AS WELL");
    }
    System.out.println("IF U WANNA CONTINUE PRESS 1 OR OTHERWISE PRESS 0 ");
    
    input = sc.nextInt();
}while( input == 1);*/


/*Print if a number is prime or not (Input n from the user). */

Scanner sc = new Scanner(System.in);
System.out.println("Please enter any no.");
int number = sc.nextInt();
if(number%2 !=0){
    System.out.println("THE NUMBER IS PRIME");
}else{
    System.out.println("no. is not prime");
}



}

}











    

