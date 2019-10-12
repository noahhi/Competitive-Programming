class Solution {
    public int lengthOfLongestSubstring(String s) {
        int best = 0;
        int curr = 0;
        HashSet<Character> seen = new HashSet();
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (seen.contains(c)){
                curr = 1;
                i = start+1;
                start = i;
                seen.clear();
                seen.add(s.charAt(start));
            } else {
                curr++;
                if (curr > best){
                    best = curr;
                }
                seen.add(c);
            }
        }
        return best;
    }
    
    // better solution (O(n))
    public int lengthOfLongestSubstring(String s) {
        int i, j, max;
        i = j = max = 0;
        
        HashMap<Character,Integer> lastSeen = new HashMap();
        
        while(j < s.length()){
            char c = s.charAt(j);
            if (lastSeen.containsKey(c) && (lastSeen.get(c) >= i)){
                i = lastSeen.get(c)+1;
            }
            lastSeen.put(c, j);
            j++;
            if ((j-i) > max) max = j-i;
        }
        return max;
    }
}
