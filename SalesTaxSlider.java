import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


/*
This Java program takes the value of an item and displays the total with sales tax based 
on the position of a slider indicating sales tax from 0-10%
*/
public class SalesTaxSlider extends JFrame
{
   public JPanel panel;                   //Creates panel to display
   public JLabel priceLabel;              //Label to request from the user a sale price
   public JLabel taxLabel;                //Label for tax slider
   public JLabel totalLabel;              //Label for total field
   public JTextField priceTextField;      //Text field for sale price input
   public JTextField taxTextField;        //Text field for tax amount
   public JTextField totalTextField;      //Text field for total price
   public JSlider taxSlider;              //Sets slider
   public final int WINDOW_WIDTH = 350;   //Sets the Window Width
   public final int WINDOW_HEIGHT = 200;  //Sets the Window Height
 
 /*
 Constructor to create the window pane
 */
 
  public SalesTaxSlider()
    {
      //Set Window Title
      setTitle("Sales Tax Slider");
      
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
       priceLabel = new JLabel("Enter the total amount for the item.");
       taxLabel = new JLabel("Total tax amount: ");
       totalLabel = new JLabel("Total amount for item: ");
      
      //Sets up the inputs
       priceTextField = new JTextField("0.0", 10);
       priceTextField.setEditable(true);
       taxTextField = new JTextField("0.0",10);
       taxTextField.setEditable(false);
       totalTextField= new JTextField("0.0",10);
       totalTextField.setEditable(false);
     
      //create the panel for the info to sit in
       panel= new JPanel(); 
     
      //Sets up slider
       taxSlider = new JSlider(JSlider.HORIZONTAL,0 ,10,0);
       taxSlider.setMajorTickSpacing(1); //Major tick for all numbers
       taxSlider.setPaintTicks(true);    //Displays tick marks
       taxSlider.setPaintLabels(true);   //Displays numbers for each tick
       taxSlider.addChangeListener(new SliderListener());//detects change in slider
     
      //put content in panel
       panel.add(priceLabel);
       panel.add(priceTextField);
       panel.add(taxLabel);
       panel.add(taxTextField);
       panel.add(totalLabel);
       panel.add(totalTextField);
       panel.add(taxSlider);
     }
   
     private class SliderListener implements ChangeListener
     {
       public void stateChanged(ChangeEvent e)
       {    
         double price;       //collects the price 
         double tax;         //collects the tax from slider
         double correctedTax;//adjusts tax value
         double taxAmount;   //collects the tax value for display 
         double total;       //collects the total for the item
         DecimalFormat fmt = new DecimalFormat("0.0");
         
         //Math portion of event
         price=Double.parseDouble(priceTextField.getText());
         tax=taxSlider.getValue();
         correctedTax=tax*.01;
         taxAmount=price*correctedTax;
         total=price+taxAmount;
         
         // Sets the values of the text field when the slider is moved
         priceTextField.setText(Double.toString(price));
         taxTextField.setText(fmt.format(taxAmount));
         totalTextField.setText(fmt.format(total));
        } 
      }  
   public static void main (String[]args)
   {
    new SalesTaxSlider();
   }
 }