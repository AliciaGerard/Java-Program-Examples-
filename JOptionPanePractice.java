import javax.swing.JOptionPane;

public class JOptionPanePractice
{
 public static void main (String[]args)
 {
   
   String firstName;
   String middleName;
   String lastName;
   String inputString;
   int hours;
   double payRate;
   double grossPay;
      
   firstName= JOptionPane.showInputDialog("What is your first name?");
   middleName=JOptionPane.showInputDialog("What is your middle name?");
   lastName=JOptionPane.showInputDialog("What is your last name?");
   
   JOptionPane.showMessageDialog(null, "Hello "+firstName+" "+ middleName+" "+ lastName); 
   
   inputString = JOptionPane.showInputDialog("How many hours did you work?");
   
   hours= Integer.parseInt(inputString);
   
   inputString= JOptionPane.showInputDialog("What is your hourly pay rate?");
   
   payRate=Double.parseDouble(inputString);
   
   grossPay=hours*payRate;
   
   JOptionPane.showMessageDialog(null, "Hello " + firstName+ " your gross pay is "+grossPay); 
    
   System.exit(0); 
  }

}
  