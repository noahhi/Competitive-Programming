class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x < 0){
            neg = true;
        }
        String num = String.valueOf(x);
        if(neg){
            num = num.substring(1,num.length());
        }
        char[] chars = num.toCharArray();
        StringBuilder sb = new StringBuilder(); 
        for(int i = chars.length-1; i>=0; i--){
            sb.append(chars[i]);
        }
        int result = -1;
        try{
            result = Integer.parseInt(sb.toString());
        } catch(Exception e){
            return 0;
        }
        if(neg){
            return -result;
        } else {
            return result; 
        }
    }
}
