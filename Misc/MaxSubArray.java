
//Optimal Solution to maximum sub array problem 

public class KadanesAlgo {

	public static void main(String[] args) {

		int[] arr = {5, -2, 4, -1 ,3};
		System.out.print(kadane(arr));
		
	}
	
	public static int kadane(int[] arr){
		int globalMax = arr[0];
		int currMax = arr[0];       		//Keeps track of max sub array ENDING AT INDEX i
		for(int i = 1; i < arr.length; i++){
			currMax = Math.max(arr[i], currMax+arr[i]);
			if(currMax > globalMax){
				globalMax = currMax;
			}
		}
		return globalMax;
	}
}
