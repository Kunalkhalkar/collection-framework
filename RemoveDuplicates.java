/*
Q6. Create a Vector with repeated integers. Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
*/
import java.util.*;
public class RemoveDuplicates{
	public static void main(String ...x){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element in vector");
		Vector<Integer> v = new Vector<>();
		Vector<Integer> v1 = new Vector<>();
		
		for(int i=0; i<10; i++){
			v.add(sc.nextInt());
		}
		for(int i = 0; i<v.size(); i++){
			if(v1.contains(v.get(i))){
				continue;
			}
			v1.add(v.get(i));
		}
		System.out.println(v1);
		System.out.println(v);
	}
}