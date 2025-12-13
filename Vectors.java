/*Q2. Create a Vector of integers.
Store 10 numbers and count how many numbers are greater than 50.
Iteration
Logical comparison: num > 50
Counter concept


Explanation
Use a counter that increases each time the number is greater than 50.*/
import java.util.*;

public class Vectors{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		for(int i = 0; i<10; i++){
			System.out.println("Enter the elemenet in vector");
			int num = sc.nextInt();
			v.add(num);
		}
		
		for(Object o:v){
			if((int)o > 50){ // we have to type cast the 'o' beacuase it is the object type by dafault
				System.out.print(o +"\t");
			}
		}
	}
}