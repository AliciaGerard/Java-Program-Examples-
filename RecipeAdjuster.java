import java.util.Scanner;
import java.text.DecimalFormat;

public class RecipeAdjuster
{
   public static void main (String[]args)
   {
    double sugar=1.5;
    double butter=1;
    double flour=2.75;
    double cookies= 48;
    double recipe;
  
    double newSugar;
    double newFlour;
    double newButter;
    
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("How many cookies did you want to make?");
     recipe= keyboard.nextDouble();
     
    double adjustmentMultiplier;
     
     adjustmentMultiplier=recipe/cookies;
     newSugar=sugar*adjustmentMultiplier;
     newFlour=flour*adjustmentMultiplier;
     newButter=butter*adjustmentMultiplier;
     
      DecimalFormat df = new DecimalFormat("#.##");
      df.format(newSugar);
       df.format(newFlour);
        df.format(newButter);
        
     System.out.println("The new recipe calls for :"+newSugar+" cups of Sugar.");
     System.out.println(newFlour+" cups of flour "); 
     System.out.println(newButter+" cups of butter");
     
     }
     
     }