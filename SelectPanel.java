// Assignment #: 6 
//         Name: Wade Kariniemi
//    StudentID: 1202111213 
//      Lecture: MWF 9-950 
//  Description: The Assignment 6 class creates a Tabbed Pane with
//               two tabs, one for adding Banks and one for
//               Selecting a bank, and adds it as its Applet content
//               and also sets its size.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class SelectPanel extends JPanel
{      //declare instance variables and components
       private Vector<String> bankList;
       private JList cList;

 		public SelectPanel(Vector<String> bankList)
        {
 		     this.bankList = bankList;
 		     cList = new JList(bankList);
			 cList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);





 		    // orgranize components for the panel
         }

 		//This method can refresh the appearance of the list of banks
		//by calling updateUI() method for the JList.
		//It can be called from the CreatePanel class whenever a new bank name
 	     //is added to the vector and the JList appearence needs to be refreshed.
 		public void updateBankList()
 	    {
			cList.setListData(bankList);

        }

 		private class ButtonListener implements ActionListener
 		{
 			      public void actionPerformed(ActionEvent event)
 			      {
            			//When the add button is pushed, the selected bank
           			   //should be added to the right list and the number of
                       //selected banks is incremented by 1.
                      //When the remove button is pushed, the selected bank
                      //should be removed from the right list and the number of
           			 //selected banks is decremented by 1.

            		//Be careful for the cases when no item has been selected.
                   }
        } //end of ButtonListener class

} //end of SelectPanel class
