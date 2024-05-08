import java.util.* ;
public class NumberGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!!");
        System.out.println(" enter your number:");
        System.out.println("You have 3 chance to guess the correct number");

        boolean correctNum = false, startAgain = true;
        int score = 0;
        
       while(startAgain){
        Random rd = new Random();
        int num  = rd.nextInt(100);

        
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter your number: ");
            int userGuess = sc.nextInt();
            if(userGuess==num){
                System.out.println("\nYour guess IS correct");
                correctNum = true;
                score++;
                break;
            }
            else if(userGuess>num){
                System.out.println("\nYour guess is TOO HIGH");
            }
            else{
                System.out.println("\nYour guess is TOO LOW");
            }
            
        }
         if (!correctNum){
            System.out.println("Sorry! you lost your 3 chances. the correct number is : " +num);
         }
          System.out.println("Your score is: "+ score);
          System.out.println("Do you want to play again? (true/false):");
          startAgain = sc.nextBoolean();
          
    }
}
}