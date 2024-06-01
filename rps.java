package localrepo;
 
import java.util.Random;
import java.util.*;
    

  public class rps {


    public static void main(String[] args) {
        
        Random rand = new Random();
   
        Scanner sc = new Scanner(System.in);
          
          System.out.println("0 : rock");
          System.out.println("1 : paper");
          System.out.println("2 : scissor");


        // Generate random integers in range 0 to 999
        int b = rand.nextInt(3);
         System.out.println("your're move ");
        
         int a  =  sc.nextInt();

          
         System.out.println("computers move ");  
  System.out.println(b);
 
    
 
 
 if((a == 0 && b == 1 )|| (a==1 && b==2) ||(a == 2 && b == 0) )
 {
    System.out.println("computer win");

    }
 
 else if( a==b)
  {
    System.out.println("no result ");
   
     
 }
  
     else{
         System.out.println("you win");
         
     }
     
 
          sc.close();
 
 
   
    }
}


  
 