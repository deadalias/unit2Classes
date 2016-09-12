
/**
 * This class models a car that can be driven and consumes fuel.
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
     * @param   efficiency  the fuel efficiency, in miles per gallon, of this new car
     */
    public Car( double fuelEfficiency )
    {
        fuelEfficiency = fuelEfficiency;
    }

    /**
     * Drives this car the specified distance, consuming fuel
     * 
     * @param  distance   the distance, in miles, this car drives
     */
    public void drive( double distance )
    {
        this.fuelInTank = this.fuelInTank - ( distance / this.fuelEfficiency );
    }
    
    /**
     * Adds the specified amount of fuel to this car's tank
     *
     * @param  amount   the amount of fuel, in gallons, to add to this car's tank
     */
    public void addGas( double amount )
    {
        this.fuelInTank = this.fuelInTank + amount; 
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


    
}
