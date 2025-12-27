/*
Q7. Given an ArrayList and a value k, rotate the list to the clockwise by k positions:
 Example: [1,2,3,4,5], k=2 → [4,5,1,2,3]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/
import java.util.*;
public class RotateList{
	public static void main(String ...x){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element in Array List");
	ArrayList<Integer> al = new ArrayList<>();
	int k=6;
	for(int i=0; i<10; i++){
		al.add(sc.nextInt());
	}
	Reverse r = new Reverse();
	ArrayList<Integer> arr = r.rotateList(al, k);

	System.out.println(arr.toString());
	
	}
	
}
class Reverse{
	public ArrayList<Integer> reverseList(ArrayList<Integer> al){
		for(int i =0,j=al.size()-1; i<al.size()/2; i++, j--){
			Integer temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
		return al;
	}
	
	public ArrayList<Integer> rotateList(ArrayList<Integer> al, int k){
		ArrayList arrlist = reverseList(al);
		for(int i=0,j=k; i<=k/2; i++, j--){
			Integer temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
		
		for(int i=k+1,j=arrlist.size()-1; i<=(arrlist.size()+ k-1)/2; i++, j--){
			Integer temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
		return arrlist;
	}
}