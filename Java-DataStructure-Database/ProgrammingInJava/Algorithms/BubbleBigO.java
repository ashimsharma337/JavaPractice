
public class BubbleBigO {

	public static void main(String[] args) {
		int[] unsorted = {5,3,7,8,10,2};
		unsorted = sort(unsorted);
		for(int i : unsorted) {
			System.out.print(i + " ");
		}

	}
	
	public static int[] sort(int[] arr) {
		// for as elements in the array
		for(int outer = 0; outer < arr.length; outer++) {
			// check each element and swap as needed 
			for(int inner = 1; inner < arr.length - outer; inner++) { // adding outer gives better performance
				if(arr[inner - 1] > arr[inner]) {
					//swap 
					int temp = arr[inner - 1];
					arr[inner - 1] = arr[inner];
					arr[inner] = temp;
				}
			}
		}
		return arr;
	}

}