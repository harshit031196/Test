import java.util.regex.*;
public class regexChecker {
	
	final static String firstNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}";
	final static String lastNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}";
	final static String emailRegex = "^([a-zA-Z0-9\\_\\-]+)([\\.|\\-]{1}[a-zA-Z0-9]+)*@([a-zA-Z0-9]+)\\.([a-zA-Z]{2,})(\\.[a-zA-Z] {2,})?$";
	final static String phoneNumberRegex = "^[0-9]{2}[\\s][1-9]{1}[0-9]{9}";
	final static String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%]*[@#$%][^@#$%]*$).{8,}$";
	
	public static boolean checker(String regex, String example) {
		Matcher matcher = Pattern.compile(regex).matcher(example);
		return matcher.matches();
	}
	
}
