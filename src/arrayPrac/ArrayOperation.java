package arrayPrac;

// Define interfaces for specific functionalities

interface ArrayOperation {
  void calculateSpan(int[] array);
}

interface ArrayQuestions {
  void peakElement(int[] array);

  void findPeakBinary(int[] array);

  void findMaxMin(int[] array);

  void findReverseArray(int[] array);

  void findKthSmallestElm(int[] array);
}

interface SortingOperation {
  void sort();
}

interface SearchingOperation {
  void search();
}
