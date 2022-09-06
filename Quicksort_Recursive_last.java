

import java.util.*;
class QuickSort 
{ 

	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

    //selects last element as pivot, pi using which array is partitioned. 
    int partition(int arr[], int low, int high)
	{ 
        int pi = arr[high]; 
		System.out.println("partition pi " + pi + " low " + low + " high " + high);
        int i = (low-1); // smaller element index   
        for (int j=low; j<high; j++) 
		{ 
            // check if current element is less than or equal to pi 
			if (arr[j] < pi) 
			{ 
				// Increment index of smaller element
                i++; 
				System.out.println("arr[j] " + arr[j] + " " + i + " " + j);

                // swap arr[i] and arr[j] 
				if(i != j)
				{
					swap(arr, i, j);
					System.out.println("Array after swap : " + Arrays.toString(arr)); 
				}
			} 
        } 
   
        // swap arr[i+1] and arr[high] (or pi) 
		swap(arr, i + 1, high);
   
        return i+1; 
    } 
   
	// Sort the array partitions recursively
    void quick_sort(int arr[], int low, int high) 
	{ 
		System.out.println("QS low " + low + " high " + high);
        if (low < high) { 
            // partition the array around pi=>partitioning index and return pi
            int pi = partition(arr, low, high); 
			System.out.println("After partition " + pi);
            // sort each partition recursively 

			System.out.println("Array after partition : " + Arrays.toString(arr)); 
            quick_sort(arr, low, pi-1); 
            quick_sort(arr, pi+1, high); 
        } 
    } 
}
 
class Quicksort_Recursive_last
{
    public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements ");

		int n = sc.nextInt(); 
		int a[]=new int[n];
	
		System.out.println("Enter the elements of array ");
  
        for(int i=0;i<n;i++)
		{
			a[i] =sc.nextInt();
		}
        
		// Print the original array
        System.out.println ("Original Array: " + Arrays.toString(a));

        // Call quick_sort 
        QuickSort obj = new QuickSort(); 
        obj.quick_sort(a, 0, n-1); 

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(a)); 
    } 
}

/*
Output:
enter array size
7
enter the elements of array 
10
89
9
152
5
78
14

*/