public class Car {
    //car is a class

    //properties /attributes/instance variables
    int noOfWheels;
    String Color;
    float maxSpeed;
    float currFuelInLtr;
    int noOfSeats;


    //methods/instance methods
    public void drive(){
        if(currFuelInLtr==0){
            System.out.println("can't drive,car is out of fuel");
        }else if(currFuelInLtr<5){
            System.out.println("car is in reserved mode");
              currFuelInLtr--;
        }else{
        System.out.println("driving car");
      currFuelInLtr--;}
      
    }

    public void addFuel(float fuel){
        currFuelInLtr +=fuel;
    }

    public float getCurrFuelLevel(){
        return currFuelInLtr;
    }



    public static void main(String[] args) {
      /*this is reference */  Car suzuki = new  Car(); /*object created which is placed in Car suzuki */

      /*Car suzuki -> mere pass ek refernce hai jo us object new Car() tak jata h */


      suzuki.drive();
      
    }
}
    
