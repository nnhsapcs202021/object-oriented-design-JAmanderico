import java.util.Scanner;
/**
 * A FillInQuestion is constructed w/ a string that contains the answer surrounded by "_".
 *      For example, "The inventor of Java is _James Gosling_." 
 *          The questions should be displayed as: "The inventor of Java is ____."
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/*
 * The FillInQuestion class extends (i.e. is a subclass of) the Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * Do not declare instance variables for text and answer!
     * The text & answer instance variables are inherited from the question class.
     */
    
    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer.
     */
    public FillInQuestion(String question)
    {
        
    }
    
    /*
     * Use the @Override annotation when overriding a method to help the compiler verify that
     *      you arre in fact overriding and not overloading by mistake.
     */
    /**
     * This method overrides 
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();    // "The inventor of Java is " 
        String answer = parser.next();      // "James Gosling"
        question += "____________" + parser.next(); // "____________."

        /*
         * this.text = question;
         * this.answer = answer;
         * The inherited instance variables are private; they cannot be directly accessed.
         *      We must use the mutator and accessor methods.
         */
        
        
        /*
         * Use the "super" reserved word to call the setText method as defined in the 
         *      superclass (e.g. Question).
         */
        super.setText(question);
        
        /*
         * Should use "this" reserved word to call the setAnswer method. If the subclass doesn't
         *      override the method, the superclass's method will be called.
         * We don't want to use "super" in this case because if we later override setAnswer,
         *      the overriden method would not be called.
         */
        this.setAnswer(answer);
        
    }
    
    
    
    
    
    
    
    
    
    
}
