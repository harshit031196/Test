import java.util.regex.*;
public class regexExample {

	public static void main(String[] args) {
		// UC1
		final String exp1 = "^[A-Z]{1}[a-zA-Z]{2,}";
		final String input1 = "arH";
		Pattern pattern = Pattern.compile(exp1);
		Matcher matcher = pattern.matcher(input1);
		System.out.println("Input String matches regex - "+matcher.matches());
		
		// UC2
		final String exp2 = "^[A-Z]{1}[a-zA-Z]{2,}";
		final String input2 = "arH";
		Pattern pattern2 = Pattern.compile(exp2);
		Matcher matcher2 = pattern2.matcher(input2);
		System.out.println("Input String matches regex - "+matcher2.matches());
		
		//UC3 - Email Verification
		final String exp3 = "^([a-zA-Z0-9\\_\\-]+)([\\.|\\-]{1}[a-zA-Z0-9]+)*@([a-zA-Z0-9]+)\\.([a-zA-Z]{2,})(\\.[a-zA-Z] {2,})?$";
		final String input3 = "ab_-.c123@gmail.com";
		Pattern pattern3 = Pattern.compile(exp3);
		Matcher matcher3 = pattern3.matcher(input3);
		System.out.println("Input String matches regex - "+matcher3.matches());
		
		
		//UC4 - Mobile Number Verification
		final String exp4 = "^[0-9]{2}[\\s][1-9]{1}[0-9]{9}";
		final String input4 = "91 7905664254";
		Pattern pattern4 = Pattern.compile(exp4);
		Matcher matcher4 = pattern4.matcher(input4);
		System.out.println("Input String matches regex - "+matcher4.matches());
		
		
		
		//UC5 - Password Verification
		final String exp5 = "(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%]*[@#$%][^@#$%]*$).{8,}$";
		final String input5 = "Harshit9@@";
		Pattern pattern5 = Pattern.compile(exp5);
		Matcher matcher5 = pattern5.matcher(input5);
		System.out.println("Input String matches regex - "+matcher5.matches());
	}

}
