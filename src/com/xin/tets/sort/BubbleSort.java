package com.xin.tets.sort;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int lenght = 10;
		int[] arrs = new int[lenght];
		Random ro = new Random();
		for(int i=0;i<lenght;i++){
			arrs[i] = ro.nextInt(lenght*10);
			System.out.print(arrs[i]+",");
		}
		System.out.println();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bSort(arrs);
		for(int i=0;i<arrs.length;i++){
			System.out.print(arrs[i]+",");
		}
	}
	
	public void bSort(int[] arrs){
		for(int i=0;i<arrs.length;i++){
			for(int j=arrs.length-1;j>i;j--){
				if(arrs[j]<arrs[j-1]){
					swap(arrs,j-1,j);
				}
			}
		}
	}
	
	
	public void swap(int[] arrs,int i,int j){
		
		int tmp = arrs[i];
		arrs[i] = arrs[j];
		arrs[j] = tmp;
	}
}
