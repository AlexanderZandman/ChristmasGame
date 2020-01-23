import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private ArrayList<Item> inventory;
    private int lives;
    private int strength;
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
