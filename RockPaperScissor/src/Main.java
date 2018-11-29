import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random generator = new Random();
        String userChoice;
        //Keeps track of the computers wins
        int computerWins = 0;
        //Keeps track of the players wins
        int userWins = 0;
        //Keeps track of the tie games
        int tie = 0;

        do{
            System.out.println("Rock,Paper,Scissors!");
            //Scoreboard
            System.out.println();
            System.out.println("Wins:" + userWins + "\tLoses:" + computerWins +"\tTies:" + tie);
            System.out.println("-----------------------------------------------------------------");
            //Players selection
            userChoice = userInput.nextLine().toLowerCase();
            //Randomly generates number for the computer
            int generatorNum = generator.nextInt(3);
            String computerChoice = null;
            //Computers choices (1,2,3) generated
            if (generatorNum==0){
                computerChoice = "rock";
            } else if (generatorNum==1){
                computerChoice = "paper";
            } else if (generatorNum==2){
                computerChoice = "scissors";
            }
            //Corrects misspelled inputs
            if(!userChoice.equals("rock")&&(!userChoice.equals("paper")&&(!userChoice.equals("scissors")&&(!userChoice.equals("exit"))))){
                System.out.println("Please Choose: rock, paper, scissors or exit");
            }
            System.out.println();
            //Deciding who wins the round
            //Prints out the computer and players choice
            if(userChoice.equals(computerChoice)){
                System.out.println("Tie! You both chose " + userChoice);
                tie++;
            } else if (userChoice.equals("rock")&& computerChoice.equals("scissors")){
                System.out.println("You won! You beat scissors with " + userChoice);
                userWins++;
            } else if (userChoice.equals("rock")&& computerChoice.equals("paper")){
                System.out.println("You lost! The computer won with " + computerChoice);
                computerWins++;
            } else if (userChoice.equals("scissors")&& computerChoice.equals("paper")) {
                System.out.println("You won! You beat paper with " + userChoice);
                userWins++;
            }else if (userChoice.equals("scissors")&& computerChoice.equals("rock")) {
                System.out.println("You lost! THe computer won with " + computerChoice);
                computerWins++;
            }else if (userChoice.equals("paper")&& computerChoice.equals("rock")) {
                System.out.println("You won! You beat rock with " + userChoice);
                userWins++;
            } else if (userChoice.equals("paper")&& computerChoice.equals("scissors")){
                System.out.println("You lost! The computer beat you with " + computerChoice);
                computerWins++;
        }
        //how to exit the game
    }while(!userChoice.equals("exit"));
    }
}
