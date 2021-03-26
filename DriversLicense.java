import java.util.GregorianCalendar;
/**
 * Write a description of class DriversLicense here.
 *
 * @author jamanderico
 * @version 3/17/21
 */
public class DriversLicense extends Card
{
    int exp_year;
    String name;
    /**
     * Constructor for objects of class DriversLicense
     */
    public DriversLicense(String n, int expiration)
    {
        super(n);
        this.name = n;
        this.exp_year = expiration;
    }
    
    @Override
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        
        if( this.exp_year >= calendar.get(GregorianCalendar.YEAR) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nExpiration Year" + this.exp_year;
    }
}




