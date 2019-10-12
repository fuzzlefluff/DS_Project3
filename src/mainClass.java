
public class mainClass {
		
		//Variables we will use
		static double quickSortAverage;
		static double heapAverage;
		static double heapAverageA;
		static double heapAverageB;
		static double heapAverageC;
		static double middleAverage;
		static double middleAverageA;
		static double middleAverageB;
		static double middleAverageC;
		static double randomAverage;
		static double randomAverageA;
		static double randomAverageB;
		static double randomAverageC;
		static double medianAverage;
		static double medianAverageA;
		static double medianAverageB;
		static double medianAverageC;
		
	public static void main(String[] args) {
		
		//List A
		//Run the middle sort 5 times, average it
		middleSortTrial(Lists.getListA());
		middleSortTrial(Lists.getListA());
		middleSortTrial(Lists.getListA());
		middleSortTrial(Lists.getListA());
		middleSortTrial(Lists.getListA());
		middleAverageA = middleAverage/5;
		middleAverage = 0;
		middleSortTrial(Lists.getListB());
		middleSortTrial(Lists.getListB());
		middleSortTrial(Lists.getListB());
		middleSortTrial(Lists.getListB());
		middleSortTrial(Lists.getListB());
		middleAverageB = middleAverage/5;
		middleAverage = 0;
		middleSortTrial(Lists.getListC());
		middleSortTrial(Lists.getListC());
		middleSortTrial(Lists.getListC());
		middleSortTrial(Lists.getListC());
		middleSortTrial(Lists.getListC());
		middleAverageC = middleAverage/5;
		middleAverage = 0;
		
		
		//Run the random sort 5 times, average it
		randomSortTrial(Lists.getListA());
		randomSortTrial(Lists.getListA());
		randomSortTrial(Lists.getListA());
		randomSortTrial(Lists.getListA());
		randomSortTrial(Lists.getListA());
		randomAverageA = randomAverage/5;
		randomAverage = 0;
		randomSortTrial(Lists.getListB());
		randomSortTrial(Lists.getListB());
		randomSortTrial(Lists.getListB());
		randomSortTrial(Lists.getListB());
		randomSortTrial(Lists.getListB());
		randomAverageB = randomAverage/5;
		randomAverage = 0;
		randomSortTrial(Lists.getListC());
		randomSortTrial(Lists.getListC());
		randomSortTrial(Lists.getListC());
		randomSortTrial(Lists.getListC());
		randomSortTrial(Lists.getListC());
		randomAverageC = randomAverage/5;
		randomAverage = 0;
		
		//Run the median sort 5 times, average it
		medianSortTrial(Lists.getListA());
		medianSortTrial(Lists.getListA());
		medianSortTrial(Lists.getListA());
		medianSortTrial(Lists.getListA());
		medianSortTrial(Lists.getListA());
		medianAverageA = medianAverage/5;
		medianAverage = 0;
		medianSortTrial(Lists.getListB());
		medianSortTrial(Lists.getListB());
		medianSortTrial(Lists.getListB());
		medianSortTrial(Lists.getListB());
		medianSortTrial(Lists.getListB());
		medianAverageB = medianAverage/5;
		medianAverage = 0;
		medianSortTrial(Lists.getListC());
		medianSortTrial(Lists.getListC());
		medianSortTrial(Lists.getListC());
		medianSortTrial(Lists.getListC());
		medianSortTrial(Lists.getListC());
		medianAverageC = medianAverage/5;
		medianAverage = 0;
		
		//Print our results
		System.out.println("-------MIDDLE-------");
		System.out.println("The middle average runtime for  list A is: "+ middleAverageA);
		System.out.println("The middle average runtime for list B is: "+ middleAverageB);
		System.out.println("The middle average runtime for list C is: "+ middleAverageC);
		middleAverage = ((middleAverageA+middleAverageB+middleAverageC)/3);
		System.out.println("The middle average runtime for the three lists is: "+ middleAverage);
		System.out.println("-------RANDOM-------");
		System.out.println("The random average runtime for  list A is: "+ randomAverageA);
		System.out.println("The random average runtime for list B is: "+ randomAverageB);
		System.out.println("The random average runtime for list C is: "+ randomAverageC);
		randomAverage =((randomAverageA+randomAverageB+randomAverageC)/3);
		System.out.println("The random average runtime for the three lists is: "+ randomAverage);
		System.out.println("-------MEDIAN-------");
		System.out.println("The median average runtime for  list A is: "+ medianAverageA);
		System.out.println("The median average runtime for list B is: "+ medianAverageB);
		System.out.println("The median average runtime for list C is: "+ medianAverageC);
		medianAverage =((medianAverageA+medianAverageB+medianAverageC)/3);
		System.out.println("The median average runtime for the three lists is: "+ medianAverage);
		System.out.println("-------QUICKSORT-------");
		System.out.println("The total average runtime for the three lists and the three methods is: " +((medianAverage+randomAverage+middleAverage)/3));
		
		//Run the heap sort 5 times, average it
		heapSortTrial(Lists.getListA());
		heapSortTrial(Lists.getListA());
		heapSortTrial(Lists.getListA());
		heapSortTrial(Lists.getListA());
		heapAverageA = heapAverage/5;
		heapAverage = 0;
		heapSortTrial(Lists.getListB());
		heapSortTrial(Lists.getListB());
		heapSortTrial(Lists.getListB());
		heapSortTrial(Lists.getListB());
		heapSortTrial(Lists.getListB());
		heapSortTrial(Lists.getListB());
		heapAverageB = heapAverage/5;
		heapAverage = 0;
		heapSortTrial(Lists.getListC());
		heapSortTrial(Lists.getListC());
		heapSortTrial(Lists.getListC());
		heapSortTrial(Lists.getListC());
		heapSortTrial(Lists.getListC());
		heapAverageC = heapAverage/5;
		heapAverage = (heapAverageA + heapAverageB + heapAverageC)/3;
		System.out.println("-------HEAP-------");
		System.out.println("The heap average runtime for list A is: " +heapAverageA);
		System.out.println("The heap average runtime for list B is: " +heapAverageB);
		System.out.println("The heap average runtime for list C is: " +heapAverageC);
		System.out.println("The heap average runtime for the three lists is: "+heapAverage);
	}

	private static void heapSortTrial(int[] List)
	{
		//create a variable to store the timer result
		double runTime;
		//Start the Timer
		Stopwatch myTimer = new Stopwatch();
		//Call the quickSort Algorithm that uses the Middle Element
		heapSortBox.heapSort(List);
		//Stop the timer
		runTime = myTimer.elapsedTime();
		//Add our result to the total runtime
		heapAverage += runTime;
	}

	//A Method that run the Middle sort and stores the time
	private static void middleSortTrial(int[] List)
	{
		//create a variable to store the timer result
		double runTime;
		//Start the Timer
		Stopwatch myTimer = new Stopwatch();
		//Call the quickSort Algorithm that uses the Middle Element
		quickSortBox.quickSortMiddle(List, 0, List.length-1);
		//Stop the timer
		runTime = myTimer.elapsedTime();
		//Add our result to the total runtime
		middleAverage += runTime;
		
	}
	//A Method that run the Random sort and stores the time
	private static void randomSortTrial(int[] List)
	{
		//create a variable to store the timer result
		double runTime;
		//Start the Timer
		Stopwatch myTimer = new Stopwatch();
		//Call the quickSort Algorithm that uses the Random Element
		quickSortBox.quickSortRandom(List, 0, List.length-1);
		//Stop the timer
		runTime = myTimer.elapsedTime();
		//Add our result to the total runtime
		randomAverage += runTime;
		
	}
	//A Method that run the Median sort and stores the time
	private static void medianSortTrial(int[] List)
	{
		//create a variable to store the timer result
		double runTime;
		//Start the Timer
		Stopwatch myTimer = new Stopwatch();
		//Call the quickSort Algorithm that uses the Median Element
		quickSortBox.quickSortMedian(List, 0, List.length-1);
		//Stop the timer
		runTime = myTimer.elapsedTime();
		//Add our result to the total runtime
		medianAverage += runTime;
		
	}
}