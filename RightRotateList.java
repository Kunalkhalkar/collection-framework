/*
Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation

*/
import java.util.*;
public class RightRotateList{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arra list Element");
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i<10; i++){
			al.add(sc.nextInt());
		}
		
		System.out.println("Enter the number to rotate arraylist to right");
		int k = sc.nextInt();
		if(k>=al.size()){
			System.out.println("K size should be less than size of array list");
		}else{
		RotateRight rr = new RotateRight();
		ArrayList<Integer> arr = rr.rotateList(al, k);
		System.out.println(arr.toString());
		}
	}
	
}
class RotateRight{
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> al){
		for(int i=0,j=al.size()-1; i < al.size()/2; i++,j--){
			Integer temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
		return al;
	}
	public ArrayList<Integer> rotateList(ArrayList<Integer> al, int k){
		ArrayList<Integer> al1= reverseArrayList(al);
		for(int i=0,j=al1.size()-k-1; i<=(al1.size()-k-1)/2; i++,j--){
			Integer temp = al1.get(i);
			al.set(i, al1.get(j));
			al.set(j, temp);
		}
		
		 for(int i=al.size()-k,j=al.size()-1; i<=((al.size()-k) + (al.size()-1))/2; i++,j--){
			 Integer temp = al1.get(i);
			al.set(i, al1.get(j));
			al.set(j, temp);
		 }
			return al1;
	}
}