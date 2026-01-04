/*
array List program
*/
import java.util.*;
public class arralist{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array List");
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<5; i++){
			al.add(sc.nextInt());
		}
	}
}