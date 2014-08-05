package com.gt.algorithm.sort;

public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		shellSort(arr);
		Util util = new Util();
		util.printArray(arr);
	}
	
		public static void	shellSort(){
			int a[]={1,54,6,3,78,34,12,45,56,100};
			double d1=a.length;
			int temp=0;
			while(true){
				d1= d1/2;//Math.ceil(d1/2);
				int d=(int) d1;
				for(int x=0;x<d;x++){
					for(int i=x+d;i<a.length;i+=d){
						int j=i-d;
						temp=a[i];
						for(;j>=0&&temp<a[j];j-=d){
						a[j+d]=a[j];
						}
						a[j+d]=temp;
					}
				}
				if(d==1)
					break;
			}
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
		}

	
	
	
	public static int[] shellSort(int[] arr){
		int n = arr.length;
		int d=n;
		while(true){
			d = d/2;
			for(int i=0; i<d; i++){
				for(int j=i+d; j<n; j+=d){
					int tmp = arr[j];
					int k=j-d;
					for( ; k>=0&&tmp<arr[k]; k-=d){
							arr[k+d] = arr[k];
					}
					arr[k+d] = tmp;
				}
			}
		if(d==1)
			break;
		}
		return arr;
	}

}
