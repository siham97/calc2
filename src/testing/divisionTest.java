package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.calculatorModel;

class divisionTest {

	@Test
	void test() {
		calculatorModel test=new calculatorModel();
		test.div(5, 0);
		 double output=test.getcalcValue();
	}

}
