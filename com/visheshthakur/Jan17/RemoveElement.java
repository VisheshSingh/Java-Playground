package com.visheshthakur.Jan17;

import java.util.Arrays;

public class RemoveElement {

	public static int[] removeEl(int arr[], int ele) {
		int temp[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {// TODO: use another index
			if (arr[i] != ele) {
				temp[i] = arr[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 4, 3, 2, 6 };
		int ele = 4;
		int newArr[] = removeEl(arr, ele);
		System.out.println(Arrays.toString(newArr));

	}

}
