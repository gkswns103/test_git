package ex1_single_array;

public class Ex5_array {
	static int arr[] = {4,13,7,19,1,15};		
	public static void main(String[] args) {
		
		sort(arr,arr.length);
	
	}
		
		/*
		int max =0;
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] > max ) {
				max = arr[i];
			}
			
		}
		System.out.printf("가장 큰값 : %d\n",max);
		clan(arr,arr.length);
		*/
	
	
	public static void sort(int arr2[],int size){
		int bet=0;
		for(int i =0; i < size; i++) {
			for(int j =i; j < size; j++) {
				if(arr2[i] > arr2[j]) {
					bet = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = bet;
				}
			}
			System.out.print(arr2[i] + " ");
		}
	}
}