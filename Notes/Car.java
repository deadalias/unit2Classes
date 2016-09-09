
/**
 * This class models a car that can drive and consume fuel
 * 
 * @author gcschmit
 * @version 9 September 2016
 */
public class Car
{
    private double fuelEfficiency;  // measured in miles per gallon (mpg)
    private double gasInTank;   // measured in gallons

    /**
     * Constructor for objects of class Car
     * 
     * @param efficiency    the fuel efficiency of the car in miles per gallon
     */
    public Car( double efficiency )
    {
        this.fuelEfficiency = efficiency;
        this.gasInTank = 0;
    }

    /**
     * Drives the specified distance, consuming gas
     * 
     * @param  distance   the distance to drive in miles
     */
    public void drive( double distance )
    {
        double fuelBurned = distance / this.fuelEfficiency;
        this.gasInTank = this.gasInTank - fuelBurned;
    }
    
    /**
     * Adds the specified amount of fuel to this car's tank
     *
     * @param  amount   amount of fuel in gallons to add to this car's tank
     */
    public void addGas( double amount )
    {
        this.gasInTank = this.gasInTank + amount;
    }
    
    /**
     * Returns the amount of fuel left in this car's tank
     *
     * @return     the amount of fuel, in gallons, left in this car's tank
     */
    public double getGasInTank()
    {
        return this.gasInTank;
    }


}
