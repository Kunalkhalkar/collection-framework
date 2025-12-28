/*1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.
*/
import java.util.*;
public class LongestSubArray{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list element");
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<5; i++){
			al.add(sc.nextInt());
		}
		
		int sum = 0, i=0, j=0, k=7,count=0;
		
		while(j < al.size()){
			if(sum <= k){
				sum += al.get(j);
				j++;
				count++;
			}
			
			if(sum > k){
				sum -= al.get(i);
				i++;
				count--;	
			}
			
		}
		System.out.println(count);
	}
}