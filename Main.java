import java.util.Scanner;
/**
 * Program creates astrics relating to the number given
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get the users number from 1-10, if the number is't 1-10 then ask again
    int userNumber = 0;
    while (userNumber > 10 || userNumber < 1) {
      System.out.println("Please enter a number between 1 and 10");
      userNumber = input.nextInt();
    }
    // for loop that stops when it reaches 1 less than the users number inside of a for loop that stops when it reaches just below the users number
    
    for (int i = 0; i < userNumber; i++) {
      // checks if the number is the beginning of the lines or the end
      if (i == userNumber - 1 || i == 0) {
        for (int j = 0; j < userNumber; j++) {
          // print an astric
          System.out.print("*");
        }
      } else {
        for (int j = 0; j < userNumber; j++) {
          // checks if it's the beginning of the line or at the end, if it isn't either it prints a space
          if (j == userNumber - 1 || j == 0) {
            // print an astric
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        } 
      }
      // indents so the astrics go to the next line
      System.out.println();
    }
    
  }
}
