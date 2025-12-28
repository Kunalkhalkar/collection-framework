/*4. Product of Array Except Self
Description:
Return a list output where each element is the product of all other elements. No division allowed.
Example:
Input: [1,2,3,4]
Output: [24,12,8,6]
*/
import java.util.*;
public class ProductOfArray{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array list");
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i<5; i++){
			al.add(sc.nextInt());
		}
		Multiplication m = new Multiplication();
		ArrayList<Integer> str = m.getMultiplication(al);
		System.out.println(str.toString());
			
	}
}

class Multiplication{
	public ArrayList<Integer> getMultiplication(ArrayList<Integer> al){
		ArrayList<Integer> al1 = new ArrayList<>();
		for(int i =0; i<al.size(); i++){
			Integer product =1;
			for(int j=0; j<al.size(); j++){
				Integer el = al.get(j);
				if(el != 1 && el != 0 && i != j){
					product *= el;
				}
			}
				al1.add(product);
		}
		return al1;
	} 
}