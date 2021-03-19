
/**
 * Write a description of class ATM_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATM_Card extends Card
{
    int cardNum;
    int pin;
    String name;
    /**
     * Constructor for objects of class ATM_Card
     */
    public ATM_Card(String n, int cardNumber, int pinNum)
    {
        super(n);
        this.name = n;
        this.cardNum = cardNumber;
        this.pin = pinNum;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nCard Number: " + this.cardNum
               + "\nPIN: " + this.pin;
    }
}




