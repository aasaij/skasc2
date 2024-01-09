package workshop;

public class ArrayDemo {

	public static void main(String[] args) {
//		int arr[];
//		arr = new int[10];
//		
//		int[] arr1 = new int[10];
		int arr[] = {10,20,30,40,50};
		//Reversing an array
		for (int i = 0, j = arr.length-1;i<j; i++,j--) {
			//swapping of lower bound and upper bound
			arr[i] = (arr[i] + arr[j]) - (arr[j]=arr[i]);
		}
		//printing array elements
		for (int i = 0; i<arr.length; i++)
			System.out.println(arr[i]);

	}

}
