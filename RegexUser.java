import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUser {
	public static void main(String[] args) {
		
		
		String regex_for_name = "^[a-zA-Z]{0,6}";
		
		Pattern pattern = Pattern.compile(regex_for_name);
		Matcher matcher = pattern.matcher("Ishu");
		
		System.out.println("FirstName Valid : " +matcher.matches());
		
		
		}
	

}
