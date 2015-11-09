package com.xin.tets.sort;

import java.util.Random;

public class Quitsort {
	public static void main(String[]  args){
		int lenght = 10000;
		int[] arrs = new int[lenght];
		Random ro = new Random();
		for(int i=0;i<lenght;i++){
			arrs[i] = ro.nextInt(lenght*10);
			System.out.print(arrs[i]+",");
		}
		System.out.println();
		int left = 0;
		int right = arrs.length - 1;
		Quitsort q = new Quitsort();
		q.recuserice(arrs, left, right);
		for(int i=0;i<lenght;i++){
			System.out.print(arrs[i]+",");
		}
	}


	public void recuserice(int[] arrs, int left,int right){
	
		if(left < right){
			int index = quitSort(arrs,left,right);
			recuserice(arrs,left,index-1);
			recuserice(arrs,index+1,right);
		}

	}
	
	
	public int quitSort(int[] arrs ,int left, int right){
		int temp = arrs[left];
		while(left<right){
			while(left<right&&arrs[right]>=temp){
				right--;
			}
			arrs[left] = arrs[right];
			
			while(left<right&&arrs[left]<=temp){
				left++;
			}
			arrs[right] = arrs[left];
			
		}
		arrs[left] = temp;
		return left;
	}
}


