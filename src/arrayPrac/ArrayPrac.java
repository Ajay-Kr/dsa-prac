package arrayPrac;

public class ArrayPrac {
  private ArrayOperation arrayOperation;

  public ArrayPrac(ArrayOperation arrayOperation) {
    this.arrayOperation = arrayOperation;
  }
  
  public void executeOperation () {
    int[] array = ArrayUtils.getArrayFromUser();
    if(arrayOperation instanceof ArrayOperation) {
      ((ArrayOperation) arrayOperation).calculateSpan(array);
    }
    
  }
}
