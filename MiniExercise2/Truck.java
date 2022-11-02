//AARSH PARIMAL PATEL
//Mini Exercise-2
//Semester-2

import java.security.cert.TrustAnchor;

public class Truck extends Vehicle{

//adding our variables below
    public int NoofSeats;
    public double TrunkSpace;

    public Truck(){
    }
    public Truck(int NoOfDoors){
        this.NoOfDoors = NoOfDoors;
    }

    public Truck(char GasPowered){
        this.GasPowered = GasPowered;
    }


    public Truck(String color){
        super(color);
    }

//adding our default constructors
    public Truck(int NoOfDoors,char GasPowered){
        this.NoOfDoors = NoOfDoors;
        this.GasPowered = GasPowered;
    }

    public Truck(int NoOfDoors,char GasPowered,String color, int NoofSeats){
        this.NoOfDoors = NoOfDoors;
        this.GasPowered = GasPowered;
        this.color = color;
        this.NoofSeats = NoofSeats;
    }

    public Truck(int NoOfDoors,char GasPowered,String color, double TrunkSpace){
        this.NoOfDoors = NoOfDoors;
        this.GasPowered = GasPowered;
        this.color = color;
        this.TrunkSpace = TrunkSpace;
    }

    public Truck(int NoOfDoors,char GasPowered,String color, int NoofSeats, double TrunkSpace){
        this.NoOfDoors = NoOfDoors;
        this.GasPowered = GasPowered;
        this.color = color;
        this.NoofSeats = NoofSeats;
        this.TrunkSpace = TrunkSpace;
    }


//adding setter method

    public void setNoofSeats(int NoofSeats){
        this.NoofSeats = NoofSeats;
    }
    public void setTrunkSpace(double TrunkSpace) {
        this.TrunkSpace = TrunkSpace;
    }

//adding  getter method
    public int getNoofSeats() {
        return NoofSeats;
    }

    public double getTrunkSpace() {
        return TrunkSpace;
    }

//for using override getting outputs
    @Override
    public String toString() {
        return "TruckRecord "+ super.toString()+
                
                "TrunkSpace=" + getTrunkSpace() +
        "NoofSeats=" + getNoofSeats();
    }

    @Override
    public void isEcoFriendly(){
        if(NoOfDoors==2 && !color.equals('A') && NoofSeats<=2 && TrunkSpace==0.0 ){
            System.out.println("Vehicle is 2 doored and not fuel-powered");
        }
    }
}
//end of java file
