import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Which number do you want to find");
    int input = in.nextInt();
    int[] nums = {11,16,22,23,34,46,48,50,75,78,0,1,2,3,4,5,6,7,8,9};

    String num = "not be found";
    for(int i=0; i<nums.length; i++) {
      if(nums[i]!=input){
        //Do nothing
      }
      else {
        num=" be found";
      }

    }
    System.out.println("The number " + input + " can" + num + " in your array of numbers");


  }

}
