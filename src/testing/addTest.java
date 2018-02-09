package testing;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.calculatorModel;

class addTest {

	@Test
	void test() {
		calculatorModel test=new calculatorModel();
		test.addtion(5, 7);;
		 double output=test.getcalcValue();
		assertEquals(12,output);
	}

}
