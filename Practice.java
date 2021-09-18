import java.util.*;
public class Practice {
public static void main(String[] args)
{
	System.out.print("Welcome ");
	System.out.print("Welcome new player");
	
	
	int max = 0;
	
	int choice=(int)(Math.random()*3)+1;
	//.out.print("enter your choice is"+choice);
	switch (choice) {
    case 1:   System.out.print("here is Ladder");
              int number=(int)(Math.random()*6)+1;
	          System.out.print("number is"+number);
	          max=max+number;
             break;
    case 2:  System.out.print("here is snake");
              number=(int)(Math.random()*6)+1;
	         System.out.print("number is"+number);
	         if(max==0)
	         {
	           max=0; 
	         }
	         else
	         {
	         max=max-number;
	         }
             break;
    
    default:System.out.print("no switch");
             break;
}
	System.out.print("you are "+max);	
}
}
