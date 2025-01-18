package Basics;

import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to our Division Calculator!");
    System.out.print("Enter your Dividend: ");
    int x = sc.nextInt();
    System.out.print("Enter your Divisor: ");
    int y = sc.nextInt();

    try {
      int result = x / y;
      System.out.printf("Result is %d", result);
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero is invalid!!!");
    }
    sc.close();
  }
}
