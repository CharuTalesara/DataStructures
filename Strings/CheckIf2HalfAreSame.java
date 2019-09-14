package strings;
/*
 * Given a string of lowercase characters only, the task is to check if it is possible 
 * to split a string from the middle which will give two halves having the same characters 
 * and same frequency of each character. If the length 
 * of the given string is ODD then ignore the middle element and check for the rest.
 */

public class CheckIf2HalfAreSame {

	public static void main(String[] args) {
		System.out.println(ifSame("abbaab"));// abccab abbaab
	}

	public static boolean ifSame(String s) {
		int n = s.length();

		int[] c1 = new int[26];
		int[] c2 = new int[26];

		for (int i = 0, j = n - 1; i <=n / 2 && j >= n / 2; i++, j--) 
		{
			char ca = s.charAt(i);
			c1[ca - 97] = c1[ca - 97] + 1;
			
			char cb = s.charAt(j);
			c2[cb - 97] = c2[cb - 97] + 1;
		}

		
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				return false;
		}

		return true;
	}

}
