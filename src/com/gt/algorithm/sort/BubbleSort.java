package com.gt.algorithm.sort;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,6,7,3,5,1};
		bubbleSort(arr);
	}

	public static int[] bubbleSort(int[] arr){
		boolean flag = true;
		int n = arr.length;
		while(flag){
			for(int i=1; i<n; i++){
				if(arr[i-1] > arr[i]){
					int tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
				}
			}
			n--;
			if(n==1){
				flag=false;
			}
		}
		return arr;
	}
}
