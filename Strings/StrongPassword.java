package strings;
import java.util.regex.Pattern;



public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumNumber(6,"charu01"));

	}
	
	 static int minimumNumber(int n, String password) {
	        // Return the minimum number of characters to make the password strong

	    int count=0;
	    boolean hasdigit = false;
	    boolean haslc=false;
	    boolean hasup=false;
	    boolean hassc=false;

	    String specialChars="!@#$%^&*()-+";

	    for(int i=0;i<password.length();i++)
	    {
	        if(Character.isUpperCase(password.charAt(i)))
	            hasup=true;
	        
	        if(Character.isLowerCase(password.charAt(i)))
	            haslc=true;
	 
	        if(Character.isDigit(password.charAt(i)))
	            hasdigit=true;
	       
	        
	        if(specialChars.contains(Character.toString(password.charAt(i))))
	            hassc=true;
	    }

	    if(hassc==false)
	        count++;
	    if(hasup==false)
	        count++;
	    if(haslc==false)
	        count++;
	    if(hasdigit==false)
	        count++;
	    
	    if(password.length()<6)
	    {
	        int lettersneeded=6-password.length();
	        if(lettersneeded>=count)
	            return lettersneeded;
	    }


	    return count;

	   }

}
