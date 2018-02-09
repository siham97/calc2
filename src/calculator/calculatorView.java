package calculator;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class calculatorView extends JFrame {
	 private JTextField textField=new JTextField(19);

	 private JButton btn7= new JButton("7");


	 private JButton btn0= new JButton("0");

	 private JButton btn8= new JButton("8");
	 private JButton btn9= new JButton("9");
	 private JButton btn6= new JButton("6");
	 private JButton btn5= new JButton("5");
	 private JButton btn4= new JButton("4");
	 private JButton btn3= new JButton("3");
	 private JButton btn2= new JButton("2");
	 private JButton btn1= new JButton("1");
	 private JButton btnclear= new JButton("c");
	 private JButton btnpm= new JButton("~");
	 private JButton btnmod= new JButton("%");
	 private JButton btnplus= new JButton("+");
	 private JButton btndiv= new JButton("/");
	 private JButton btnsub= new JButton("-");
	 private JButton btnmul= new JButton("*");
	 private JButton btnsqr= new JButton("sqr");
	 private JButton btndot= new JButton(".");
	 private JButton btnequal= new JButton("=");



calculatorView(){
	JPanel calcPanel=new JPanel();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize( 250,275);
	calcPanel.add(textField);
	
	btnclear.setFont(new Font("Tahoma", Font.BOLD, 13));
	btnclear.setBounds(66, 46, 50, 50);
	calcPanel.add(btnclear);
	btnmod.setFont(new Font("Tahoma", Font.BOLD, 13));
	btnmod.setBounds(122, 46, 50, 50);
	calcPanel.add(btnmod);
	btnsqr.setFont(new Font("Tahoma", Font.BOLD, 13));
	btnsqr.setBounds(10, 46, 50, 50);
	calcPanel.add(btnsqr);
	btnplus.setFont(new Font("Tahoma", Font.BOLD, 13));
	btnplus.setBounds(182, 46, 30, 30);
	calcPanel.add(btnplus);
	
	
	btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn7.setBounds(10, 110, 50, 50);
	calcPanel.add(btn7);
	btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn8.setBounds(66, 110, 50, 50);
	calcPanel.add(btn8);
	btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn9.setBounds(122, 110, 50, 50);
	calcPanel.add(btn9);
	btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
	btnsub.setBounds(180, 110,50, 50);
	calcPanel.add(btnsub);
	
	
	btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn4.setBounds(10, 171, 50, 50);
	calcPanel.add(btn4);
	btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn5.setBounds(66, 171, 50, 50);
	calcPanel.add(btn5);
	btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn6.setBounds(122, 171, 50, 50);
	calcPanel.add(btn6);
	
	btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
	btnmul.setBounds(180, 171, 50, 50);
	calcPanel.add(btnmul);
	
	btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn1.setBounds(10, 232, 50, 50);

	calcPanel.add(btn1);
	btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn2.setBounds(66, 232, 50, 50);
	calcPanel.add(btn2);
	btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn3.setBounds(122, 232, 50, 50);

	calcPanel.add(btn3);
	btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
	btndiv.setBounds(180, 232, 50, 50);

	calcPanel.add(btndiv);
	
	btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
	btn0.setBounds(10, 293, 50, 50);
	calcPanel.add(btn0);
	
	btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
	btndot.setBounds(66, 293, 50, 50);
	calcPanel.add(btndot);
	
	
	
	
	btnpm.setFont(new Font("Tahoma", Font.BOLD, 20));
	btnpm.setBounds(122, 293, 50, 50);

	calcPanel.add(btnpm);
	
	btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
	btnequal.setBounds(180, 293, 50, 50);

	calcPanel.add(btnequal);
	
this.add(calcPanel);
	 


	
}



public double getfirstnum() {
	
	return Double.parseDouble(textField.getText());
	
} 
public double getsecondnum() {
	return Double.parseDouble(textField.getText());

} 

public void clear() {
	textField.setText(null);
}

public void setcalcsoluiton(double solution) {
	textField.setText(Double.toString(solution));
	
	
}

public void set8() {
	String EnterNum=textField.getText()+btn8.getText();
	textField.setText(EnterNum);
}
public void set9() {
	String EnterNum=textField.getText()+btn9.getText();
	textField.setText(EnterNum);
}
public void set6() {
	String EnterNum=textField.getText()+btn6.getText();
	textField.setText(EnterNum);
}
public void set5() {
	String EnterNum=textField.getText()+btn5.getText();
	textField.setText(EnterNum);
}
public void set4() {
	String EnterNum=textField.getText()+btn4.getText();
	textField.setText(EnterNum);
}
public void set3() {
	String EnterNum=textField.getText()+btn3.getText();
	textField.setText(EnterNum);
}
public void set2() {
	String EnterNum=textField.getText()+btn2.getText();
	textField.setText(EnterNum);
}
public void set1() {
	String EnterNum=textField.getText()+btn1.getText();
	textField.setText(EnterNum);
}
public void set0() {
	String EnterNum=textField.getText()+btn0.getText();
	textField.setText(EnterNum);
}
public void setdot() {
	String EnterNum=textField.getText()+btndot.getText();
	textField.setText(EnterNum);
}

public void set7() {
	String EnterNum=textField.getText()+btn7.getText();
	textField.setText(EnterNum);
}





void adddotListener(ActionListener listenFordot) {
	btndot.addActionListener(listenFordot);
}

void addadditionListener(ActionListener listenForAddition) {
	btnplus.addActionListener(listenForAddition);
}

void addequalListener(ActionListener listenForequal) {
	btnequal.addActionListener(listenForequal);
}
void addsqrListener(ActionListener listenForequal) {
	btnsqr.addActionListener(listenForequal);
}


void addsubListener(ActionListener listenForsubtraction) {
	btnsub.addActionListener(listenForsubtraction);
}

void addmulListener(ActionListener listenFormul) {
	btnmul.addActionListener(listenFormul);
	
}


void adddivListener(ActionListener listenFordiv) {
	btndiv.addActionListener(listenFordiv);
}

void addmodListener(ActionListener listenFormod) {
	btnmod.addActionListener(listenFormod);
}
void addclearListener(ActionListener listenForclear) {
	btnclear.addActionListener(listenForclear);
}
void addpmListener(ActionListener listenForpm) {
	btnpm.addActionListener(listenForpm);
}

void  addoneListener(ActionListener listenForone) {
	btn1.addActionListener(listenForone);
}

void addtwoListener(ActionListener listenFortwo) {
	btn2.addActionListener(listenFortwo);
}
void addthreeListener(ActionListener listenForthree) {
	btn3.addActionListener(listenForthree);
}

void addfourListener(ActionListener listenForfour) {
	btn4.addActionListener(listenForfour);
}

void addfiveListener(ActionListener listenForfive) {
	btn5.addActionListener(listenForfive);
}

void addsixListener(ActionListener listenForsix) {
	btn6.addActionListener(listenForsix);
}

void addsivenListener(ActionListener listenForsiven) {
	btn7.addActionListener(listenForsiven);
}


void addeightListener(ActionListener listenForeight) {
	btn8.addActionListener(listenForeight);
}


void addnineListener(ActionListener listenFornine) {
	btn9.addActionListener(listenFornine);
}

void addzeroListener(ActionListener listenForzero) {
	btn0.addActionListener(listenForzero);
}


void displayErrorMessage(String errorMessage)
{
	
	JOptionPane.showMessageDialog(this,errorMessage);	}




}
