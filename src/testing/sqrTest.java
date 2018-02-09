package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.calculatorModel;

class sqrTest {

	@Test
	void test() {
		calculatorModel test=new calculatorModel();
		test.sqr(-4);
		 double output=test.getcalcValue();

	}
	

}
