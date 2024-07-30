package in.FactoryPattern;


class VehicleFactory 
{
	public static Vehicle createVehicle(String type)
	{
		switch (type.toLowerCase())
		{
         	case "car":
         		return new Car();
         	case "bike":
         		return new Bike();
         	case "truck":
         		return new Truck();
         	default:
         		throw new IllegalArgumentException("Invalid vehicle type: " + type);
     }
 }
}
