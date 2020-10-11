import java.util.Random;
import java.util.Scanner;
public class GameJava{
    public static void main(String[]args){
        //Game Variables
        String computer_turn = null;
        String player_turn = null;
        String who_won = null;

        // create instance of Random class
        Random rand = new Random();
        // Generate random integers in range 0 to 2 for choices stone, paper, scissor
        int computer_turn_rand_int = rand.nextInt(3);

        //Player input
        Scanner sc=new Scanner(System.in);
        System.out.println("Yours Turn");
        player_turn = sc.next().toLowerCase();
        System.out.println("Your's Choice is " +player_turn);

        switch (computer_turn_rand_int){
            case 0:
                computer_turn = "stone";
                break;
            case 1:
                computer_turn = "paper";
                break;
            case 2:
                computer_turn = "scissor";
                break;
        }
        System.out.println("Computer's Choice is " +computer_turn);

	//if else if ladder to check who won the game
        if(player_turn.equals("paper") && computer_turn.equals("stone")){
            who_won = "You have won";
        }
        else if(player_turn.equals("stone") && computer_turn.equals("paper")){
            who_won = "You have lost ";
        }
        else if(player_turn.equals("scissor") && computer_turn.equals("paper")){
            who_won = "You have won";
        }
        else if(player_turn.equals("paper") && computer_turn.equals("scissor")){
            who_won = "You have lost";
        }
        else if(player_turn.equals("stone") && computer_turn.equals("scissor")){
            who_won = "You have won";
        }
        else if(player_turn.equals("scissor") && computer_turn.equals( "stone")){
            who_won = "You have lost";
        }
        else{
            who_won = "The match has been draw";
        }
        System.out.println(who_won);
    }
}
// Reference
// Error Solved Now (Reference-https://www.geeksforgeeks.org/compare-two-strings-in-java/)