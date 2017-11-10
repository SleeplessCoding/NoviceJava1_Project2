/**
 * Introduction to Java Programming I(IT151)
 * Professor Dr. Mazen Alkhatib
 * Individual Project 2
 */

/**
 * @author Nicholas Weinold
 * 4/16/2016
 */

import javax.swing.JOptionPane;

 class car{ // Creating our assignment class outside of our main class to set up out three attributes for get/set methods within main class 
    
    String color;  //Here are the three attributes Color of car, amount of seats, engine liters (power)
    int seats;
    double liters;
    
    void colorSet(String colorSelect){  //Creating mutator method for color for user color selection
        color = colorSelect;
    }
    
    void seatsSet(int seatsAmount){  //Creating mutator method for user seats amount selection
        seats = seatsAmount;
    }
    
     void litersSet(double litersSelect){ //Creating mutator method for user liter amount selection
        liters = litersSelect;
    }
     
     String colorGet(){ //creating accessor method to get the color from the stored data
         return color;
     }
     
     int seatsGet(){   //creating accessor method to get the seats from the stored data
         return seats;
     }
     
     double litersGet(){   //creating accessor method to get the liters from the stored data
         return liters;
     }
     
     car(String colorInit, int seatsInit, double litersInit){//Creating the constructor with parameters we create the objects and then we will assign the attributes
         color = colorInit;
         seats = seatsInit;
         liters = litersInit;        
} 
     
}//class creation complete we can now use it in our program

public class IndividualProject2 { //main class creation as a public to other classes in the program with the name IndividualProject2

   
    public static void main(String[] args) { 
        
        String colorInit; //we create our varibales to get our input from the user for message prompts
        int seatsInit;
        double litersInit;
        
        String colorSelect;
        int seatsSelect;
        double litersSelect;
        
        //again we use JOptionPane input dialog boxes
        colorInit = JOptionPane.showInputDialog("What color do you want your car? \n - Red \n - Blue \n - Grey \n - Black \n - White"); //we ask the user what color they want, we then store the response
        seatsInit = Integer.parseInt(JOptionPane.showInputDialog("How many seats would you like? \n - 2   (Two-seater) (coupe) \n - 4   (4 seat sedan)  \n - 5   (added middle seat sedan)")); //we ask the user what seat option they want
        litersInit = Double.parseDouble(JOptionPane.showInputDialog("Your liter option? \n  1.6 \n 2.0 \n 3.0")); //we ask the user which liter option they want
        
        car car1 = new car(colorInit, seatsInit, litersInit); // creating the object car1 using the car object which belongs to the car class 
        
      
        
        System.out.println("Car color = "+ car1.colorGet()); // Now we use getters that we created earlier to display the stored user inputs
        System.out.println("Car Seats = "+ car1.seatsGet());
        System.out.println("Car Liters = "+ car1.litersGet());
        
        
        // We could use a confirmation dialog her with a YES_NO Option and then if else the setter section below so that if the user
        // says NO the order is wrong then the program runs the change input section (setters/mutators) else if YES program ends with a thank you confirmation.
        
        //We use JOptionPane to use our setters to change the users initial selections
        colorSelect = JOptionPane.showInputDialog("Change color to? \n - Red \n - Blue \n - Grey \n - Black \n - White"); //we ask the user what new/changed color they want, we then store the new responses
        seatsSelect = Integer.parseInt(JOptionPane.showInputDialog("Change your seats to? \n - 2   (Two-seater) (coupe) \n - 4   (4 seat sedan)  \n - 5   (added middle seat sedan)")); //we ask the user what new/changed seat option they want
        litersSelect = Double.parseDouble(JOptionPane.showInputDialog("Change your seats to? \n  1.6 \n 2.0 \n 3.0")); //we ask the user which new/changed liter option they want
        
        
        
        car1.colorSet(colorSelect); //we use our car class mutator methods to set the new inputs
        car1.seatsSet(seatsSelect);
        car1.litersSet(litersSelect);
        
        System.out.println ("Your new selections are:");
        System.out.println("Car color = "+ car1.colorGet()); // Now we use getters again to display the newly changed user inputs
        System.out.println("Car Seats = "+ car1.seatsGet());
        System.out.println("Car Liters = "+ car1.litersGet());
        
    }
    
}
