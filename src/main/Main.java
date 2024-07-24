package main;

import arrayPrac.ArrayPrac;
import arrayPrac.ArrayQues;
import arrayPrac.SpanOfArray;

public class Main {
  public static void main(String[] args) {
    System.out.println("Main!");

    // SpanOfArray spanOfArray = new SpanOfArray();
    // ArrayPrac arrayPrac = new ArrayPrac(spanOfArray);
    // arrayPrac.executeOperation();

    ArrayQues arrayQues = new ArrayQues();
    ArrayPrac arrayPracQues = new ArrayPrac(arrayQues);
    arrayPracQues.executeOperation();
  }
}
