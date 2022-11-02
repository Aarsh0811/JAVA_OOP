//AARSH PARIMAL PATEL
//Mini Exercise-2
//Semester-2

import javax.swing.text.StyledEditorKit.BoldAction;

public class Vehicle {

//    setting up our variables
    public int NoOfDoors = 4;
    public char GasPowered = 'A';
    public String color = "Black";


    public Vehicle(){
    }

    public Vehicle(int NoOfDoors){
        setNoOfDoors(NoOfDoors);
    }

    public Vehicle(char GasPowered){
        setGasPowered(GasPowered);
    }

    public Vehicle(String color){
        setColor(color);
    }
    
    public Vehicle(int NoOfDoors,char GasPowered){
        setNoOfDoors(NoOfDoors);
        setGasPowered(GasPowered);
    }


    // Using the getter method
    public int getNoOfDoors() {
        return NoOfDoors;
    }

    public char getGasPowered() {
        return GasPowered;
    }

    public String getColor() {
        return color;
    }



    //Using the setter method
    public void setNoOfDoors(int NoOfDoors){
        this.NoOfDoors = NoOfDoors;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setGasPowered(char GasPowered){
        this.GasPowered = GasPowered;
    }



//using override for getting our outputs
    @Override
    public String toString() {
        return "VehicleRecord: " +
                "Number of doors = " + getNoOfDoors() +

                "Color = " + getColor() +
        "Gas-Powered = " + getGasPowered() ;
        }


    //for getting our outputs
    public void isEcoFriendly(){
        if(NoOfDoors==2 && !color.equals('A')){
            System.out.println("Vehicle is 2 doored and not fuel-powered");
        }
    }
}
//end of java file
