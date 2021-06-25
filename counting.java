public class counting{

	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4,6};
		int size = arr.length;

		mergeSort(arr, size);
	}

	public static void mergeSort(int[] a, int n) {
	    if (n == 1) {
	        
	    }

	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
	 
	 	merge(a,l,r,n);

	}

	public static int merge(int[] a, int[] left, int[] right, int size){
		int mid = size/2;
		int i = 0, k = 0;
		int j = mid;
		int inversionCount = 0;
		int[] output = new int[size];

		while( i <= mid && j <= size){
			if (left[i] <= right[j]) {
				output[k++] = left[i++];
			}
			else {
				output[k++] = right[j++];
				inversionCount += (mid - i + 1);	// NOTE
			}
		}

		while (i <= mid){
			output[k++] = left[i++];
		}

		for (i = 0; i <= size; i++) {
			a[i] = output[i];
		}

		return inversionCount;

	}
	/*public static int merge(int[] arr, int[] output, int low, int mid, int high)
	{
		int k = low, i = low, j = mid + 1;
		int inversionCount = 0;

		// While there are elements in the left and right runs
		while (i <= mid && j <= high)
		{
			if (arr[i] <= arr[j]) {
				output[k++] = arr[i++];
			}
			else {
				output[k++] = arr[j++];
				inversionCount += (mid - i + 1);	// NOTE
			}
		}
 
		// Copy remaining elements
		while (i <= mid)
			output[k++] = arr[i++];

		// Don't need to copy second half

		// copy back to the original array to reflect sorted order
		for (i = low; i <= high; i++) {
			arr[i] = output[i];
		}

		return inversionCount;
	}*/
}




