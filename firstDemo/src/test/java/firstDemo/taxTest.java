package firstDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import firstDemo.com.qa.main.Taxes;

public class taxTest {
	firstDemo.com.qa.main.Taxes taxes = new Taxes();
	@Test	
	public void percTaxTest() {
		int salary = 26000;
		int result = taxes.percTax(salary);
		Assertions.assertTrue(result == 15);
	}
	

}
