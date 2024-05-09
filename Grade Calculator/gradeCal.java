import java.util.*;
public class gradeCal{

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int total = 0;

      System.out.println("---------Grade Calculator---------");
      System.out.println("Enter number of subjects: ");
      int totalSub = sc.nextInt();

      for (int i = 0; i < totalSub; i++) {
      System.out.println("Subject "+(i+1) + " :");
      int marks = sc.nextInt();

      if(marks < 0 || marks > 100){
        System.out.println("Please enter valid marks.");
        i--;
        continue;
      }
         total = total + marks; 
      }
       double per = (total / totalSub);
       System.out.println("---------Your result---------");

       System.out.println("Total marks " + total);
       System.out.println("Percentage: " + per);

       if (per >= 90){
        System.out.println("Grade A");
       }
       else if (per >= 75){
        System.out.println("Grade B");
       }
       else if (per >= 55){
        System.out.println("Grade C");
       }
       else if(per <= 35){
        System.out.println("Grade D");
       }
    }
}