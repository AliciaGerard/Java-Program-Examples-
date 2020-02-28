import javax.swing.*;
import java.awt.event.*;

/*
This class should take a user input for the amount of sales in a given month
and report the state sales tax, country sales tax and a combined total of the 
two values.
*/

public class SalesTaxCalculator extends JFrame
 {
   public JPanel panel;                         //Sets the panel
   public JLabel salesLabel;                    //Sets the label to request for sales amount
   public JTextField salesTextField;            //Sets the Text Field for sales input
   public JButton calcButton;                   //Sets Calculate Button
   public final int WINDOW_WIDTH = 300;         //Sets the Window Width
   public final int WINDOW_HEIGHT = 150;        //Sets the Windo Height
   public final double COUNTRY_SALES_TAX = .02; //Sets the Country Sales tax 
   public final double STATE_SALES_TAX = .04;   //Sets the State Sales tax
   
   
   /*
   Constructor class for SalesTaxCalculator
   */
   public SalesTaxCalculator()
    {
      //Set Window Title
      setTitle("Sales Tax Calculator");
      
      // Set the window size
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      
      //Set close button event
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      //Panel Set up
      buildPanel();
      add(panel);
      setVisible(true);
    }
    
    
     public void buildPanel()
   {
     //Creates the labels
     salesLabel = new JLabel("Enter the total amount of monthly sales");
     
     //Sets up the inputs
     salesTextField = new JTextField(20);
     
     //calculate button
     calcButton =  new JButton("Calculate");
     
     //Action event listener
     calcButton.addActionListener(new calcButtonListener());
     
     //create the panel for the info to sit in
     panel= new JPanel(); 
     
     //put content in panel
     panel.add(salesLabel);
     panel.add(salesTextField);
     panel.add(calcButton);
   }
   
   /*
    calcButtonListener Private class for button action 
    */
    private class calcButtonListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      { 
        String salesInput;    //holds Sale input
        double salesAmount;   //converts to double for Sale input
        double countryTax;   //holds the total of sale amount and country tax 
        double stateTax;     //holds the total of sale amount and state tax
        double totalTax;        //holds the total of country and state tax
        
        //get the text entered by the user
        salesInput = salesTextField.getText();
       
        //convert to price
        salesAmount = Double.parseDouble(salesInput);
       
        //math conversions
        countryTax = salesAmount*COUNTRY_SALES_TAX;
        stateTax = salesAmount*STATE_SALES_TAX;
        totalTax = countryTax+stateTax;
       
        //Display the resulting conversion 
        JOptionPane.showMessageDialog(null,"The Country tax amount is : $"+ countryTax +
                                       "\n The State tax amount is : $" + stateTax +
                                       "\n The total of both taxes is : $"+totalTax);
      }
    }  
  public static void main (String[]args)
    {
      new SalesTaxCalculator();
    }
 }  