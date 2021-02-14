
public class ReverseString {

	public static void main(String[] args) {
		
		// Reverse a String-->There is no reverse function in a string class.
		
		// Diff b/w String and StringBuffer ? --> String is immutable and stringbuffer is mutable
		//    -- in string class is we dont have any reverse function
		//    stringbuffer we have the reverse function
		
		// do we have reverse function in string? -->No
		//   because string is immutable Object
		
		
		String s = "Hello";
		//1.using For loop.
		int len = s.length();
		String rev = " ";
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		  System.out.println(rev);
         
		  //2.using StringBuffer.
		  StringBuffer sf = new StringBuffer(s);
		  System.out.println(sf.reverse());
	}

}
