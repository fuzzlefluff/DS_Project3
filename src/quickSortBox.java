import java.util.Random;
public class quickSortBox {
	//A QuickSort Method that takes the middle element of the given range
	public static void quickSortMiddle(int[] iList, int leftI, int rightI)
	{
		//If our list doesn't contain anything we quit now
		if(iList == null) {return;}
		//If our given indexes are inverted, we break the recursion
		if(leftI >=rightI) {return;}
		//Calculate the partition index of the middle of the given list
		int partitionI = leftI + ((rightI - leftI)/2);
		//Copy our start indexes to our cursor counters
		int leftC = leftI;
		int rightC = rightI;
		//Scan through the list until our cursor counters pass each other
		while (leftC <= rightC)
		{
			//Scan through the list until we find a value that is bigger than the pivot value
			while(iList[leftC] < iList[partitionI]){leftC++;}
			//Scan through the list until we find a value that is smaller than the pivot value
			while(iList[rightC] > iList[partitionI]){rightC--;}
			//swap our two values to the proper partition
			if(leftC <= rightC) {swap(iList,leftC,rightC); leftC++; rightC--;}
		}
		//Check to see if we need to sort the smaller partition and recursively do so
		if(leftI < rightC ) {quickSortMiddle(iList,leftI, rightC);}
		//Check to see if we need to sort the larger partition and recursively do so 
		if(rightI> leftC) {quickSortMiddle(iList,leftC,rightI);}
	}
	//A QuickSort Method that takes a random element of the given range
	public static void quickSortRandom(int[] iList,int leftI,int rightI)
	{
		//Setup a random number box
		Random rBox = new Random();
		//If our list doesn't contain anything we quit now
		if(iList == null) {return;}
		//If our given indexes are inverted, we break the recursion
		if(leftI >=rightI) {return;}
		//Grab a random index for our partition
		int partitionI = rBox.nextInt(rightI-leftI);
		//Copy our start indexes to our cursor counters
		int leftC = leftI;
		int rightC = rightI;
		//Scan through the list until our cursor counters pass each other
		while (leftC <= rightC)
		{
			//Scan through the list until we find a value that is bigger than the pivot value
			while(iList[leftC] < iList[partitionI]){leftC++;}
			//Scan through the list until we find a value that is smaller than the pivot value
			while(iList[rightC] > iList[partitionI]){rightC--;}
			//swap our two values to the proper partition
			if(leftC <= rightC) {swap(iList,leftC,rightC); leftC++; rightC--;}
		}
		//Check to see if we need to sort the smaller partition and recursively do so
		if(leftI < rightC ) {quickSortMiddle(iList,leftI, rightC);}
		//Check to see if we need to sort the larger partition and recursively do so 
		if(rightI> leftC) {quickSortMiddle(iList,leftC,rightI);}
	}
	//A QuickSort Method that takes 3 random elements of the given range and uses the Median
	public static void quickSortMedian(int[] iList, int leftI, int rightI)
	{
		//Setup a random number box
		Random rBox = new Random();
		//If our list doesn't contain anything we quit now
		if(iList == null) {return;}
		//If our given indexes are inverted, we break the recursion
		if(leftI >=rightI) {return;}
		//Get the middle value of 3 random indexes
		int pivot = getmedian3(iList[rBox.nextInt(rightI-leftI)],iList[rBox.nextInt(rightI-leftI)],iList[rBox.nextInt(rightI-leftI)]);
		//Copy our start indexes to our cursor counters
		int leftC = leftI;
		int rightC = rightI;
		//Scan through the list until our cursor counters pass each other
		while (leftC <= rightC)
		{
			//Scan through the list until we find a value that is bigger than the pivot value
			while(iList[leftC] < pivot){leftC++;}
			//Scan through the list until we find a value that is smaller than the pivot value
			while(iList[rightC] > pivot){rightC--;}
			//swap our two values to the proper partition
			if(leftC <= rightC) {swap(iList,leftC,rightC); leftC++; rightC--;}
		}
		//Check to see if we need to sort the smaller partition and recursively do so
		if(leftI < rightC ) {quickSortMiddle(iList,leftI, rightC);}
		//Check to see if we need to sort the larger partition and recursively do so 
		if(rightI> leftC) {quickSortMiddle(iList,leftC,rightI);}
	}
	//A Simple method that swaps two values in an array to reduce clutter
	private static void swap(int[] iList,int i1,int i2) 
	{
		int temp = iList[i1];
		iList[i1] = iList[i2];
		iList[i2] = temp;
 	}
	//A Simple method that returns the middle value of 3 given numbers
	private static int getmedian3(int a, int b, int c)
	{
		if(a < b && a > c) {return a;}
		if(b< a && b > c) {return b;}
		if(c<a && c > b) {return c;}
		if(a > b && a < c) {return a;}
		if (b > a && b < c) {return b;}
		if(c > a && c < b) {return c;}
		return a;
	}
}
