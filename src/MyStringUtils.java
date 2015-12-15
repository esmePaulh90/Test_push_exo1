
public class MyStringUtils {
	public static boolean isNullOrEmpty(String s) {
		if(s == null || s.isEmpty()  )
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String s = "test";
		String s1 = ""; 
		String s2 = null;
		
		System.out.println(isNullOrEmpty(s1)); 
		System.out.println(isNullOrEmpty(s));
		System.out.println(isNullOrEmpty(s2));
	}
}
