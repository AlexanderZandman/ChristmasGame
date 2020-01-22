
/**
 * Write a description of class Items here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String itemName;
    private String itemDescription;
    private int itemAmount;
    private int itemWeight;
    /**
     * Constructor for objects of class Items
     */
    public Item(String itemName, String itemDescription, int itemAmount, int itemWeight)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemAmount = itemAmount;
        this.itemWeight = itemWeight;
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
    public int item_getWeight(){
        int weight = itemWeight;
        return weight;
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
