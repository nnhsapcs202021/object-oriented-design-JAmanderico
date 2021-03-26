
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wallet
{
    private Card cardA;
    private Card cardB;
    public void Wallet(Card a, Card b)
    {
        this.cardA = a;
        this.cardB = b;
    }

    public void addCard(Card q)
    {
        if( cardA == null )
        {
            cardA = q;
        }
        else if( cardB == null )
        {
            cardB = q;
        }
        else
        {
            System.out.println("Wallet is already full.");
        }
    }

    public String toString()
    {
        return "{ " + cardA.toString() + " | " + cardB.toString() 
                + " }";
    }
}

