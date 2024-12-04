public class Main {
  public static void main(String[] args) {
    int x = 100;

    if(x == 100) {
      System.out.println("Keep it 100");
    } else if (x >= 50 && x < 100) {
      System.out.println("You're partway there");
    } else {
      System.out.println("Lock in dude");
    }


    // TERNARY
    // condition ? code when true : code when false
    String ternary = x == 100 ? "Keep it 100" : "Lock in dude";
    System.out.println(ternary);

    // SWITCH STATEMENTS
    String color = "blue";

    switch (color) {
      case "blue":
        System.out.println("I'm blue like water");
        break;
      case "green":
        System.out.println("I'm green like the Hulk");
        break;
      case "red":
        System.out.println("I'm red like an apple");
        break;
      case "yellow":
        System.out.println("I'm yellow like a banana");
        break;
      default:
        System.out.println("I'm neutral");
        break;
    }
  }
}