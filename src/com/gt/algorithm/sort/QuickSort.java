package com.gt.algorithm.sort;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 4, 8, 9, 3, 5, 12, 2, 7};
		quickSort(arr, 0, 8);
		display(arr);
	}
	 
	public static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	      
	}
	
	public static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	      return i;
	}

	public static void display(int[] data)
    {
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]);
            System.out.print(" ");
        }
    }
}
