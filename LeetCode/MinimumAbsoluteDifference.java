class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> bestPairs = new ArrayList<List<Integer>>();
        int minDist = arr[1] - arr[0];
        bestPairs.add(new ArrayList(Arrays.asList(arr[0],arr[1])));
        for(int i = 1; i < arr.length-1; i++){
            int dist = arr[i+1]-arr[i];
            if (dist <= minDist){
                if (dist < minDist) {
                	minDist = dist;
                	bestPairs.clear();
                }
                bestPairs.add(new ArrayList(Arrays.asList(arr[i],arr[i+1])));
            }
        }
        return bestPairs;
    }
}
