
public class Main {
  public static void main(String[] args) {
    int x = 7;
    int y = 4;
    // AND
    if(x > y && x > 0) {
      System.out.println("both conditions are true");
    }

    // OR
    if(x > 1 || y == 1) {
      System.out.println("at least one of the conditions are true");
    }

    // NOT
    if(x != 3) {
      System.out.println("x does not equal 3");
    }
  }
}