/*Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
import java.util.*;
public class ArrayListVector{
	public static void main(String ..x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in Array List");
		ArrayList al = new ArrayList();
		
		for(int i=0; i<10; i++){
			al.add(sc.nextInt());
		}
		
		Iterator it = al.iterator();
		
		Vector v= new Vector();
		while(it.hasNext()){
			v.add(it.next())
		}
	}
}