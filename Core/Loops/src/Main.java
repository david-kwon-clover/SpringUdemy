public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    // INSTEAD OF THIS... ^

    // FOR LOOP
    for(int i = 1; i <= 5; i++) {
      System.out.println("Hello World!");
    }

    // WHILE LOOP
    int count = 1;
    while(count <= 5) {
      System.out.println("Hello World!");
      count++;
    }

    // DO WHILE LOOP
    int count2 = 1;
    do {
      System.out.println("Hello World!");
      count2++;
    } while(count2 <= 5);
  }
}