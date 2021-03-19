
/**
 * Write a description of class StudentIDCard here.
 *
 * @author jamanderico
 * @version 3/
 */
public class StudentIDCard extends Card
{
    private int idNumber;
    private String name;
    public StudentIDCard(String n, int id)
    {
        super(n);
        this.name = n;
        this.idNumber = id;
    }
    
    @Override
    public String toString()
    {
        return "Card Holder: " + this.name +"\n"+ "ID Number: " + this.idNumber;
    }
}
