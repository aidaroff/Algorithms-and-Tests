import java.util.Arrays;

public class UniqueString {

	/** 
	 * allUnique() is an algorithm to determine whether a given string has all unique chars
	 * @param a string to check
	 * @return true if all unique characters or null, false otherwise
	 */
	public static boolean allUnique(String s) {
		if(s == null) {
			System.out.println("String is null");
			return true;
		} 	
		int length = s.length();
		char[] s_chars = s.toCharArray();
		Arrays.sort(s_chars);
		// here char array must be sorted in similar characters
		// placed next to each other. Suffices to check the neighbor.
		for (int i = 0; i < length - 1 ; i++) {
			if(s_chars[i] == s_chars[i+1])
				return false;
		}
		return true;
	}

	// do some simple testing
	public static void main(String[] args) {
		String a = "edf";
		String b = "a";
		String c = "";
		String d = "abcdef";
		String e = "11";
		String f = "!,";
		String g = "Hello World!";
		String k = null; 

		if(allUnique(a))
			System.out.printf("String %s has all unique chars\n", a);
		if(allUnique(b))
			System.out.printf("String %s has all unique chars\n", b);
		if(allUnique(c))
			System.out.printf("String %s has all unique chars\n", c);
		if(allUnique(d))
			System.out.printf("String %s has all unique chars\n", d);
		if(allUnique(e))
			System.out.printf("String %s has all unique chars\n", e);
		if(allUnique(f))
			System.out.printf("String %s has all unique chars\n", f);
		if(allUnique(g))
			System.out.printf("String %s has all unique chars\n", g);
		if(allUnique(k))
			System.out.printf("String %s has all unique chars\n", k);
	}
}