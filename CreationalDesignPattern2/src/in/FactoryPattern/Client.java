package in.FactoryPattern;


public class Client
{
 public static void main(String[] args)
 {
     Vehicle car = VehicleFactory.createVehicle("car");
     Vehicle bike = VehicleFactory.createVehicle("bike");
     Vehicle truck = VehicleFactory.createVehicle("truck");

     car.drive();
     bike.drive();
     truck.drive();
 }
}

