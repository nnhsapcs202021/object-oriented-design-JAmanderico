
/**
 * Write a description of class DriversLicense here.
 *
 * @author jamanderico
 * @version 3/17/21
 */
public class DriversLicense extends Card
{
    String exp_date;
    String name;
    /**
     * Constructor for objects of class DriversLicense
     */
    public DriversLicense(String n, String expiration)
    {
        super(n);
        this.name = n;
        this.exp_date = expiration;
    }
    
    @Override
    public String toString()
    {
        return "Card holder: " + this.name;
    }
}
