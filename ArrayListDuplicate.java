/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.*;
public class ArrayListDuplicate{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element in list 1");
		ArrayList al = new ArrayList();
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		System.out.println("second array list element");
		ArrayList al2 = new ArrayList();
		al2.add(sc.nextInt());
		al2.add(sc.nextInt());
		al2.add(sc.nextInt());
		al2.add(sc.nextInt());
		
		ArrayList a = new ArrayList();
		for(int i=0; i<al.size(); i++){
			if(al.contains(al2.get(i)))
			{
				continue;
			}
			else{
				a.add(al.get(i));
				a.add(al2.get(i));
			}
		}
		for(Object a1: a){
			System.out.println((int)a1);
		}
		
	}
}