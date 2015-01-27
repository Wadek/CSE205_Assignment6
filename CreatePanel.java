// Assignment #: 6
//         Name:
//    StudentID:
//      Lecture: MWF 9-950
//  Description: 


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CreatePanel extends JPanel
{     // add your instance variables including all the components used in this panel
 	  private Vector bankList;
 	  private JButton button1;
 	  private SelectPanel sPanel;
      private Label noBankAdded;
      

 	  public CreatePanel(Vector bankList, SelectPanel sPanel)
 	  {
    		this.bankList = bankList;
   			this.sPanel = sPanel;


  			 // orgranize components here
  		     noBankAdded = new Label("Please enter a Bank's name.");
             add(noBankAdded); 


             // here is an example of creating a button
 			 button1 = new JButton("Add a Bank");
    		 add(button1);






  		}//

  		private class ButtonListener implements ActionListener
  		{
  	  			public void actionPerformed(ActionEvent event)
     			{
    			                     	  
                    String inputString = input.getText();
                        printOutcome(inputString);
                            input.setText("testing this jazz ");
              
                     //when the button is pushed, the bank
    			     //should be added to the list. This is also where
    			     //errors are handled.

    			 } //end of actionPerformed method
  			} //end of ButtonListener class

} //end of CreatePanel class
