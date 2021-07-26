import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUser {
	public static void main(String[] args) {
		
		
		String regex_for_name = "^[a-zA-Z]{0,6}";
		String regex_for_LastName =  "^[a-zA-Z]{0,10}";
		
		Pattern pattern = Pattern.compile(regex_for_name);
		Matcher matcher = pattern.matcher("Ishu");
		
		Pattern pattern1 = Pattern.compile(regex_for_LastName);
		Matcher matcher1 = pattern1.matcher("Singh");
		
		System.out.println("FirstName Valid : " +matcher.matches());
		System.out.println("LastName Valid : " +matcher1.matches());
		
		
		}
	}
