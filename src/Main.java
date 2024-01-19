import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please put your input below: ");
       String word = input.nextLine();
       String[] word_array = word.split(" ");
       int count = 0;
       for (String sub_string : word_array){
           if (sub_string.length()<2){
               continue;
           }else{
               count++;
           }
       }
       System.out.println("Your Word count is: "+ count);
    }
}