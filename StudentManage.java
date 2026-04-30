/*Problem: Create a Student object (id, name, marks) and sort students in ascending order of marks using natural ordering. 
*/
import java.util.*;
public class StudentManage{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		
		Student students[] = new Student[3];
		for(int i=0; i<students.length; i++){
			System.out.println("Enter the id, name, marks of student");
			int id = sc.nextInt();
			String name = sc.next();
			int marks[] = new int[3];
			for(int j =0; j< marks.length; j++){
				System.out.println("Enter the subject mark");
				marks[j] = sc.nextInt();
			}
			students[i] = new Student(id, name, marks);
		}
		Arrays.sort(students);// sorts basis on id internally calls comparable
		for(int i =0; i<students.length; i++){
			System.out.println(students[i].id);
		}
	}
}

class Student implements Comparable<Student>{
	int id;
	String name;
	int[] marks;
	
	Student(int id, String name, int ...marks){
		this.id = id; 
		this.name = name;
		this.marks = marks;
	}
	
	public int compareTo(Student other){
		return this.id - other.id;
	}
}