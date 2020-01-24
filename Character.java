
/**
 * This class contains all the information for creating a character in this game
 * @param name - the character name
 * @param text - the text the character can output
 * @param location - where the character resides
 * @param item - what item the character holds
 * @param question - the question that the character can ask
 * @param answer - the answer to the question
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
    private int status;
    /**
     * Constructor for objects of class Characters
     */
    public Character(String name, String text, Item item, int status)
    {
        this.name = name;
        this.text = text;
        this.item = item;
        this.status = status;
        String question = null;
    }
    
    public String getCharacterName(){
        return name;
    }
    
    public String getCharacterText(){
        return text;
    }
    public void changeCharacterText(String newtext){
        this.text = newtext;
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
    
    public int getStatus(){
    return status;
    }
    
    public void setStatus(int i){
    this.status = i;}
}
