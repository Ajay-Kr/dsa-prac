package arrayPrac;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQues implements ArrayQuestions {
  private int findPeakLinear(int[] array, int len) {
    if (len == 1)
      return 0;
    if (array[0] >= array[1])
      return 0;
    if (array[len - 1] >= array[len - 2])
      return len - 1;

    for (int i = 1; i < len - 1; i++) {
      if (array[i] >= array[i - 1] && array[i] >= array[i + 1])
        return i;
    }
    return -1;
  }
  
  // Return any of the peak element index
  // Peak element: element having value >= adjacent elements
  @Override
  public void peakElement(int[] array) {
    try {
      final int length = array.length;
      int peakElmIdx = findPeakLinear(array, length);

      if(peakElmIdx < 0) {
        System.out.println("No peak element");
      } else {
        System.out.println(String.format("Peak elm idx: %d | elm: %d", peakElmIdx, array[peakElmIdx]));
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  private int findPeakBinaryUtil(int[] array, int low, int high, int len) {
    try {
      int mid = low + (high - low) / 2;

      // Compare middle element with its
      // neighbours (if neighbours exist)
      if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == len - 1 || array[mid] >= array[mid + 1])) {
        // Case 1: mid is a peak element
        return mid;
      }
      // If middle element is not peak
      // and its left neighbor is
      // greater than it, then left half
      // must have a peak element
      else if (mid > 0 && array[mid - 1] > array[mid]) {
        // Case 2: peak is in the left subarray
        return findPeakBinaryUtil(array, low, mid-1, len);
      }
      // If middle element is not peak
      // and its right neighbor
      // is greater than it, then right
      // half must have a peak
      // element
      else {
        // Case 3: peak is in the right subarray
        return findPeakBinaryUtil(array, mid+1, high, len);
      }
    } catch (Exception e) {
      System.err.println(e);
      return -1;
    }
  }

  @Override
  public void findPeakBinary(int[] array) {
    try {
      final int length = array.length;
      int peakElmIdx = findPeakBinaryUtil(array, 0, length -1, length);

      if(peakElmIdx < 0) {
        System.out.println("No peak element");
      } else {
        System.out.println(String.format("Peak elm idx: %d | elm: %d", peakElmIdx, array[peakElmIdx]));
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  @Override
  public void findMaxMin(int[] array) {
    try {
      System.out.println(Arrays.toString(array));
      Arrays.sort(array);
      int min = array[0];
      int max = array[array.length - 1];
      System.out.println(Arrays.toString(array));
      System.out.println(String.format("Min elm: %d | Max elm: %d", min, max));
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  @Override
  public void findReverseArray(int[] array) {
    try {
      System.out.println(Arrays.toString(array));
      
      final int len = array.length;
      for(int i = 0; i < len/2; i++) {
        int temp = array[i];
        array[i] = array[len-1-i];
        array[len-1-i] = temp;
      }

      System.out.println(Arrays.toString(array));
    } catch (Exception e) {
      // TODO: handle exceptio
      e.printStackTrace();
    }
  }

  @Override
  public void findKthSmallestElm(int[] array) {
    Scanner scn = new Scanner(System.in);
    try {
      Arrays.sort(array);
      
      System.out.println("Enter the value for k: ");
      int k = scn.nextInt();
      if(k > array.length) {
        System.out.println(String.format("Invalid value of k, cannot be greater than arrays length (%d)", array.length));
      }
      final int kthElm = array[k-1];
      System.out.println(String.format("Smallest %d element is %d: ", k, kthElm));
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    } finally {
      scn.close();
    }
  }
}
