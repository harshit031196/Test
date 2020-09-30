import java.util.Scanner;

public class userValidate {

	public static void main(String[] args) throws userValidationException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of the user");
		contactInfo a = new contactInfo();
		try {
			System.out.println("Enter the first name");
			String firstName = sc.next();
			a.setFirstName(firstName);
			
			System.out.println("Enter the last name");
			String lastName = sc.next();
			a.setLastName(lastName);
			
			System.out.println("Enter the email address");
			String email = sc.next();
			a.setEmail(email);
			
			System.out.println("Enter the phone number");
			String phoneNumber = sc.next();
			a.setPhoneNumber(phoneNumber);
			
			System.out.println("Enter the password");
			String password = sc.next();
			a.setPassword(password);
			
			regexChecker.userValidation(a);
		}catch(userValidationException e){
			System.out.println(e.getMessage());
		}
	}

}
