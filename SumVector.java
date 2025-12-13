/*Q3. Store any 7 integers in a Vector.
 Calculate and print the sum of all elements.
Addition operation
Looping through Vector


Explanation
Keep a variable sum initially 0, then add each element.
*/

import java.util.*;

public class SumVector{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		for(int i =0; i<7; i++){
			System.out.println("Eneter element");
			v.add(sc.nextInt());
		}
		int add =0;
		for(Object e :v){
			add +=(int)e;
		}
		
		System.out.println("Addition of all element is : "+ add);
	}
	
}