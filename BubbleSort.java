public class BubbleSort implements SortingAlgorithm {

	public void sort(int [] a){
		int temp;
		boolean sorted;
		for (int i = 0; i < a.length - 1; i++){
			sorted = true;
			for (int j = 0; j < a.length - i - 1; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					sorted = false;
				}
			}
			if (sorted == true){
				break;
			}
		}
	}
}