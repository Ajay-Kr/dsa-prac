package arrayPrac;

import java.util.Scanner;

public class ArrayUtils {
  public static int[] getArrayFromUser() {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Enter length of array: ");
      int length = scanner.nextInt();

      int[] array = new int[length];
      System.out.println(String.format("Enter %d elemnts: ", length));
      for( int i = 0; i < length; i++) {
        array[i] = scanner.nextInt();
      }
      
      return array;
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Error reading input: " + e.getMessage());
      return new int[0];
    } finally {
      scanner.close();
    }
  }
}
