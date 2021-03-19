
/**
 * Write a description of class Card here.
 *
 * @author jamanderico
 * @version 3/19/21
 */
public class Card
{
    private String name;
    public Card()
    {
        name = "";
    }

    public Card(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public boolean isExpired()
    {
        return false;
    }

    public String toString()
    {
        return "Card holder: " + name;
    }
}
