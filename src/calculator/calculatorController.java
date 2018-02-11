package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorController {
	
	private calculatorView theView;
	private calculatorModel theModel;
	 public String operation;
		double first,second=0;


	public calculatorController(calculatorView theView,calculatorModel theModel) {
this.theView=theView;
this.theModel=theModel;
 this.theView.addadditionListener(new additionListener());
 this.theView.addsubListener(new subListener());
 this.theView.addsqrListener(new sqrListener());
this.theView.getTextField().setEditable(false);

 this.theView.addmulListener(new mulListener());
 this.theView.adddivListener(new divListener());
 this.theView.addmodListener(new modListener());
 this.theView.addclearListener(new clearListener());
 this.theView.addoneListener(new oneListener());
 this.theView.addtwoListener(new twoListener());
 this.theView.addthreeListener(new threeListener());
 this.theView.addfourListener(new fourListener());
 this.theView.addfiveListener(new fiveListener());
 this.theView.addsixListener(new sixListener());
 this.theView.addsivenListener(new sivenListener());
 this.theView.addeightListener(new eightListener());
 this.theView.addnineListener(new nineListener());
 this.theView.addzeroListener(new zeroListener());

 this.theView.addequalListener(new equalListener());

 this.theView.addpmListener(new pmListener());
 this.theView.adddotListener(new dotListener());


	}
	
	
	
	
	
	class sqrListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			theModel.sqr(theView.getfirstnum());
			theView.setcalcsoluiton(theModel.getcalcValue()); 
			
		
	}
	}
	
	
	
	class pmListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			theView.setcalcsoluiton(theView.getfirstnum()*(-1)); 
			
		
	}
	}
	
	class dotListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			theView.setdot(); 
			
		
	}
	}	
	
	
	
	
	
	
	
	
	
	
	class equalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			second=theView.getsecondnum() ;	
			 if(operation=="+") {
				 theModel.addtion(first, second);
				 theView.setcalcsoluiton(theModel.getcalcValue()); 			 }
			 
			 if(operation=="-") {
				 theModel.sub(first, second);
				 theView.setcalcsoluiton(theModel.getcalcValue()); 			 }
			 
			 if(operation=="/") {
				 theModel.div(first, second);
				 theView.setcalcsoluiton(theModel.getcalcValue()); 			 }
			 if(operation=="*") {
				 theModel.mul(first, second);
				 theView.setcalcsoluiton(theModel.getcalcValue()); 			 }
			 
			 if(operation=="sqr") {
				 theModel.sqr(theView.getfirstnum());
				 theView.setcalcsoluiton(theModel.getcalcValue()); 			 }
			 if(operation=="%") {
				 theModel.mod(first, second);
				theView.setcalcsoluiton(theModel.getcalcValue()); 
			 }
		}
		
		
	}
	
	class zeroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			theView.set0(); 
			
		
	}
	}	
		class oneListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				theView.set1(); 
				
			
		}
		}
			class twoListener implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent arg0) {
					

					theView.set2(); 
					
				
			}}
				
				class threeListener implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent arg0) {
						theView.set3(); 
						
					
				}}
					
					class fourListener implements ActionListener{

						@Override
						public void actionPerformed(ActionEvent arg0) {
							theView.set4(); 
							
						
					}
					}
						class fiveListener implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent arg0) {
								theView.set5(); 
							}		
								
							
						}
						
						class sixListener implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent arg0) {
								theView.set6(); 
								
							
						}}
						
						class sivenListener implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent arg0) {
								theView.set7();
								
							
						}}
						
						class eightListener implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent arg0) {
								theView.set8(); 
								
							
						}}
						
						
						class nineListener implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent arg0) {
								theView.set9(); 
								
							
						}}
						
	class clearListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
theView.clear();			
			
	}
	}
	
	
	
	class modListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			first=theView.getfirstnum() ;
			theView.clear();
			operation="%";
			
	}
	}
	
	
	class divListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			first=theView.getfirstnum() ;
			theView.clear();
			operation="/";
			
	}
	}
	
	class mulListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			first=theView.getfirstnum() ;
			theView.clear();
			operation="*";
			
		}
		
	}

	class subListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			first=theView.getfirstnum() ;
			theView.clear();
			operation="-";
		}
		
	}

	class additionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			first=theView.getfirstnum() ;
			theView.clear();
			operation="+";
			
			
		}}
}
