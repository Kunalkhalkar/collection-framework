/*28. Top K Frequent Elements
Description:
Return k most frequent elements using HashMap + PriorityQueue.
Example:
Input: nums=[1,1,1,2,2,3], k=2
Output: [1,2]
*/
import java.util.*;
public class FrequentElement{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array list element");
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =0; i<5; i++){
			
			al.add(sc.nextInt());
		}
		int count = 0;
		Stack<Integer> st = new Stack<>();
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < al.size(); i++){
			if(hm.contains(al.get(i))){
				count = hm.getKey(i);
				++count;
				hm.setValue(al.get(i), count);
				
			}
		}
	}
}