public class Car{ //car is a class

    //properties /attributes/instance variables
    int noOfWheels;
    String Color;
    float maxSpeed;
    float currFuelInLtr;
    int noOfSeats;


    //methods/instance methods
    public void drive(){
        System.out.println("driving car");
        currFuelInLtr--;
    }

    public void addFuel(float fuel){
        currFuelInLtr +=fuel;
    }

    public float getCurrFuelLevel(){
        return currFuelInLtr;
    }

}
    