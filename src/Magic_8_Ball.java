import java.util.Scanner;

public class Magic_8_Ball {
    
    public static void main(String[] args) {
    //write code here
        Scanner keyboard;
        keyboard=new Scanner (System.in);
    Float pickNumber;
        System.out.println("Give me a number between 1 and 100");
        pickNumber = Float.valueOf(keyboard.nextLine());
     if(pickNumber == 1-10){
         System.out.println("I see good fortune in your future");
     }
        
        
        
        
        
        
        
        /*1-10good
    11-20bad
    21-30good
    31-40bad
    41-50bad
    51-60good
    61-70good
    71-80bad
    81-90bad
    91-100good */        
    
    }
}