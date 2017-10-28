

public class AnagramChecker {
	public static void main(String[] args){
		System.out.print(anagram("abc", "bca"));
	}
	
	public static boolean anagram(String a, String b){
		int[] alphabet = new int[26];
		for(int i = 0; i < a.length(); i++){
			char ch = a.charAt(i);
			alphabet[ch-'a'] += 1;
		}
		for(int i = 0; i < b.length(); i++){
			char ch = b.charAt(i);
			alphabet[ch-'a'] -= 1;
		}
		for(int i : alphabet){
			if(i != 0){
				return false;
			}
		}
		return true;
	}
}
