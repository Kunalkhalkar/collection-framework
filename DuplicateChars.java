/*
Q24. Write a Java program to find duplicate characters.
Description:Print characters appearing more than once.
Input:Enter string: programming
Output:Duplicate characters: r g m
*/
import java.util.*;
public class DuplicateChars{
	public static void main(String...x){
		Scanner sc = new scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		char ch ;
		for(int i=0; i< str.length(); i++){
			ch= str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		for(Character key:hm.keySet()){
			if(hm.get(key) > 1)
		}
	}
}
