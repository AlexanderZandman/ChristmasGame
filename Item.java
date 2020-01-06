
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
    public String getName(){
    String name = itemName;
    return name;
    }
    public String getDescription(){
    String description = itemDescription;
    return description;
    }
    public int getAmount(){
    int amount = itemAmount;
    return amount;
    }
    public int getWeight(){
    int weight = itemWeight;
    return weight;
    }
}
