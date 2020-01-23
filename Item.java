
/**
 * The class Item, contains all the information which is needed to create an Item in our game.
 * @param itemName - the name of the item
 * @param itemDescription - the description of the item
 * @param itemAmount - the amount of the item that the player has
 * @param itemUse - the use the item has, defined in integers
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String itemName;
    private String itemDescription;
    private int itemAmount;
    private int itemUse;
    /**
     * Constructor for objects of class Items
     */
    public Item(String itemName, String itemDescription, int itemAmount, int itemUse)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemAmount = itemAmount;
        this.itemUse = itemUse;
    }
    public String item_getName(){
        String name = itemName;
        return name;
    }
    public String item_getDescription(){
        String description = itemDescription;
        return description;
    }
    public int item_getAmount(){
        int amount = itemAmount;
        return amount;
    }
    public int item_getUse(){
        int use = itemUse;
        return use;
    }
    public void item_increaseAmount(){
        itemAmount = itemAmount + 1;
    }
    public void item_changeName(String newname){
        itemName = newname;
    }
    public void item_changeDescription(String newdescription){
        itemDescription = newdescription;
    }
}
