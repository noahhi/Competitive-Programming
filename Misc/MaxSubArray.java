package learning;


//Optimal Solution to maximum sub array problem. O(n)  

public class KadanesAlgo {

	public static void main(String[] args) {
		int[] arr = {5, -2, 4, -1 ,3};
		kadane(arr);
	}
	
	public static void kadane(int[] arr){
		int globalMax, globalMaxStart, globalMaxEnd, currMax, currStart;
		globalMax = currMax = arr[0];
		currStart = globalMaxStart = globalMaxEnd = 0;
		
		for(int i = 1; i < arr.length; i++){
			if(currMax + arr[i] > arr[i]){
				currMax = currMax + arr[i];
			} else {
				currStart = i; 
				currMax = arr[i];
			}
			
			if(currMax > globalMax){
				globalMax = currMax;
				globalMaxStart = currStart;
				globalMaxEnd = i; 
			}
		}
		System.out.println("Max SubArray Value : " + globalMax);
		System.out.println("Start Index : " + globalMaxStart);
		System.out.println("End Index : " + globalMaxEnd);
	}
}
