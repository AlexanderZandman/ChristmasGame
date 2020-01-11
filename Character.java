
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
    private String question;
    private Integer answer;
    /**
     * Constructor for objects of class Characters
     */
    public Character(String name, String text, Item item)
    {
        this.name = name;
        this.text = text;
        this.item = item;
        String question = null;
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
    
    public void setCharacterQuestion(String question,Integer answer){
        this.question = question;
        this.answer = answer;
    }
    
    public String getCharacterQuestion(){
        if (question != null){
            return question;
            }
        else{
            return null;
        }
    }
    
    public Integer getCharacterAnswer(){
        if (answer != null){
            return answer;
            }
        else{
            return null;
        }
    }
}
