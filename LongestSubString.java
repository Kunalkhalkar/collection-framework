/*
26. Longest Substring Without Repeating Characters
Description:
Return length of longest substring with all unique chars.
Example:
Input: "abcabcbb"
Output: 3

*/
import java.util.*;
public class LongestSubString{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		FindString fs = new FindString();
		int length = fs.findString(str);
		System.out.println("the longest subarray is : "+ length);
	}
}
class FindString{
	public int findString(String s){
		int i=0,j=0,maxSize=0;
		Set<Character> set = new HashSet<>();
		
		while(j<s.length()){
			char c = s.charAt(j);
			char d = s.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				j++;
				if(set.size() > maxSize){
					maxSize = set.size();
				}
			}
			else{
				set.remove(d);
				i++;
			}
		}
		return maxSize;
	}
}