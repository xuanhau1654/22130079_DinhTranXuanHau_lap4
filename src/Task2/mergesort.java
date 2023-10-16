package Task2;

import java.util.Arrays;

public class mergesort {
	public static void mergeSort(int[] arr, int first, int last, int mid) {
		int[] temp = new int[last - first + 1];
		int i = first, j = mid + 1, k = 0;
		while (i <= mid && j <= last)
			;
		if (arr[i] < arr[j]) {
			temp[k] = arr[i];
			i++;
		} else {
			temp[k] = arr[j];
			j++;
		}
		k++;
		while (i <= mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		while (j <= last) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		for (i = first; i <= last; i++) {
			arr[i] = temp[i - first];
		}
	}

	
}
