/**
 * Test class for the implemented sorting algorithms 
 * @author Caitlyn Chan 
 */

 public class SorterTest{

    public static void main (String[] args){

        int [] testArray; 

        if(args.length == 0) {

            testArray = new int[0]; 
        }
        else if (args.length == 1) { // difference between else & else if?? 
            testArray = makeTheTestArray(Integer.parseInt(args[0])); // parses a string and returns an integer
        }
        else {
            testArray = new int[args.length];
            for (int i = 0; i < args.length; i++) testArray[i] = Integer.parseInt(args[i]);
        }
        runSortingAlgorithms(testArray);
        System.exit(0);
    }

    private static void runSortingAlgorithms(int[] testArray){

        Sorter s = new Sorter(); //calling Sorter program 
        System.out.println ("Test array is: ");
        printArray(testArray); 

        checkIfSorted(testArray);
        
        int[] insertionSortArray = testArray.clone();
        s.insertionSort(insertionSortArray);
        printOutput(testArray, insertionSortArray)

        int[] mergeSortArray = testArray.clone(); 
        s.mergeSort(mergeSortArray);
        printOutput(testArray, mergeSortArray);

        int[] quickSortArray = testArray.clone(); 
        s.quickSort(quickSortArray);
        printOutput(testArray, quickSortArray); 

        int[] heapSortArray = testArray.clone(); 
        s.heapSort(heapSortArray);
        printOutput(testArray, heapSortArray); 

        int[] radixSortArray = testArray.clone();
        s.radixSort(radixSortArray); 
        printOutput(testArray, radixSortArray); 

    }

    /**
     * @param testArraySize is the size of the array being created 
     */

    private static int[] makeTheTestArray(int testArraySize){

        int[] arrayCreated = new int[testArraySize];
        if(testArraySize < 0) {
            System.out.println("Invalid array size. Need an array of at least two elements\n");
        }
        else if (testArraySize < 2) {
            System.out.println("Array of size 1 = already sorted. Needs to have > 2 elements\n");

        }
        for (int i = 0; i < testArraySize; i++){
            arrayCreated = (int)(Math.random() * 100);
        }
        return arrayCreated;
    }
    /**
     * @param arr is the array being printed 
     * 
     */
    private static void printArray(int[] arr){

        if(arr.length < 100){

            System.out.print("[");
            
            for(int i = 0; i < a.length; i++){

                if (i!=a.length-1) System.out.print(a[y] + " ");
                else  System.out.print(a[y]);
            }
            System.out.print("]\n");
        }
        else{
            System.out.println("Array is a big boi and has exceed parameter limit of 100 elements\n");
        }
    }

    /**
     * Checks if the the array has indeed been sorted 
     * @param a the array being checked to see if it's sorted 
     */

    private static void checkIfSorted(int[] a){

        boolean sorted = true; 

        for(int i = 0; i < a.length-1; i++){

            if(a[i]> a[i+1]){

                sorted = false; 
                break; 
            }
        }
        if(sorted) 
            System.out.println("Array is sorted\n"); 
        else
            System.out.println("Array ain't sorted\n");

    }

    private static void printOutput(int[] unsortedArray, int[] sortedArray) {
    
        printArray(sortedArray);
        checkIfSorted(sortedArray);
        //maybe check if the elements are the same if you can be fucked. 
    }

 }