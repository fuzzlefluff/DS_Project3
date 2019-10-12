public class heapSortBox {
 
   private static int[] sortArray;
   private static int index;
   private static int left;
   private static int right;
   private static int max;
 
 
   public static void buildheap(int []sortArray) 
   {
      index = sortArray.length-1;
      for(int i=index/2; i>=0; i--)
      {
         maxheap(sortArray,i);
      }
   }
 
   public static void maxheap(int[] sortArray, int i) 
   { 
      left = 2*i;
      right = 2*i+1;
 
      if(left <= index && sortArray[left] > sortArray[i])
      	{
    	  max=left;
      	} 
      else 
      {
         max=i;
      }
 
      if(right <= index && sortArray[right] > sortArray[max]) 
      {
         max=right;
      }
      if(max!=i) 
      {
         swap(i, max);
         maxheap(sortArray,max);
      }
   }
 
   public static void swap(int i, int j) 
   {
        int t = sortArray[i];
        sortArray[i] = sortArray[j];
        sortArray[j] = t; 
   }
 
   public static void heapSort(int[] inpArray) {
      sortArray = inpArray;
      buildheap(sortArray);
      for(int i=index; i>0; i--) {
         swap(0, i);
         index=index-1;
         maxheap(sortArray, 0);
      }
   }
}
   