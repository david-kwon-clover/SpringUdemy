public class Main {
  public static void main(String[] args) {
    int x = 6;
    int y = 5;
    int z = 5;

    // LESS THAN
    boolean lessThan =  x < y;
    System.out.println(lessThan);

    // GREATER THAN
    boolean greaterThan =  x > y;
    System.out.println(greaterThan);

    // LESS THAN OR EQUAL TO
    boolean lessThanOE = x <= y;
    System.out.println(lessThanOE);

    // GREATER THAN OR EQUAL TO
    boolean greaterThanOE = y >= z;
    System.out.println(greaterThanOE);

    // EQUAL
    boolean equal = x == y;
    System.out.println(equal);

    // NOT EQUAL
    boolean notEqual = x != y;
    System.out.println(notEqual);
  }
}