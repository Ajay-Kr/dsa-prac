package arrayPrac;

public class ArrayPrac {
  private ArrayOperation arrayOperation;
  private ArrayQuestions arrayQuestions;

  public ArrayPrac(ArrayOperation arrayOperation) {
    this.arrayOperation = arrayOperation;
  }

  public ArrayPrac(ArrayQuestions arrayQuestions) {
    this.arrayQuestions = arrayQuestions;
  }
  
  public void executeOperation () {
    int[] array = ArrayUtils.getArrayFromUser();

    if(arrayOperation instanceof ArrayOperation) {
      ((ArrayOperation) arrayOperation).calculateSpan(array);
    }

    else if(arrayQuestions instanceof ArrayQuestions) {
      // ((ArrayQuestions) arrayQuestions).peakElement(array);
      // ((ArrayQuestions) arrayQuestions).findPeakBinary(array);
      // ((ArrayQuestions) arrayQuestions).findMaxMin(array);
      // ((ArrayQuestions) arrayQuestions).findReverseArray(array);
      ((ArrayQuestions) arrayQuestions).findKthSmallestElm(array);
    }
  }
}
