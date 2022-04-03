package com.greatlearning.Stockers.driver;

public class MergeSortImplementation {
	void merge(double[] arr, int first, int mid, int last) {		
		int n1 = mid - first + 1;
		int n2 = last - mid;

		double[] firstArray = new double[n1];
		double[] lastArray = new double[n2];

		for (int i = 0; i < n1; ++i)
			firstArray[i] = arr[first + i];
		for (int j = 0; j < n2; ++j)
			lastArray[j] = arr[mid + 1 + j];

		int i = 0;
		int j = 0;

		int k = first;
		while (i < n1 && j < n2) {
			if (firstArray[i] <= lastArray[j]) {
				arr[k] = firstArray[i];
				i++;
			} else {
				arr[k] = lastArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = firstArray[i];
			i++;
			k++;
		}

			arr[k] = lastArray[j];
			j++;
			k++;
		}

	public void sort(double[] arr, int first, int last) {
		if (first < last) {

			int mid = (first + last) / 2;

			sort(arr, first, mid);
			sort(arr, mid + 1, last);
			merge(arr, first, mid, last);
		}
	}

}
