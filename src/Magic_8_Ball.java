import java.util.Scanner;

public class Magic_8_Ball {
    
    public static void main(String[] args) {
    //write code here
        Scanner keyboard;
        keyboard=new Scanner (System.in);
   int pickNumber;



        do {
            System.out.println("Give me a number between 1 and 100");
            pickNumber = Integer.parseInt((keyboard.nextLine()));
            if (pickNumber  <=10) {
                System.out.println("I see good fortune in your future");
            }
           else if (pickNumber <= 20) {
                System.out.println("You are going to be filled with sorrow in the near future");
            }
            else if (pickNumber <= 30) {
                System.out.println("You are going to find the love of your life in the distant future");
            }
            else if (pickNumber <= 40) {
                System.out.println("You will have nothing but depression in your near future");
            }
            else if (pickNumber <=50) {
                System.out.println("you have no body there for you");
            }
            else if (pickNumber <= 60) {
                System.out.print("Your future has the best outcome known to man kind");
            }
            else if (pickNumber <= 70) {
                System.out.println("You are an amazing person with friends and family to love you back");
            }
            else if (pickNumber <= 80) {
                System.out.println("System error 404 bad luck broke the game");
            }
            else if (pickNumber <= 90) {
                System.out.println("You have no love at anytime ever");
            }
            else if (pickNumber <= 100) {
                System.out.println("You are an amazing you that you can ever be, don't let yourself down");
            }
        }while(1+1==2);


        
        
        
        
        
        

    }
}