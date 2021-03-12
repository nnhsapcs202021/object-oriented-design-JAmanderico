
/**
 * Write a description of class ComboLock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComboLock
{
    private int num1, num2, num3, dial;
    
    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.num1 = secret1; 
        this.num2 = secret2; 
        this.num3 = secret3;
    }
    
    public void reset()
    {
        dial = 0;
    }
    
    public void turnClockwise(int ticks)
    {
        if (ticks >= 0 && ticks <= 39)
        {
            dial -= ticks;
            
            if (dial < 0)
            {
                dial = 39 + dial;
            }
        }
        System.out.println(dial);
    }
    
    public void turnCounterclockwise(int ticks)
    {
        if(ticks > 0 && ticks <= 39)    
        {
            dial += ticks;
            
            if( dial >= 40 )
            {
                int overTurn = dial - 40;
                dial = overTurn;
            }
        }
        System.out.println(dial);
    }
    
    public boolean open()
    {
        return false;
    }
}
