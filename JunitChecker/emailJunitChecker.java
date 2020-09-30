import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class emailJunitChecker {
	
	private String emailID;
	private boolean expectedResult;
	
	public emailJunitChecker(String emailID, boolean expectedResult) {
		this.emailID=emailID;
		this.expectedResult=expectedResult;
	}
	@Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true },
			{"abc-100@yahoo.com", true },
			{"abc.100@yahoo.com", true },
			{"abc111@abc.com", true },
			{"abc-100@abc.net", true},
			{"abc.100@abc.com.au", true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc", false }, 
			{"abc@.com.my", false},
			{"abc123@gmail.a", false},
			{"abc123@.com", false},
			{"abc123@.com.com", false},
			{".abc@abc.com", false},
			{"abc()*@gmail.com", false},
			{"abc@%*.com", false},
			{"abc..2002@gmail.com", false},
			{"abc.@gmail.com", false},
			{"abc@abc@gmail.com", false},
			{"abc@gmail.com.1a", false},
			{"abc@gmail.com.aa.au", false},
		});
	}

	@Test
	void test() {
		assertEquals(expectedResult, regexChecker.checker(regexChecker.emailRegex, emailID));
	}

}
