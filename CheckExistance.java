/*Q4. Take a Vector and add 8 integers.
 Accept a number from the user and check if it exists in the Vector.
Searching using loop
Logical condition:
 if (vector.get(i) == searchValue)


Explanation
Compare each element with the search number.
 If matched, set a boolean flag to true.
*/
import java.util.*;
public class checkExistance{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		
		for(int i =0; i<8; i++){
			System.out.println("Enter element");
			
			v.add(sc.nextInt());
		}
		
		System.out.println("Enter the element to search");
		int key = sc.nextInt();
		for(Object o:v){
			if((int)o == key){
				System.out.println("!! key found !!");
				break;
			}
			else{
				System.out.println("searching");
			}
		}
	}
}