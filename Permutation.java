public class Permutation {
	
	/**
	 * Given two strings decide if one is permutation of the other
	 * @param strings to check
	 * @return true if string 1 is permutation of string 2
	 */
	public static boolean permutation(String s, String p) {
		
		// Assumption here is that if strings are not of the same size
		// then they cannot be permutations. And also it's case sensitive.
		if(s.length() != p.length())
			return false; 
		int length = s.length();
		char[] s_array = s.toCharArray();
		char[] p_array = p.toCharArray();
		java.util.Arrays.sort(s_array);
		java.util.Arrays.sort(p_array);
		// check if sorted arrays are the same
		return java.util.Arrays.equals(s_array, p_array);
	} 

	// simple testing
	public static void main(String[] args) {

		String a1 = "god";
		String a2 = "dog";

		String b1 = "a";
		String b2 = "b";

		String c1 = "abc";
		String c2 = "bac";

		String d1 = "Hello World!";
		String d2 = "HeWorld!llo ";

		String e1 = "fds!@";
		String e2 = "sdf@!";

		// case sensitive. return false. 
		String f1 = "Alibek";
		String f2 = "Kebila";

		String g1 = "fds!@";
		String g2 = "ssf@!";

		// case sensitive. return true. 
		String h1 = "Alibek";
		String h2 = "kebilA";

		if(permutation(a1, a2)) {
			System.out.println("Strings a1 a2 are permutations");
		}
		if(permutation(b1, b2)) {
			System.out.println("Strings b1 b2 are permutations");
		}
		if(permutation(c1, c2)) {
			System.out.println("Strings c1 c2 are permutations");
		}
		if(permutation(d1, d2)) {
			System.out.println("Strings d1 d2 are permutations");
		}
		if(permutation(e1, e2)) {
			System.out.println("Strings e1 e2 are permutations");
		}
		if(permutation(f1, f2)) {
			System.out.println("Strings f1 f2 are permutations");
		}
		if(permutation(g1, g2)) {
			System.out.println("Strings g1 g2 are permutations");
		}
		if(permutation(h1, h2)) {
			System.out.println("Strings h1 h2 are permutations");
		}
	}
}