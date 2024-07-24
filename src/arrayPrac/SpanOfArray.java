package arrayPrac;

public class SpanOfArray implements ArrayOperation {
  @Override
  public void calculateSpan(int[] array) {
    try {
      int max = array[0];
      int min = array[0];
      for( int val : array ) {
        if( max < val ){
          max = val;
        } 
        if( min > val ) {
          min = val;
        }
      }
      System.out.println(String.format("max: %d | min: %d", max, min));
      final int span = max - min;
      System.out.println(String.format("Span of given array is %d", span));

    } catch (Exception e) {
      // TODO: handle exception
    }
  }  
}
