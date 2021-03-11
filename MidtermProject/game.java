import java.util.Scanner;

public class game {
  public static void main(String[] args) {
    int playerHand = 0;
    int compHand = 0;
    int theWinner = 0; // 1 player wins, 2 comp wins, 3 tie 

    
    
    compHand = ((int)(Math.random() * 100) % 3 + 1); //rng for computer hand

    Scanner in = new Scanner(System.in);
    System.out.println("\tMenu\n\n(1) Rock\n(2) Paper\n(3) Scissors" + "\n\nEnter Your Hand (1, 2, or 3): "); // getting player hand 
    playerHand = in.nextInt();
    in.close();
   
    if (playerHand > 3 || playerHand < 1)
      System.out.println("Invalid entry, please chose a valid option");// sanity checking user input
    
   
   
    if (playerHand == 1){  //player hand rock 
      if (compHand == 1) {
        theWinner = 3;}
      else if (compHand == 2){
        theWinner = 2;}
      else if (compHand == 3){
        theWinner = 1;
      }
      }

      if (playerHand == 2){  //player hand paper 
        if (compHand == 1) {
          theWinner = 1;}
        else if (compHand == 2){
          theWinner = 3;}
        else if (compHand == 3){
          theWinner = 2;
        }
        }

        if (playerHand == 3){  //player hand scissors 
          if (compHand == 1) {
            theWinner = 2;}
          else if (compHand == 2){
            theWinner = 1;}
          else if (compHand == 3){
            theWinner = 3;
          }
          }
    
    if (theWinner == 1){
      System.out.println("The Player has beaten the computer!!!");
    }
      else if (theWinner == 2){
        System.out.println("The computer has beaten the player!!!");
    }

          else if (theWinner == 3){
            System.out.println("Its a tie!!!");
    }
  }
}