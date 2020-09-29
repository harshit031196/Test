import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class junitTester {

	@Test
	void testFirstName() {
		boolean answer = regexChecker.checker(regexChecker.firstNameRegex, "Harshit");
		assertEquals(true,answer);
	}
	
	@Test
	void testFirstNameSad() {
		boolean answer = regexChecker.checker(regexChecker.firstNameRegex, "shit");
		assertEquals(false,answer);
	}
	
	@Test
	void testLastName() {
		boolean answer = regexChecker.checker(regexChecker.lastNameRegex, "Gupta");
		assertEquals(true,answer);
	}
	
	@Test
	void testLastNameSad() {
		boolean answer = regexChecker.checker(regexChecker.lastNameRegex, "G");
		assertEquals(false,answer);
	}
	
	@Test
	void testEmail() {
		boolean answer = regexChecker.checker(regexChecker.emailRegex, "guptaharshit@gmail.com");
		assertEquals(true,answer);
	}
	
	@Test
	void testEmailSad() {
		boolean answer = regexChecker.checker(regexChecker.emailRegex, "gupta....harshit0311@gmail.com");
		assertEquals(false,answer);
	}
	
	@Test
	void testPhoneNumber() {
		boolean answer = regexChecker.checker(regexChecker.phoneNumberRegex, "91 7905664254");
		assertEquals(true,answer);
	}
	
	@Test
	void testPhoneNumberSad() {
		boolean answer = regexChecker.checker(regexChecker.phoneNumberRegex, "91-7905664254");
		assertEquals(false,answer);
	}
	
	@Test
	void testPassword() {
		boolean answer = regexChecker.checker(regexChecker.passwordRegex, "harshitG@123");
		assertEquals(true,answer);
	}
	
	@Test
	void testPasswordSad() {
		boolean answer = regexChecker.checker(regexChecker.passwordRegex, "hars");
		assertEquals(false,answer);
	}
}
