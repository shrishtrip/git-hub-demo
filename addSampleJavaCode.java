import java.util.Scanner;

public class addSampleJavaCode {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Hey there. Enter your name. ");
    System.out.println();
    String fname = input.next();
    System.out.println("Hello "+fname+". Glad to e-meet you.");
  }
}