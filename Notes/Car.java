
/**
 * This class models a car that is driven and consumes fuel.
 * 
 * @author gcschmit
 * @version 9 September 2016
 */
public class Car
{
    private double fuelEfficiency; // in units of miles per gallon
    private double fuelInTank; // in units of gallons

    /**
     * Creates a car with the specified fuel efficiency
     * 
     * @param   efficiency  the fuel efficiency, in miles per gallon, for this car
     */
    public Car( double efficiency )
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Drives the specified distance, consuming fuel
     * 
     * @param  distance   distance, in miles, the car drives
     */
    public void drive( double distance )
    {
        this.fuelInTank = this.fuelInTank - ( distance / this.fuelEfficiency );
    }
    
    
    /**
     * Returns the amount of fuel in this car's tank
     *
     * @return     the amount of fuel, in gallons, in this car's tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
    
    /**
     * Adds the specified amount of fuel to this car's tank
     *
     * @param  amount   amount of fuel, in gallons, added to this car's tank
     */
    public void addGas( double amount )
    {
        this.fuelInTank = this.fuelInTank + amount;
    }


}
