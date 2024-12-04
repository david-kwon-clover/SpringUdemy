public class Main {
  public static void main(String[] args) {
    // EXPLICIT(MANUAL);
    double myDouble = 5.7;
    int myInt = (int) myDouble; // myInt is now 5

    // IMPLICIT(AUTOMATIC)
    int intVal = 5;
    double doubleVal = myInt; // doubleVal is now 5.0

    // TYPE PROMOTION
    byte a = 10;
    byte b = 30;
    // 300 is out of range for byte 256
    int result = a * b; // => promotes resulting product into int
  }
}