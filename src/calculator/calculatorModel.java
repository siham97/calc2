package calculator;

import javax.swing.JOptionPane;

public class calculatorModel {
  private double calcValue;
  public void addtion(double first,double second) {
	  calcValue=first+second;
	  
  }

 
  
  
public void sub(double first,double second) {
	  calcValue=first-second;

	  
  }

public void div(double first,double second) {
	if(second!=0) {
	  calcValue=first/second;
	}
	 
	else {
		JOptionPane.showMessageDialog(null, " can't division over zero");

	}
	  
	
}

public void mul(double first,double second) {
	  calcValue=first*second;

	  
}

public void mod(double first,double second) {
	if(second!=0) {
	  calcValue=first%second;}
	
	 
		else {
			JOptionPane.showMessageDialog(null, " can't division over zero");

		}
		  
}

public void sqr(double first) {
	if(first>=0) {
	  calcValue=Math.sqrt(first);}
	else {
		JOptionPane.showMessageDialog(null, " invalid input");

	}

}

public void pm(double first) {
	  calcValue=first*(-1);

}
public void clear() {
	  calcValue=0.0;

}

public double getcalcValue(){
	return  calcValue;
}


}
