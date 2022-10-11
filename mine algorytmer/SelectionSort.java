public class SelectionSort {
    int[] sorter;
    public SelectionSort(int[] sorter){
        this.sorter = sorter;
    }

    void sorter(int[] sorter){
        int n = sorter.length;

        for(int i = 0; i < n - 1; i++){
            int lavindex = i; 
            for( int j = i + 1; j < n; j++){
                if(sorter[j] < sorter[lavindex]){
                    lavindex = j;
                }
            }
            int peker = sorter[lavindex];
            sorter[lavindex] = sorter[i];
            sorter[i] = peker;
        }
    }

    	// Prints the array
	void printArray(int arr[]){
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]){
		int arr[] = {64,25,12,22,11};
		SelectionSort ob = new SelectionSort(arr);
		ob.sorter(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
