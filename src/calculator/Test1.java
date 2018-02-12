package calculator;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Test1 {

	
	calculatorModel  c1=new calculatorModel();
	
	calculatorView c2=new calculatorView();
	calculatorController c3=new calculatorController(c2, c1);

	@Test
	 public void addtest() throws Exception {
		 double expexted=7.0;
		 c1.addtion(3.0,4.0);
		 double x=c1.getcalcValue();
		assertEquals(expexted,x,0);
		 
		 
	
	 }
	
	@Test
	public void notaccseptstringtest() throws Exception {
		
		
		
		try{

	            
	
			 String s="A";
				double z;
				z=Double.parseDouble(s);
				
				c1.addtion(z,4.0);
				 double x=c1.getcalcValue();
				
              assertEquals(0,x,0);

            
            
             
             

     }
      catch(NumberFormatException ex){

             

      System.out.println(ex);
		System.out.println("not accept string");


             

       }}
	
	@Test
	 public void div() throws Exception {
		
		 double expexted=0.0;
		 
		 c1.div(5.0,0.0);
		 double x=c1.getcalcValue();
		assertEquals(expexted,0,0);
		 
		 
	
	 }
	@Test
	public void sqrtest() throws Exception {
		
		 
		 c1.sqr(-16.0);
		 double x=c1.getcalcValue();
		assertEquals(0,x,0);
		 
		 
	
	 }
	
	
	
	@Test
	public void sub() throws Exception {
		
		 
		 c1.sub(6.0,2.0);
		 double x=c1.getcalcValue();
		assertEquals(4,x,0);
		 
		 
	
	 }
	
@Test
	public void mul()throws Exception {
		
		 
		 c1.mul(6.0,2.0);
		 double x=c1.getcalcValue();
		assertEquals(12.0,x,0);
		 
		 
	
	 }
	
	
	    

}