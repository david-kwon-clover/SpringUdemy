import java.io.FileReader;

public class Main {
  public static void main(String[] args) {
    // sayHello(null); => throws NullPointerException
    // var reader = new FileReader("file.txt"); => Throws FileNotFoundException
  }

  public static void sayHello(String name) {
    System.out.println(name.toUpperCase());
  }
}
