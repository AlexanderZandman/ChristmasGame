
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
    private Item item;
    /**
     * Constructor for objects of class Characters
     */
    public Character(String name, String text, Item item)
    {
        this.name = name;
        this.text = text;
        this.item = item;
    }
    
    public String getCharacterName(){
        return name;
    }
    
    public String getCharacterText(){
        return text;
    }
    
    public Item getCharacterItem(){
        return item;
    }
}
