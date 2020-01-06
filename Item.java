
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
}
