import java.util.Scanner;
import java.util.ArrayList;

public class numberOrganizer {

   public static void main(String []args) {
      System.out.println("Enter your numbers seperated by spaces");
      Scanner input = new Scanner(System.in);
      String numbers = input.nextLine() + " ";
      ArrayList<Integer> nums = new ArrayList<Integer>();
      int i = 0;
      while(numbers.length() > i){
         String current = numbers.substring(i, i+1);
         if(current.equals(" ")){
            nums.add(Integer.parseInt(numbers.substring(0,i)));
            numbers = numbers.substring(i+1, numbers.length());
            i=0;
         }
         i++;
      }

      ArrayList<Integer> finish = new ArrayList<Integer>();
      for(int j = 0; nums.size() > j; j++){
         if(j == 0){
            finish.add(nums.get(j));
         }
         else{
            for(int k = 0; k < finish.size(); k++){
               if(nums.get(j) <= finish.get(k)){
                  finish.add(k, nums.get(j));
                  k = finish.size();
               } else if(k==finish.size() && nums.get(i) > finish.get(k)){
                  finish.add(nums.get(j));
                  k++;
               }
            }
         }

      }
      System.out.println(finish);
   }

}