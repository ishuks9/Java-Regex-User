import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUser {
	public static void main(String[] args) {
		
		
		String regex_for_name = "^[a-zA-Z]{0,6}";
		String regex_for_LastName =  "^[a-zA-Z]{0,10}";
		String regex_for_Email = "^[a-zA-Z0-9+.-]+@[a-zA-Z0-9.]+$" ;
		String regex_for_mobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";
		String regex_for_Password = "[A-Za-z0-9@_#$%!]{8,}";
		
		Pattern pattern = Pattern.compile(regex_for_name);
		Matcher matcher = pattern.matcher("Ishu");
		
		Pattern pattern1 = Pattern.compile(regex_for_LastName);
		Matcher matcher1 = pattern1.matcher("Singh");
		
		Pattern pattern2 = Pattern.compile(regex_for_Email);
		Matcher matcher2 = pattern2.matcher("ishuks9@gmail.com");
		
		Pattern pattern3 = Pattern.compile(regex_for_mobileNumber);
		Matcher matcher3 = pattern3.matcher("91 9346779142");
		
		Pattern pattern4 = Pattern.compile(regex_for_Password);
		Matcher matcher4 = pattern4.matcher("IAHyew#@94");
		
		System.out.println("FirstName Valid : " +matcher.matches());
		System.out.println("LastName Valid : " +matcher1.matches());
		System.out.println("Email Valid : " +matcher2.matches());
		System.out.println("Mobile number is Valid : "+matcher3.matches());
		System.out.println("Password Valid : " +matcher4.matches());
		
		
		
		}
	}
