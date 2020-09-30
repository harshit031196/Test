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
	public static void userValidation(contactInfo a) throws userValidationException {
		if(checker(firstNameRegex,a.getFirstName())!=true)
			throw new userValidationException("Invalid first name");
		else
			System.out.println("Valid first name");
		
		if(checker(lastNameRegex,a.getLastName())!=true)
			throw new userValidationException("Invalid last name");
		else
			System.out.println("Valid last name");
		
		if(checker(emailRegex,a.getEmail())!=true)
			throw new userValidationException("Invalid email");
		else
			System.out.println("Valid email");
		
		if(checker(phoneNumberRegex,a.getPhoneNumber())!=true)
			throw new userValidationException("Invalid phone number");
		else
			System.out.println("Valid phone number");
		
		if(checker(passwordRegex,a.getPassword())!=true)
			throw new userValidationException("Invalid password");
		else
			System.out.println("Valid password");
	}
}
