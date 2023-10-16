import java.util.Arrays;

public class ALGORITHMS {
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void insertionSort(int[] arr) {
		int j, k;
		for (int i = 0; i < arr.length; ++i) {
			k = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > k) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = k;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 4, 78, 2, 1 };
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
