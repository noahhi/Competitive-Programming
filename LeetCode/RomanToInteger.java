class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> values = new HashMap<Character,Integer>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        
        int total = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int val = values.get(c);
            boolean subtract = false;
            if(i+1 < s.length()){
                subtract = false;
                char next = s.charAt(i+1);
                if (c == 'I'){
                    if (next == 'V' || next == 'X'){
                        subtract = true;
                    }
                }
                else if (c == 'X'){
                    if (next == 'L' || next == 'C'){
                        subtract = true;
                    }
                } 
                else if (c == 'C'){
                    if (next == 'D' || next == 'M'){
                        subtract = true;
                    }
                }
            }
            if (subtract){
                total -= val;
            } else {
                total += val;
            }
        }
        return total;
    }
}
