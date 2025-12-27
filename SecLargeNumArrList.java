/*Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/
import java.util.*;
public class SecLargeNumArrList{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array");
		int a[] = new int[5];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		Vector<Integer> v = new Vector<>();
		int secMax = Integer.MIN_VALUE, max =Integer.MIN_VALUE -1;
		boolean flag = false;
		for(int i= 0; i< a.length; i++){
			if(a[i] > max){
				secMax = max;
				max = a[i];
				flag = true;
			}
			
			v.add(a[i]);
		}
		
		System.out.println(v);
		if(flag)
		System.out.println("Second max element is : "+ secMax);
		else
		System.out.println("No Second max element");
			
	}
}