
/**
 * Write a description of class Characters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    private String name;
    private String text;
    private Room location;

    /**
     * Constructor for objects of class Characters
     */
    public Character(String name, String text)
    {
        this.name = name;
        this.text = text;
    }
    
    public String getCharacterName(){
        return name;
    }
    
    public String getCharacterText(){
        return text;
    }
}
