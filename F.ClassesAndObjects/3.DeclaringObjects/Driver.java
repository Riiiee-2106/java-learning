public class Driver {


    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.addFuel(6);

        // Car startedCar = tesla.start();
        // startedCar.drive();
        tesla.start().drive();

     
    }
    


    
}
