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
    public Player(ArrayList<Item> inventory, int lives){
        this.inventory = inventory;
        this.lives = lives;
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
    
}
