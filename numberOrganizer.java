import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class numberOrganizer {

   public static void main(String []args) {
      System.out.println("Enter numbers to be sorted seperated by spaces. All numbers will be printed in ascending order.");
      Scanner input = new Scanner(System.in);
      String numbers = input.nextLine() + " ";
      ArrayList<Double> nums = new ArrayList<Double>();
      int i = 0;
      while(numbers.length() > i){
         String current = numbers.substring(i, i+1);
         if(current.equals(" ")){
            nums.add(Double.parseDouble(numbers.substring(0,i)));
            numbers = numbers.substring(i+1, numbers.length());
            i=0;
         }
         i++;
      }
      Collections.sort(nums);
      System.out.println(nums);
   }

}