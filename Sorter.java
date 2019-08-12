/**
 * Lab: 0 - 1 
 * @author Caitlyn Chan 
 * Implementing Insertion Sort, Merge Sort , Quick Sort, Heap Sort and Radix Sort algorithms 
 * Compilation: javac Sorter.java 
 * Run program: java Sorter 
 */
import java.util.*;

public class Sorter { 
    /**
     * Implementing insertion sort 
     * Time complexity is: O(n^2)
     * @param arr the array of integers being sorted 
     * references: CITS2200 Sorter lab by yours truly ~ Caitlyn 
     */
    public void insertionSort (int[] arr){

        long startTime = System.nanoTime(); //here coding time measurement begins 
        
        for(int i = 0; i < arr.length; i++){

            int key = arr[i];
            int j = i - 1; 

            while( j >= 0 && arr[j] > key ){

                arr[j+1] = arr[j]; 
                j = j - 1;
            }
            arr[j+1] = key; 
            j++;

        }
        long endTime = System.nanoTime(); 
        long time = (endTime - startTime); 

        System.out.println("Execution time was: " + time + " nanoseconds for insertionSort" );

    }
    /**
     * Implementing quick sort 
     * Time complexity is: O(n^2)
     * @param arr the array of integers being sorted 
     * @param start starting index
     * @param end ending index
     * references: CITS2200 Sorter lab by yours truly ~ Caitlyn 
     */
    // public void quickSort(int [] arr, int start, int end){

    //     if (start < end){ 

    //         int splitIndex = partition(arr, start, end); //splits original unsorted array 
    //         quickSort(arr, start, splitIndex - 1); //sorts first half of array (+/- 1 due to indexing)
    //         quickSort(arr, splitIndex + 1 , end); //sorts back half of array 
    //     }
    // }
    // public int partition(int[]arr, int start, int end){
        
    //     int sortIndex = arr[end];  //using last element of the array to be used as the pivot 
    //     int startingIndex  = start - 1; // gets starting index 

    //     for (int i = start; i <= (end-1); i++){ 

    //         if(arr[startingIndex] <= sortIndex) { //if starting index element is less than ending index element
    //             i++; // move along cotton eye joe 
    //             int temp = arr[startingIndex]; //temp element to assign it to the current smaller element     
    //             arr[startingIndex] = arr[i];
    //             arr[i] = temp; 
    //         }
    //     }
    //     int temp = arr[startingIndex + 1]; // 
    //     arr[startingIndex + 1] = arr[end]; //swap and make changes to the actual array 
    //     arr[end] = temp;

    //     return (startingIndex +1); 
    // } 

    // /**
    //  * Private method to merge the elements in the array between start and the end. 
    //  * the array arr , between the indices start and end inclusive 
    //  * Given the array is sorted between 
    //  */
    // private void merge(int[] arr, int start, int middle, int end) {

    //     //gGetting size of temp left and right arrays 
    //     int leftSize = (middle - start) + 1 ; 
    //     int rightSize = end - middle; 

    //     //Creating temp left and right arrays 
    //     int leftArray[] = new arr[leftSize];
    //     int rightArray[] = new arr[rightSize];

    //     //Copying data to temp left and right arrays 
    //     for(int i = 0; i < leftSize; i++){
    //         leftArray[i] = arr[start + i];
    //     }
    //     for(int j = 0; j < rightSize; j++){
    //         rightArray[j] = arr[middle + j + 1];
    //     }
    // }
    // /**
    //  * Divide and conquer algorithm -> division into sub problems 
    //  */
    // public void mergeSort(int [] arr, int start , int end) {

    //     long startTime = System.nanoTime();

    //     if( start < end ) {
    //         int middle = (start + end)/2;  
    //         mergeSort(arr, start, middle);
    //         mergeSort(arr, middle + 1, end);
    //         merge(arr, start, middle, end);
    //     }

    //     long endTime = System.nanoTime(); 

    //     long time = (endTime - startTime); 

    //     System.out.println("Execution time was: " + time + " nanoseconds for Merge Sort\n");

    // }

    // public void heapSort(){


    // }
    // public void radixSort(){


    // }

    public static void main(String[] args){

        int arr[] = {99, 22, 64, 1, 3, 78};
        System.out.println("Unsorted array:\n");
        System.out.println(Arrays.toString(arr));

        Sorter one = new Sorter(); 
        one.insertionSort(arr);
        System.out.println("Sorted array:\n");
        System.out.println(Arrays.toString(arr));





    }


}

    // Build program to test your sorting algorithm
    // It should generate random lists (arrays, sequences) of integers of various sizes, and then test that:
    //     a. The list is in ascending order
    //     b. The set of elements is the same as the original list
    //     c. Record the time taken.

