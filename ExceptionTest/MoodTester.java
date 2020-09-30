import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class moodTester {

	static MoodChecker mc;
	@Before
	public void init() {
		mc = new MoodChecker();
	}
	
	@Test
	void sadMood() {
		Assertions.assertEquals("sad", mc.checkerWhenInput("I am in sad mood"));
	}
	@Test
	void noMood() {
		Assertions.assertEquals("happy", mc.checkerWhenInput("I am in any mood"));
	}
	@Test
	void moodInConstructorSad() {
		Assertions.assertEquals("sad", new MoodChecker("I am in sad mood").checker());
	}
	@Test
	void moodInConstructorHappy() {
		Assertions.assertEquals("happy", new MoodChecker("I am in happy mood").checker());
	}
	@Test
	void moodInConstructorNull() {
		Assertions.assertEquals("happy", new MoodChecker().checker());
	}
	

}
