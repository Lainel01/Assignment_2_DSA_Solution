package com.greatlearning.Stockers.driver;

public class BinarySearchImplementation {
	public void searchValue(double[] priceArray, double key) {
		int first = 0;
		int last = priceArray.length - 1;
		int mid = first + (last - first) / 2;

		while (first <= last) {

			if (key < priceArray[mid]) {
				last = mid - 1;
			} else if (key > priceArray[mid]) {
				first = mid + 1;

			} else {
				System.out.println("Stock of value " + key + " is present ");
				break;
			}
			mid = first + (last - first) / 2;
		}

		if (first > last) {
			System.out.println("Value not found");
		}
	}


}
