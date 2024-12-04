public class Main {
  public static void main(String[] args) {
    int num1 = 14;
    int num2 = 7;

    // ADDITION OPERATOR
    int additionResult = num1 + num2;
    System.out.println("Addition operation: " + additionResult);

    // SUBTRACTION OPERATOR
    int subtractionResult = num1 - num2;
    System.out.println("Subtraction operation: " + subtractionResult);

    // MULTIPLICATION OPERATOR
    int multiplicationResult = num1 * num2;
    System.out.println("Multiplication operation: " + multiplicationResult);

    // DIVISION OPERATOR
    int divisionResult = num1 / num2;
    System.out.println("Division operation: " + divisionResult);

    // MODULUS OPERATOR
    int modulusResult = num1 % num2;
    System.out.println("Modulus operation: " + modulusResult);

    // INCREMENT
    num1 += 2;
    // num1 ++; => increments by 1
    // num *= 3; => multiplies by 3
    System.out.println("Incremented operation: " + num1);

    // PRE VS POST INCREMENT
    int postIncrement = num1++; // => assigns value of num1 THEN increments
    System.out.println("Post-incremented operation: " + postIncrement);
    int preIncrement = ++num1; // => increments THEN assigns value of incremented num1
    System.out.println("Pre-incremented operation: " + preIncrement);

    // DECREMENT
    num2 -= 2;
    // num2 --; => decrements by 1
    // num2 /= 2; => divides by 2
    System.out.println("Decremented operation: " + num2);
  }
}