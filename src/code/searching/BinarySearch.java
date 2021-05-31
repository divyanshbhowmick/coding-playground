package code.searching;

public class BinarySearch {

	public static void main(String ar[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = binarySearch(arr, 10);
		System.out.println(index);
	}

	/**
	 * @returns int
	 * @author divyansh.bhowmick
	 */
	public static int binarySearch(int arr[], int searchElement) {
		int max = arr.length - 1, min = 0, currentIndex;
		while (min <= max) {
			System.out.println("Iteration");
			currentIndex = (min + max) / 2;
			if (searchElement == arr[currentIndex])
				return currentIndex + 1;
			else if (searchElement > arr[currentIndex])
				min = currentIndex + 1;
			else
				max = currentIndex - 1;
		}
		return -1;
	}
}
