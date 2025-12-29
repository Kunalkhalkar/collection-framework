/*10. Rotate Array by K Steps
Description:
Rotate the list right by k positions.
Example:
Input: nums=[1,2,3,4,5], k=2
Output: [4,5,1,2,3]
*/
import java.util.*;
public class RotateList2{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list element");
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<5; i++){
			al.add(sc.nextInt());
		}
		
		System.out.println("Enter the size from rotate list");
		int k = sc.nextInt();
		
		RotateList rl = new RotateList();
		
		ArrayList<Integer> al1 = rl.rotateList(al, k);
		System.out.println(al1.toString());
	}
}
class RotateList{
	public ArrayList<Integer> revArrayList(ArrayList<Integer> al){
		for(int i=0, j=al.size()-1; i<al.size()/2; i++,j--){
			Integer temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
		return al;
	}
	
	public ArrayList<Integer> rotateList(ArrayList<Integer> al, int k){
		ArrayList<Integer> alr = revArrayList(al);
		for(int i= 0,j=k-1; i< (alr.size()-k)/2; i++,j--){
			Integer temp = alr.get(i);
			alr.set(i, alr.get(j));
			alr.set(j, temp);
		}
		for(int i=k, j= alr.size()-1; i< (alr.size() + k)/2; i++,j--){
			Integer temp = alr.get(i);
			alr.set(i, alr.get(j));
			alr.set(j, temp);
		}
		return alr;
	}
}