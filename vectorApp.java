/*Q1. Write a Java program to store 5 integers in a Vector.
 Print only the even numbers using a loop.
Vector creation
Adding elements
Logical condition: num % 2 == 0


Explanation
Even numbers are divisible by 2, so we check each number using modulus operator.

*/
import java.util.*;
public class vectorApp{
	public static void main(String x[]){
		Vector v = new Vector();
		
		for(int i= 0; i<5; i++){
			v.add(i);
		}
		
		for(int i =0; i<v.size(); i++){
			int num =(int) v.get(i);
			if(num % 2 == 0){
				System.out.print(v.get(i) + "\t");
			}
		}
	}
}

