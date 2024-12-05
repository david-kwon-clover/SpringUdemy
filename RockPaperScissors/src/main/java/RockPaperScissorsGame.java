import java.util.Scanner;

public class RockPaperScissorsGame {
  private Player p1;
  private Player p2;
  private int currentRound = 1;
  private int totalRounds;
  Scanner scanner = new Scanner(System.in);

  private static final String rock = "    _______\n"
                               + "---'   ____)\n"
                               + "      (_____)\n"
                               + "      (_____)\n"
                               + "      (____)\n"
                               + "---.__(___)";
  private static final String paper = "     _______\n"
                                + "---'    ____)____\n"
                                + "           ______)\n"
                                + "          _______)\n"
                                + "         _______)\n"
                                + "---.__________)";
  private static final String scissors = "    _______\n"
                                   + "---'   ____)____\n"
                                   + "          ______)\n"
                                   + "       __________)\n"
                                   + "      (____)\n"
                                   + "---.__(___)";
  public static final String[] plays = {rock, paper, scissors};

  RockPaperScissorsGame() {

  }

  public void printIntro() {
    System.out.println();
    System.out.println("Welcome to Rock Paper Scissors - the classic 2 player game");
    System.out.println("----------------------------------------------------------");
  }

  public void promptNameP1() {
    System.out.print("Player 1, please enter your name: ");
    String p1Name = scanner.next();
    setP1(p1Name);
  }

  public void promptNameP2() {
    System.out.print("Player 2, please enter your name: ");
    String p2Name = scanner.next();
    setP2(p2Name);
  }

  public void promptStart() {
    System.out.print(String.format("%s, %s.. are you ready to begin? Y/N: ", p1.getName(), p2.getName()));
    String begin = scanner.next();
    if (begin.equals("Y")) {
      System.out.print("Enter the number of rounds you would like to play: ");
      setTotalRounds(scanner.nextInt());
    } else {
      System.out.println("Exiting..");
      System.exit(0);
    }
  }

  public void printRules() {
    System.out.println();
    System.out.println("GAME RULES: ");
    System.out.println("1 = ROCK");
    System.out.println("2 = PAPER");
    System.out.println("3 = SCISSORS");
    System.out.println("TAKE TURNS BY TYPING THE NUMBER ASSOCIATED WITH YOUR DESIRED PLAY");
    System.out.println("GAME ENDS AFTER YOU PLAY ALL ROUNDS");
    System.out.println();
  }

  public void playRound(Player p1, Player p2) {
    int p1Play, p2Play;

    System.out.println("--------------------------------");
    System.out.println(String.format("Round %s", this.currentRound));
    System.out.println(String.format("Scores - %s(P1): %s %s(P2): %s", p1.getName(), p1.getScore(), p2.getName(), p2.getScore()));
    System.out.println("--------------------------------");

    System.out.println(String.format("%s, please look away for a moment!", p2.getName()));
    System.out.print(String.format("Player 1's Turn: %s, please input the number for your play: ", p1.getName()));
    p1Play = scanner.nextInt();

    System.out.println(String.format("%s, please look away for a moment!", p1.getName()));
    System.out.print(String.format("Player 2's Turn: %s, please input the number for your play: ", p2.getName()));
    p2Play = scanner.nextInt();

    System.out.println("--------------------------------");
    System.out.println("Rock, Paper, Scissors.. SHOOT!");
    System.out.println(String.format("P1 %s:\n%s", p1.getName(), RockPaperScissorsGame.plays[p1Play - 1]));
    System.out.println(String.format("P2 %s:\n%s", p2.getName(), RockPaperScissorsGame.plays[p2Play - 1]));
    determineRoundWinner(p1Play, p2Play);
    this.setCurrentRound(this.getCurrentRound() + 1);
  }

  public void printFinalScores() {
    System.out.println("--------------------------------");
    System.out.println("GAME OVER");
    System.out.println(String.format("Scores - %s(P1): %s %s(P2): %s", p1.getName(), p1.getScore(), p2.getName(), p2.getScore()));
  }

  public Player getP1() {
    return this.p1;
  }

  public void setP1(String name) {
    this.p1 = new Player(name);
  }

  public Player getP2() {
    return this.p2;
  }

  public void setP2(String name) {
    this.p2 = new Player(name);
  }

  public int getTotalRoundsRounds() {
    return this.totalRounds;
  }

  public void setTotalRounds(int totalRounds) {
    this.totalRounds = totalRounds;
  }

  public int getCurrentRound() {
    return this.currentRound;
  }

  public void setCurrentRound(int currentRound) {
    this.currentRound = currentRound;
  }

  public void determineRoundWinner(int p1Play, int p2Play) {
    if(p1Play == p2Play) {
      System.out.println("It's a tie!");
    } else if ((p1Play - p2Play + 3) % 3 == 1) {
      System.out.println("--------------------------------");
      System.out.println(String.format("P1: %s wins!", p1.getName()));
      p1.setScore(p1.getScore() + 1);
    } else {
      System.out.println("--------------------------------");
      System.out.println(String.format("P2: %s wins!", p2.getName()));
      p2.setScore(p2.getScore() + 1);
    }
  }

  public void resetScores() {
    p1.setScore(0);
    p2.setScore(0);
  }
}
