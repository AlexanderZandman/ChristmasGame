import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    private ArrayList rooms;
    private Random random;
    private ArrayList<Room> prevRooms;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private Settings settings;
    private Scanner scanner = new Scanner(System.in);
    private int lives = 3;
    private int strength;
    private Player player;
    public static int userinput;
    private int grinch_hp = 3;
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        

        //comment om te testen
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        //initialize rooms
      
        
        //initialize characters
        Character santa, waterElf, sleepingElf, mathElf;    
        
        //items
        Item bag_of_presents = new Item("Bag of Presents", "An empty bag that can be filled with presents", 1, 0);
        Item present = new Item("Present", "It is one of the missing presents", 1, 0);
        
        // create the rooms
        Room mainroom = new Room(Text.MAINROOM.checkLanguage(settings.getLanguage()));
        Room waterpuzzleroom = new Room(Text.WATERPUZZLEROOM.checkLanguage(settings.getLanguage()));
        Room keyroom = new Room(Text.KEYROOM.checkLanguage(settings.getLanguage()));
        Room sleeping_elf_room = new Room(Text.SLEEPING_ELF_ROOM.checkLanguage(settings.getLanguage()));
        Room mathroom = new Room(Text.MATHROOM.checkLanguage(settings.getLanguage()));
        Room table_order_room = new Room(Text.TABLE_ORDER_ROOM.checkLanguage(settings.getLanguage()));
        Room upstairsroom = new Room(Text.UPSTAIRSROOM.checkLanguage(settings.getLanguage()));
        Room minefieldroom = new Room(Text.MINEFIELDROOM.checkLanguage(settings.getLanguage()));
        Room bonusroom = new Room("the grinch");
        
        //add items, characters and exits to rooms
        
        //main room
        ArrayList<Item> main_items = new ArrayList<Item>();
        mainroom.setItem(main_items);
        
        santa = new Character("Santa", "I am santa and you better run, here is a Bag of Presents", bag_of_presents);         
        mainroom.setCharacter(santa);
        
        mainroom.setExit(Text.EAST.checkLanguage(settings.getLanguage()), waterpuzzleroom);
        mainroom.setExit(Text.SOUTH.checkLanguage(settings.getLanguage()), sleeping_elf_room);
        mainroom.setExit(Text.UP.checkLanguage(settings.getLanguage()), upstairsroom);
        
      
        //waterpuzzle room
        ArrayList<Item> water_items = new ArrayList<Item>();
        Item container = new Item("Container","A container containing water",
        0,0);
        water_items.add(container);
        waterpuzzleroom.setItem(water_items);
        
        waterElf = new Character("Elf","Help me solve this puzzle, please!", null);
        waterElf.setCharacterQuestion("What is your favourite number?" , 69);
        waterpuzzleroom.setCharacter(waterElf);
        
        waterpuzzleroom.setExit(Text.WEST.checkLanguage(settings.getLanguage()), mainroom);
        waterpuzzleroom.setExit(Text.SOUTH.checkLanguage(settings.getLanguage()), keyroom);

        //sleepingelf room
        ArrayList<Item> sleeping_items = new ArrayList<Item>();
        Item recipe = new Item("Recipe","A recipe for some kind of soup, "+
        "the title says: How to wake up a sleeping elf",0,0);
        sleeping_items.add(recipe);
        sleeping_elf_room.setItem(sleeping_items);
        
        sleepingElf = new Character("Elf","ZzZ... zZz...", null);
        sleeping_elf_room.setCharacter(sleepingElf);
        
        sleeping_elf_room.setExit(Text.NORTH.checkLanguage(settings.getLanguage()), mainroom);
        sleeping_elf_room.setExit(Text.WEST.checkLanguage(settings.getLanguage()), mathroom);
        sleeping_elf_room.setExit(Text.EAST.checkLanguage(settings.getLanguage()), table_order_room);
        
        //math room
        mathElf = new Character("Elf","Please help me solve this math puzzle!\n", present);
        mathroom.setCharacter(mathElf);
        mathElf.setCharacterQuestion("Santa has to visit 2400 houses where he delivers presents.\nEach house contains three children. Every child receives amount of houses divided by 400 in gifts.\nHow many gifts does Santa have to deliver in total? \n", 43200);
        mathroom.setExit(Text.NORTH.checkLanguage(settings.getLanguage()), keyroom);
        
        //minefield room
        Random r = new Random();
        ArrayList<Integer> savetiles = new ArrayList<Integer>();
        
        //key room
        Character keyElf = new Character("Elf","I can't seem to find the key. \nThese five boxes contain items, one of them is the hidden key! \nBut the others could be traps, \nI am too afraid to open them, you have to open them for me! \nUse the pickup command, and choose between Item1, Item2, Item3, Item4 and Item5.", null);
        keyroom.setCharacter(keyElf);
        ArrayList<Item> key_items = new ArrayList<Item>();
        
        ArrayList<String> randomname = new ArrayList();
        randomname.add("Item1");
        randomname.add("Item2");
        randomname.add("Item3");
        randomname.add("Item4");
        randomname.add("Item5");
        
        Item key = new Item(randomItem(randomname), "You have found the key!", 1, 1);
        Item candycane = new Item(randomItem(randomname), "You have found a candy cane! This could be usefull for later :)", 1, 2);
        Item trap1 = new Item(randomItem(randomname), "Oh no it's a trap", 1, 0);
        Item trap3 = new Item(randomItem(randomname), "Oh no it's a trap", 1, 0);
        Item trap5 = new Item(randomItem(randomname), "Oh no it's a trap", 1, 0);
        key_items.add(trap1);
        key_items.add(key);
        key_items.add(trap3);
        key_items.add(candycane);
        key_items.add(trap5);
        keyroom.setItem(key_items);
        
        //table_order_room
        Character orderElf = new Character("Elf","I need to find the right bottle to clean up this mess!\n" +
        "Santa told me which bottle to use, but i can't figure it out, would you help me please?",null);
        orderElf.setCharacterQuestion("We need to find cleaning supplies. \n" +
        "There are 4 statements to help find the right bottle:\n" +
        "1.  Olive oil is directly left of Acid.\n" +
        "2.  Acid is next to Water.\n" +
        "3.  Gluh wine is directly right of Cleaning supplies\n" +
        "4.  Olive oil is opposite Gluh wine.\n" +
        "----At which position are the cleaning supplies?----\n" +
        "far left = 1 \nmiddle left = 2 \nmiddle = 3 \nmiddleright = 4 \nfar right = 5", 4);
        table_order_room.setCharacter(orderElf);
        table_order_room.setExit(Text.WEST.checkLanguage(settings.getLanguage()),sleeping_elf_room);
        
        //bonusroom
        Character grinch = new Character("Grinch", "So you have finally found me", null);
        if(grinch_hp == 0){
            ArrayList<Item> bonusroom_items = new ArrayList<Item>();
            bonusroom_items.add(present);
            bonusroom.setItem(bonusroom_items);
        }
        currentRoom = mainroom;
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {         
        System.out.println("What language do you want to play the game in? Type 0 for English, type 1 for Dutch");
        userinput = scanner.nextInt();
        this.userinput = userinput;
        parser = new Parser();
        prevRooms = new ArrayList();
        settings = new Settings();
        settings.setLanguage(userinput);
        player = new Player(inventory, lives, strength);
        createRooms();
        printWelcome();
        
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
       
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println(Text.THANKS.checkLanguage(settings.getLanguage()));
    }
    
    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println(Text.WELCOME.checkLanguage(settings.getLanguage()));
        System.out.println();
        System.out.println(Text.ROOMDESCRIPTION.checkLanguage(settings.getLanguage()) + currentRoom.getLongDescription());
    }
    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;
        
        if(player.getLives() <= 0){
            System.out.println("Game over");
            wantToQuit = true;
        }
        
        CommandWord commandWord = command.getCommandWord();
        
        switch (commandWord) {
            case UNKNOWN:
            System.out.println(Text.UNKNOWN.checkLanguage(settings.getLanguage()));
            break;

            case HELP:
            printHelp();
            break;

            case GO:
            goRoom(command);
            break;

            case TALK:
            talkTo(command);
            break;

            case BACK:
            goBack(command);
            break;

            case QUIT:
                wantToQuit = quit(command);
                break;
            case INVENTORY:
                showInventory();
                break;
            
            case PICKUP:
                pickupItem(command);
                break;
            case SHOW:
                showRoom();
                break;
            case LIVES:
                amountLives();
                break;
            case ATTACK:
                
                break;
        }
        return wantToQuit;
    }
    /**
     * Gets the amount of player lives and prints these for the player to see
     */
    private void amountLives(){
        System.out.println(Text.LIVES1.checkLanguage(settings.getLanguage()) + player.getLives() + 
        (Text.LIVES2.checkLanguage(settings.getLanguage())));
    }
    /**
     * If the inventory is not empty, it prints every Item in the inventory. If it is empty, it prints that the inventory is empty
     */
    private void showInventory()
    {
        if(inventory.size() < 1){
        System.out.println(Text.INVENTORYEMPTY.checkLanguage(settings.getLanguage()));
        }else{
        for(Item item : inventory){
        String name = item.item_getName();
        String description = item.item_getDescription();
        int amount = item.item_getAmount();
        System.out.println(Text.ITEMNAME.checkLanguage(settings.getLanguage()) + name);
        System.out.println(Text.ITEMDESC.checkLanguage(settings.getLanguage()) + description);
        System.out.println(Text.ITEMAMOUNT.checkLanguage(settings.getLanguage()) + amount);
        }
    }
    }
    /**
     * Shows what items and characters are in the room
     */
    private void showRoom(){
        System.out.println(Text.SHOWROOMITEM.checkLanguage(settings.getLanguage()));
        for(Item item : currentRoom.getItem()){
            System.out.println(item.item_getName());
        }
        System.out.println();
        System.out.println(Text.SHOWROOMCHAR.checkLanguage(settings.getLanguage()));
        System.out.println(currentRoom.getCharacter().getCharacterName());
    }
    /**
     * Lets the player pickup an item. First it checks if the item is in the room, then it checks if the item is a trap or not. After that it checks if it is a 
     * key or candycane, because these are special items. Then it looks into the inventory to see if the item is already present in the inventory. 
     * If it is, it will increase the amount of the item by 1. If it isnt, it will add the item as a whole to the inventory.
     * Finally it removes the item from the room.
     * 
     * @param command - It first checks if the command is given and if it has a second word (the item you want to pick up)
     * 
     */
    private void pickupItem(Command command)
    {
        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we don't know what item to pick up
            System.out.println(Text.PICKUPERROR.checkLanguage(settings.getLanguage()));
            
        }
        Item newitem;
        Item inventory_item;
        String item = command.getSecondWord();
        ArrayList<Item> roomitem = currentRoom.getItem();
        for(Item item2 : roomitem){
            if(item.equals(item2.item_getName())){
                newitem = item2;
                if(newitem.item_getDescription() == Text.TRAP.checkLanguage(settings.getLanguage())){
                    System.out.println(Text.FELLINTRAP.checkLanguage(settings.getLanguage()));
                    player.rmLives(1);
                    break;
                }
                if(newitem.item_getDescription() == "You have found the key!"){
                    newitem.item_changeName(Text.KEY.checkLanguage(settings.getLanguage()));
                    newitem.item_changeDescription(Text.KEYDESCR.checkLanguage(settings.getLanguage()));
                }
                if(newitem.item_getDescription() == "You have found a candy cane! This could be usefull for later :)"){
                    newitem.item_changeName("Candy cane");
                    newitem.item_changeDescription("A candy cane! This could be useful for later :)");
                }
                if(inventory.contains(newitem)){
                    newitem.item_increaseAmount();
                    System.out.println("You have picked up " + newitem.item_getName() + "!");
                    currentRoom.unsetItem(newitem);
                    break;
                }else{
                    inventory.add(newitem);
                    System.out.println("You have picked up " + newitem.item_getName() + "!");
                    currentRoom.unsetItem(newitem);
                    break;
                }
            }
        }
    }
    private void useItem()
    {
        
    }
    /**
     * Retrieves a random index of an array and returns it.
     * @param array - the random index is retrieved from the desired array
     */
    private String randomItem(ArrayList array){
        Random rand = new Random();
        int randomNumber = rand.nextInt(array.size());
        String theitem = array.get(randomNumber).toString();
        array.remove(randomNumber);
        return theitem;
        
    }
    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println(Text.HELP.checkLanguage(settings.getLanguage()));
        parser.showCommands();
    }
    /**
     * Combat system for the bonusroom, in this method both the player will hit the Grinch and the Grinch will hit the player.
     * 
     */
    private void hitGrinch()
    {
        if(grinch_hp != 0){
            if(currentRoom.getCharacter().getCharacterName() == "Grinch"){
                grinch_hp = grinch_hp - 1;
                System.out.println("You hit The Grinch for 1 damage!");
                System.out.println();
                System.out.println("He has " + grinch_hp + " remaining");
                System.out.println();
                player.rmLives(1);
                System.out.println("The Grinch retaliated!");
                System.out.println("You have been hit for 1 life");
                System.out.println("You have " + player.getLives() + " remaining");
            }
        }else{
            currentRoom.rmCharacter(currentRoom.getCharacter());
            System.out.println("You have defeated the Grinch!");
            System.out.println();
            System.out.println("Upon his death he has dropped the final present!");
            System.out.println("Use the [pickup Present] command to pick it up");
        }
            
    }
    /** 
     * Try to go in one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }
        prevRooms.add(currentRoom);

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }

    }
    /**
     * Method to use the talk_to command, which lets the player talk to npcs.
     * @param command - if the command is issued, and it has an second word, then it will use the method.
     * 
     */
    private void talkTo(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know who to talk to
            System.out.println("Talk to who?");
            return;
        }

        String npc = command.getSecondWord();
        Character npc2 = currentRoom.getCharacter();

        if (npc.equals(npc2.getCharacterName())){
            if (npc2.getCharacterText() != null){
                System.out.println(npc2.getCharacterText());
                if(npc2.getCharacterQuestion() == null && npc2.getCharacterItem() != null){
                System.out.println("You have received " + npc2.getCharacterItem().item_getName());
                inventory.add(npc2.getCharacterItem());
            }
                
            }
            else{
                System.out.println("This person cannot talk");
            }
        }
        else{
            System.out.println("This character is not in this room");
        }
        
        if (npc2.getCharacterQuestion() != null){
            askForAnswer(npc2.getCharacterQuestion(),npc2.getCharacterAnswer());
        }
    }
    /**
     * Scans userinput and checks if answer corresponds with the correct answer.
     * @param question - is used to print the question, that the ncp has
     * @param answer - the answer, if the player's answer is similar to this one, the puzzle is solved.
     */
    private void askForAnswer(String question,Integer answer){
        Scanner input = new Scanner(System.in);
        System.out.print(question + "\nYour answer: ");
        if (input.hasNextInt()){ 
            
            int number = input.nextInt();
            System.out.println("You entered " + number);
            if (number == answer){
                System.out.println("That's the correct answer\n");
                if(currentRoom.getCharacter().getCharacterItem() != null){
                inventory.add(currentRoom.getCharacter().getCharacterItem());
                System.out.println("You have received a " + currentRoom.getCharacter().getCharacterItem().item_getName() + "!");
                }else{
                    System.out.println("Sorry this character does not have an item for you");
                }
                
            }
            else{
                System.out.println("No, that is incorrect");
            }
        }
        else{
            System.out.println("Your answer must be a number." +
            "\nTalk to me once more, to try again");
        }
    }
    /**
     * Return the player to the previous room.
     * @param command - if command is issued, then method is used.
     */
    private void goBack(Command command){
        //goback
        if ((prevRooms.size() > 0)){
            currentRoom = prevRooms.get(prevRooms.size() -1);
            prevRooms.remove(prevRooms.size() -1);
            System.out.println(currentRoom.getLongDescription());
        }
        else{
            System.out.println("This is where you started, cannot go back" + 
            " further!");
        }
    }
    
    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    /**
     * Lets the user see his input, used for the language selection at the start of the game.
     */
    public void getUserinput(){
        System.out.println(userinput);
    }
}
