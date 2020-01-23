import java.util.ArrayList;
/**
 * This is the class where the player is defined.
 * @param inventory - here the player his inventory is initiated
 * @param lives - the amount of lives the player has
 * @param strength - the strength variable, this is used to move the boulder for the Grinch fight
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private ArrayList<Item> inventory;
    private int lives;
    private int strength;
    
    /**
     * Constructor for class player
     * 
     */
    public Player(ArrayList<Item> inventory, int lives, int strength){
        this.inventory = inventory;
        this.lives = lives;
        this.strength = strength;
    }
    public int getLives(){
        return lives;
    }
    public void addLives(int i){
        lives = lives + i;
    }
    public void rmLives(int i){
        lives = lives - i;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int i){
        strength = i;
    }
    
}
