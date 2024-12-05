
public class Main {
  public static void main(String[] args) {
    // Create new RPS game instance and print intro
    RockPaperScissorsGame game = new RockPaperScissorsGame();
    game.printIntro();

    // Prompt user inputs for both player names
    game.promptNameP1();
    game.promptNameP2();

    // Prompt game start for number of rounds and explaining rules
    game.promptStart();
    game.printRules();

    // Play game until all rounds are played
    while(game.getCurrentRound() <= game.getTotalRoundsRounds()) {
      game.playRound(game.getP1(), game.getP2());
    }

    // Print final scores and reset them
    game.printFinalScores();
    game.resetScores();
  }
}
