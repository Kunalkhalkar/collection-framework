/*checking edge conditions*/
public class demo{
	public static void main(String x[]){
		int a = 'a';
		int b = 'b';
		System.out.println(a+b+5+'a'+"a");
		
		/*on first step int a + int b = 195, 195+5 =200, 200+97=297, 297+"a" = 297a*/
		
		// a = 'd';// taking ascii value of d in a
		// for(int i =a; i>0; i--){// if i take '0' it will considered the ascii value of 0 "zero"
			// System.out.println(i);// prints the value 100 to 1
		// }
		
		// a='d';
		// Integer z = null;// we can assign the null to the Integer why? Since Integer is an object, it can reference no object (i.e., null).
		// for(int i =a; i> z; i--){// runtime exception occurs "nullPointerException"
			// System.out.println(i);// prints the value 100 to 1
		// }
		
		char e = 'a';
		char y = 'z';
		char charactor = 'A';
		String str = charactor >= e && charactor <= y ? "Lower Case" : "Upper Case";
		System.out.println(str);
	}
}