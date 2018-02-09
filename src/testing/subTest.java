package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.calculatorModel;

class subTest {

	@Test
	void test() {
		calculatorModel test=new calculatorModel();
		test.sub(5, 7);;
		 double output=test.getcalcValue();
		 
		//assertEquals(-2,output);
	}
	

}
