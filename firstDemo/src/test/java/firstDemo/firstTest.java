package firstDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class firstTest {
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("before each test");
	}
	@BeforeAll
	public void beforeAllTests() {
		System.out.println("starting here");
	}
	
	
	@Test 
	public void printNameTest() {
		String name = "";
		name = "Greg";
		Assertions.assertEquals("Greg", name);
	}
	
	@Test
	public void timesTest() {
		int num1 = 5;
		int num2 = 10;
		int result;
		result = num1 * num2;
		Assertions.assertTrue(result == 50);
	}
	
	@Test
	public void stringTest() {
		String string1 = "hello";
		String string2 = " world";
		String stringRes = string1 + string2;
		Assertions.assertTrue(stringRes.equals("hello world"));
//		Assertions.assertEquals("hello world", stringRes);
	}
	
	@Test
	public void modulusTest() {
		int int1 = 15;
		int int2 = 4;
		int modRes = int1 % int2;
		Assertions.assertEquals(3, modRes);
	}
		
	@Test
	public void bananaTest() {
		String fruit1 = "banana";
		String fruit2 = "mango";
		Assertions.assertTrue(fruit1 != fruit2);
				
	}
	
	public static String evenTest(int testNum) {
		if (testNum % 2 == 0) {
			return "EVEN";
		}
		else {
			return "ODD";		
		}
	}
	
	@Test
	public void evenoddTest() {
		Assertions.assertTrue(firstTest.evenTest(6) == "EVEN");
	}
	
}
