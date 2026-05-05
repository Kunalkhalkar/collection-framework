/*
Problem: Sort Student objects alphabetically by name using a custom comparator. Example: Input: [Rahul, Amit, Neha] Output: [Amit, Neha, Rahul] 
*/
import java.util.*;
public class SortByName{
	public static void main(String...x){
	Scanner sc = new Scanner(System.in);
		int id ;
		String name;
		int[] marks;
		
		Student students[] = new Student[3];// array of objects		
		for(int i = 0; i<students.length; i++){
			
			System.out.println("Enter the id, name and marks of student");
			id =sc.nextInt();
			name = sc.next();
			marks = new int[3];
			
			for(int j=0; j< marks.length; j++)
			{
				marks[j] = sc.nextInt(); // inserting the data into the array
			}
			
			students[i] = new Student(id,name, marks);
		}
		Arrays.sort(students, new SortByname());
		
		for(int i =0; i< students.length; i++){
			System.out.println(students[i].id +" \t"+students[i].name);
		}
	}
}

class Student{ //student class to store data
	int id;
	String name; 
	int[] marks;
	
	Student(int id, String name,int ...marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}
class SortByname implements Comparator<Student>{ //using comparator sorting
	public int compare(Student s1, Student s2){
		return s1.name.compareTo(s2.name);
	}
}