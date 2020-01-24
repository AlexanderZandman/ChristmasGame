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
 * @author   Alex Zandman, Joost Perdok
 * @version 2020.23.1
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    private ArrayList rooms;
    private Random random;
    private ArrayList<Room> prevRooms;
    private ArrayList<Item> inventory = new ArrayList<Item>();
//    private Settings Settings;
    private Scanner scanner = new Scanner(System.in);
    private int lives = 6;
    private int strength;
    private Player player;
    public static int language;
    private int grinch_hp = 3;
    private int boulder = 300;
    private int hasSword;
    Item present;
    private int quitmessage;
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {

        //comment om te testen
    }
    public static void main(String[] args){
        Game game = new Game();
        game.play();
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
        Item bag_of_presents = new Item(Text.BAGNAME.checkLanguage(Settings.getLanguage()), Text.BAGDESCRIPTION.checkLanguage(Settings.getLanguage()), 1, 0);
        present = new Item(Text.PRESENTNAME.checkLanguage(Settings.getLanguage()), Text.PRESENTDESCRIPTION.checkLanguage(Settings.getLanguage()), 1, 0);

        // create the rooms
        Room mainroom = new Room(Text.MAINROOM.checkLanguage(Settings.getLanguage()), 0);
        Room keyroom = new Room(Text.KEYROOM.checkLanguage(Settings.getLanguage()), 0);
        Room sleeping_elf_room = new Room(Text.SLEEPING_ELF_ROOM.checkLanguage(Settings.getLanguage()), 0);
        Room mathroom = new Room(Text.MATHROOM.checkLanguage(Settings.getLanguage()), 0);
        Room table_order_room = new Room(Text.TABLE_ORDER_ROOM.checkLanguage(Settings.getLanguage()), 0);
        Room upstairsroom = new Room(Text.UPSTAIRSROOM.checkLanguage(Settings.getLanguage()), 0);
        Room bonusroom = new Room(Text.BONUSROOM.checkLanguage(Settings.getLanguage()), 300);
        Room swordroom = new Room(Text.SWORDROOM.checkLanguage(Settings.getLanguage()), 1);

        //add items, characters and exits to rooms

        //main room
        ArrayList<Item> main_items = new ArrayList<Item>();
        mainroom.setItem(main_items);

        santa = new Character(Text.SANTANAME.checkLanguage(Settings.getLanguage()), Text.SANTADESCRIPTION.checkLanguage(Settings.getLanguage()), bag_of_presents,0);         
        mainroom.setCharacter(santa);
        mainroom.setExit(Text.WEST.checkLanguage(Settings.getLanguage()), bonusroom);
        mainroom.setExit(Text.SOUTH.checkLanguage(Settings.getLanguage()), sleeping_elf_room);
        mainroom.setExit(Text.UP.checkLanguage(Settings.getLanguage()), upstairsroom);


        //sleepingelf room
        ArrayList<Item> sleeping_items = new ArrayList<Item>();
        Item Peas = new Item(Text.PEAS.checkLanguage(Settings.getLanguage())
            ,Text.PEAS.checkLanguage(Settings.getLanguage()),1,1);
        Item Kiwi = new Item(Text.KIWI.checkLanguage(Settings.getLanguage())
            ,Text.KIWI.checkLanguage(Settings.getLanguage()),1,1);
        Item Chili = new Item(Text.CHILI.checkLanguage(Settings.getLanguage())
            ,Text.CHILI.checkLanguage(Settings.getLanguage()),1,1);
        Item Watermelon = new Item(Text.WATERMELON.checkLanguage(Settings.getLanguage())
            ,Text.WATERMELON.checkLanguage(Settings.getLanguage()),1,1);
        Item Beans = new Item(Text.BEANS.checkLanguage(Settings.getLanguage())
            ,Text.BEANS.checkLanguage(Settings.getLanguage()),1,1);

        sleeping_items.add(Peas);
        sleeping_items.add(Kiwi);
        sleeping_items.add(Chili);
        sleeping_items.add(Watermelon);
        sleeping_items.add(Beans);

        sleeping_elf_room.setItem(sleeping_items);

        sleepingElf = new Character("Elf","ZzZ... zZz...", null,0);
        sleeping_elf_room.setCharacter(sleepingElf);

        sleeping_elf_room.setExit(Text.NORTH.checkLanguage(Settings.getLanguage()), mainroom);
        sleeping_elf_room.setExit(Text.WEST.checkLanguage(Settings.getLanguage()), mathroom);
        sleeping_elf_room.setExit(Text.EAST.checkLanguage(Settings.getLanguage()), table_order_room);

        //math room
        mathElf = new Character("Elf",Text.MATHELFTEXT.checkLanguage(Settings.getLanguage()), present,0);
        mathroom.setCharacter(mathElf);
        mathElf.setCharacterQuestion(Text.MATHELFQUESTION.checkLanguage(Settings.getLanguage()), 43200);
        mathroom.setExit(Text.EAST.checkLanguage(Settings.getLanguage()), sleeping_elf_room);

        //key room
        Character keyElf = new Character("Elf",Text.KEYELFTEXT.checkLanguage(Settings.getLanguage()) , null, 0);
        keyroom.setCharacter(keyElf);
        ArrayList<Item> key_items = new ArrayList<Item>();

        ArrayList<String> randomname = new ArrayList();
        randomname.add("Item1");
        randomname.add("Item2");
        randomname.add("Item3");
        randomname.add("Item4");
        randomname.add("Item5");

        Item key = new Item(randomItem(randomname), Text.FOUNDKEY.checkLanguage(Settings.getLanguage()), 1, 1);
        Item candycane = new Item(randomItem(randomname), Text.FOUNDCANDYCANE.checkLanguage(Settings.getLanguage()), 1, 300);
        Item trap1 = new Item(randomItem(randomname), Text.TRAP.checkLanguage(Settings.getLanguage()), 1, 0);
        Item trap3 = new Item(randomItem(randomname), Text.TRAP.checkLanguage(Settings.getLanguage()), 1, 0);
        Item trap5 = new Item(randomItem(randomname), Text.TRAP.checkLanguage(Settings.getLanguage()), 1, 0);
        key_items.add(trap1);
        key_items.add(key);
        key_items.add(trap3);
        key_items.add(candycane);
        key_items.add(trap5);
        keyroom.setItem(key_items);
        keyroom.setExit(Text.NORTH.checkLanguage(Settings.getLanguage()), table_order_room);

        //table_order_room
        Character orderElf = new Character("Elf", Text.ORDERELFTEXT.checkLanguage(Settings.getLanguage()), present,0);
        orderElf.setCharacterQuestion(Text.ORDERELFQUESTION.checkLanguage(Settings.getLanguage()), 4);
        table_order_room.setCharacter(orderElf);
        table_order_room.setExit(Text.WEST.checkLanguage(Settings.getLanguage()),sleeping_elf_room);
        table_order_room.setExit(Text.SOUTH.checkLanguage(Settings.getLanguage()),keyroom);

        //sword room
        ArrayList<Item> swordroom_items = new ArrayList<Item>();
        Item candycane_sword = new Item(Text.CCSNAME.checkLanguage(Settings.getLanguage()), Text.CCSDESCRIPTION.checkLanguage(Settings.getLanguage()), 1, 0);
        swordroom_items.add(candycane_sword);
        swordroom.setItem(swordroom_items);
        swordroom.setExit(Text.SOUTH.checkLanguage(Settings.getLanguage()), upstairsroom);

        //upstairsroom
        upstairsroom.setExit(Text.NORTH.checkLanguage(Settings.getLanguage()), swordroom);
        upstairsroom.setExit(Text.DOWN.checkLanguage(Settings.getLanguage()), mainroom);

        //bonusroom
        Character grinch = new Character("Grinch", Text.GRINCHTEXT.checkLanguage(Settings.getLanguage()), null,0);
        bonusroom.setCharacter(grinch);
        bonusroom.setExit(Text.EAST.checkLanguage(Settings.getLanguage()), mainroom);
        currentRoom = mainroom;
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {         
        System.out.println("What language do you want to play the game in? Type 0 for English, type 1 for Dutch");
        if(scanner.hasNextInt())
        {
            language = scanner.nextInt();
        }
        else
        {
            System.out.println("Invalid value has been entered, defaulting to English...\n");
        }
        parser = new Parser();
        prevRooms = new ArrayList();
        Settings.setLanguage(language);
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
        switch(quitmessage){
            case(0):
            System.out.println(Text.THANKS.checkLanguage(Settings.getLanguage()));
            break;

            case(1):
            System.out.println(Text.GAMEOVER.checkLanguage(Settings.getLanguage()));
            break;

            case(2):
            System.out.println(Text.CONGRATULATIONS.checkLanguage(Settings.getLanguage()));
            break;
        }
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println(Text.WELCOME.checkLanguage(Settings.getLanguage()));
        System.out.println();
        System.out.println(Text.ROOMDESCRIPTION.checkLanguage(Settings.getLanguage()) + currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(player.getLives() == 1){
            quitmessage = 1;
            wantToQuit = true;
        }

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {
            case UNKNOWN:
            System.out.println(Text.UNKNOWN.checkLanguage(Settings.getLanguage()));
            break;

            case HELP:
            printHelp();
            break;

            case GO:
            goRoom(command);
            break;

            case TALK:
            if(currentRoom.getShortDescription() == Text.MAINROOM.checkLanguage(Settings.getLanguage()) && currentRoom.getCharacter().getCharacterText() =="You did it, you saved Christmas!")
            {
                quitmessage = 2;
                wantToQuit = true;
            }
            talkTo(command);
            break;

            case BACK:
            goBack(command);
            break;

            case QUIT:
            quitmessage = 0;
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
            hitGrinch();
            break;

            case STRENGTH:
            System.out.println(player.getStrength());
            break;

            case USE:
            useItem(command);
            break;
        }
        return wantToQuit;
    }

    /**
     * Gets the amount of player lives and prints these for the player to see
     */
    private void amountLives(){
        System.out.println(Text.LIVES1.checkLanguage(Settings.getLanguage()) + player.getLives() + 
            (Text.LIVES2.checkLanguage(Settings.getLanguage())));
    }

    /**
     * If the inventory is not empty, it prints every Item in the inventory. If it is empty, it prints that the inventory is empty
     */
    private void showInventory()
    {
        if(inventory.size() < 1){
            System.out.println(Text.INVENTORYEMPTY.checkLanguage(Settings.getLanguage()));
        }else{
            for(Item item : inventory){
                String name = item.item_getName();
                String description = item.item_getDescription();
                int amount = item.item_getAmount();
                System.out.println(Text.ITEMNAME.checkLanguage(Settings.getLanguage()) + name);
                System.out.println(Text.ITEMDESC.checkLanguage(Settings.getLanguage()) + description);
                System.out.println(Text.ITEMAMOUNT.checkLanguage(Settings.getLanguage()) + amount);
            }
        }
    }

    /**
     * Shows what items and characters are in the room
     */
    private void showRoom(){
        System.out.println(Text.SHOWROOMITEM.checkLanguage(Settings.getLanguage()));
        for(Item item : currentRoom.getItem()){
            System.out.println(item.item_getName());
        }
        System.out.println();
        System.out.println(Text.SHOWROOMCHAR.checkLanguage(Settings.getLanguage()));
        System.out.println(currentRoom.getCharacter().getCharacterName());
        System.out.println();
        System.out.println(currentRoom.getExitString());
        

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
            System.out.println(Text.PICKUPERROR.checkLanguage(Settings.getLanguage()));

        }
        int isInRoom = 0;
        Item newitem;
        Item inventory_item;
        String item = command.getSecondWord();
        ArrayList<Item> roomitem = currentRoom.getItem();
        if (roomitem.isEmpty()){
            System.out.println(Text.CANTFINDITEM.checkLanguage(Settings.getLanguage()));
            isInRoom = 1;
        }

        for(Item item2 : roomitem){
            if(item.equals(item2.item_getName())){
                newitem = item2;
                if(newitem.item_getDescription() == Text.TRAP.checkLanguage(Settings.getLanguage())){
                    System.out.println(Text.FELLINTRAP.checkLanguage(Settings.getLanguage()));
                    player.rmLives(1);
                    amountLives();
                    isInRoom = 1;
                    break;
                }
                if(newitem.item_getDescription() == Text.FOUNDKEY.checkLanguage(Settings.getLanguage())){
                    newitem.item_changeName(Text.KEY.checkLanguage(Settings.getLanguage()));
                    newitem.item_changeDescription(Text.KEYDESCR.checkLanguage(Settings.getLanguage()));
                    isInRoom = 1;
                }
                if(newitem.item_getDescription() == Text.FOUNDCANDYCANE.checkLanguage(Settings.getLanguage())){
                    newitem.item_changeName(Text.CCNAME.checkLanguage(Settings.getLanguage()));
                    newitem.item_changeDescription(Text.CCDESCRIPTION.checkLanguage(Settings.getLanguage()));
                    isInRoom = 1;
                }
                if(inventory.contains(newitem)){
                    newitem.item_increaseAmount();
                    System.out.println(Text.PICKEDUP.checkLanguage(Settings.getLanguage()) + newitem.item_getName() + "!");
                    currentRoom.unsetItem(newitem);
                    isInRoom = 1;
                    break;
                }
                if (currentRoom.getShortDescription() == Text.SLEEPING_ELF_ROOM.checkLanguage(Settings.getLanguage()))
                {
                    if(newitem.item_getDescription() == Text.WATERMELON.checkLanguage(Settings.getLanguage()))
                    {
                        System.out.println(Text.ELFWAKES.checkLanguage(Settings.getLanguage()));
                        System.out.println(Text.ELFTALKS.checkLanguage(Settings.getLanguage()));
                        if (inventory.contains(present))
                            {present.item_increaseAmount();
                        }
                        else{
                            inventory.add(present);
                        }
                        System.out.println(Text.ADDPRESENT.checkLanguage(Settings.getLanguage()));
                        currentRoom.unsetItem(newitem);
                        isInRoom = 1;
                        break;  
                    }
                    else
                    {
                        System.out.println(Text.ELFANNOYED.checkLanguage(Settings.getLanguage()));
                        player.rmLives(1);
                        amountLives();
                        isInRoom = 1;
                    }
                }
                else{
                    if (inventory.contains(newitem)){
                        newitem.item_increaseAmount();}
                    else{inventory.add(newitem);}        
                    System.out.println(Text.PICKEDUP.checkLanguage(Settings.getLanguage()) + newitem.item_getName() + "!");
                    currentRoom.unsetItem(newitem);
                    isInRoom = 1;
                    break;
                }
            }
        }
        if (isInRoom != 1){
            System.out.println(Text.CANTFINDITEM.checkLanguage(Settings.getLanguage())); 
        }
    }

    private void useItem(Command command)
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println(Text.WHATITEM.checkLanguage(Settings.getLanguage()));
            return;
        }
        String theitem = command.getSecondWord();
        int itemuse;
        for(Item item : inventory){
            if(item.item_getName().equals(theitem)){
                itemuse = item.item_getUse();
                player.setStrength(itemuse);
            }else{
            }
        }
        //player.setStrength(item.item_getUse());
        if(player.getStrength() > 1){ 
            System.out.println(Text.STRENGTH1.checkLanguage(Settings.getLanguage()));
            System.out.println(Text.STRENGTH2.checkLanguage(Settings.getLanguage()));
        }
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
        System.out.println(Text.HELP.checkLanguage(Settings.getLanguage()));
        parser.showCommands();
    }

    /**
     * Combat system for the bonusroom, in this method both the player will hit the Grinch and the Grinch will hit the player.
     * 
     */
    private void hitGrinch()
    {
        String theitem = Text.CCSNAME.checkLanguage(Settings.getLanguage());
        int itemuse;
        for(Item item : inventory){
            if(item.item_getName().equals(theitem)){
                hasSword = 1;
            }
        }
        if(hasSword == 0)
        {
            System.out.println(Text.NOSWORD.checkLanguage(Settings.getLanguage()));
            if ((prevRooms.size() > 0)){
            currentRoom = prevRooms.get(prevRooms.size() -1);
            prevRooms.remove(prevRooms.size() -1);
            System.out.println(currentRoom.getLongDescription());
            }
        }
        if(hasSword == 1){
            if(grinch_hp > 0){
                if(currentRoom.getCharacter().getCharacterName() == "Grinch"){
                    grinch_hp = grinch_hp - 1;
                    System.out.println(Text.GRINCHFIGHT1.checkLanguage(Settings.getLanguage()));
                    System.out.println();
                    System.out.println(Text.GRINCHFIGHT2.checkLanguage(Settings.getLanguage()) + grinch_hp + Text.GRINCHFIGHT3.checkLanguage(Settings.getLanguage()));
                    System.out.println();
                    player.rmLives(1);
                    System.out.println(Text.GRINCHFIGHT4.checkLanguage(Settings.getLanguage()));
                    System.out.println(Text.GRINCHFIGHT5.checkLanguage(Settings.getLanguage()));
                    System.out.println(Text.GRINCHFIGHT6.checkLanguage(Settings.getLanguage()) + player.getLives() + Text.GRINCHFIGHT7.checkLanguage(Settings.getLanguage()));
                }
            }else{
                if(currentRoom.getCharacter().getCharacterName() == "Grinch"){
                    ArrayList<Item> bonusroom_items = new ArrayList<Item>();
                    bonusroom_items.add(present);
                    currentRoom.setItem(bonusroom_items);
                }
                currentRoom.rmCharacter(currentRoom.getCharacter());
                System.out.println(Text.GRINCHDEF1.checkLanguage(Settings.getLanguage()));
                System.out.println();
                System.out.println(Text.GRINCHDEF2.checkLanguage(Settings.getLanguage()));
                System.out.println(Text.GRINCHDEF3.checkLanguage(Settings.getLanguage()));
                System.out.println();
                System.out.println(Text.GRINCHDEF4.checkLanguage(Settings.getLanguage()));
            }
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
            System.out.println(Text.GOWHERE.checkLanguage(Settings.getLanguage()));
            return;
        }
        prevRooms.add(currentRoom);

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);
        int gotkey = 0;
        if (nextRoom == null) {
            if(command.getSecondWord() == Text.NORTH.checkLanguage(Settings.getLanguage()) || 
            command.getSecondWord() == Text.WEST.checkLanguage(Settings.getLanguage()) ||
            command.getSecondWord() == Text.SOUTH.checkLanguage(Settings.getLanguage()) ||
            command.getSecondWord() == Text.EAST.checkLanguage(Settings.getLanguage()))
            {
                System.out.println(Text.NODOOR.checkLanguage(Settings.getLanguage()));
            }
            else
            {
                System.out.println(Text.DONTKNOW.checkLanguage(Settings.getLanguage()));
            }
        }else{
        if (nextRoom.isLocked() == 1)
        {
            String theitem = Text.KEY.checkLanguage(Settings.getLanguage());
            for(Item item : inventory){
                if(item.item_getName().equals(theitem)){
                    System.out.println(Text.UNLOCKDOOR.checkLanguage(Settings.getLanguage()));
                    System.out.println();
                    currentRoom = nextRoom;
                    System.out.println(currentRoom.getLongDescription());
                    gotkey = 1;
                    break;
                }
            }
            if (gotkey != 1){
                System.out.println(Text.LOCKEDDOOR.checkLanguage(Settings.getLanguage()));
            }
        }
        if (nextRoom.isLocked() == 300)
        {
            if(player.getStrength() == boulder){
                System.out.println(Text.BOULDER1.checkLanguage(Settings.getLanguage()));
                System.out.println();
                currentRoom = nextRoom;
                System.out.println(currentRoom.getLongDescription());
            }else{
                System.out.println(Text.BOULDER2.checkLanguage(Settings.getLanguage()));
            }
        }
        if (nextRoom.isLocked() == 0) {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
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
        
        if (npc2.getStatus() == 0){
            if (npc.equals(npc2.getCharacterName())){
                if (npc2.getCharacterText() != null){
                    System.out.println(npc2.getCharacterText());
                    if(npc2.getCharacterQuestion() == null && npc2.getCharacterItem() != null){
                        System.out.println(Text.RECEIVED.checkLanguage(Settings.getLanguage()) + npc2.getCharacterItem().item_getName());
    
                        if (inventory.contains(npc2.getCharacterItem()))
                                {present.item_increaseAmount();}
                        else{inventory.add(npc2.getCharacterItem());}
                        npc2.setStatus(1);
                    }
    
                }
                else{
                    System.out.println(Text.CANTTALK.checkLanguage(Settings.getLanguage()));
                }
            }
            else{
            System.out.println(Text.NOTINROOM.checkLanguage(Settings.getLanguage()));
            }
        }    
        
        
        
        
        if(currentRoom.getShortDescription() == Text.MAINROOM.checkLanguage(Settings.getLanguage())){
            if (inventory.contains(present)){
                int index = inventory.indexOf(present);
                if  (inventory.get(index).item_getAmount() == 4)
                {
                    currentRoom.getCharacter().changeCharacterText(Text.SAVEDCHRISTMAS.checkLanguage(Settings.getLanguage()));
                }
            }
        }
        if (npc2.getCharacterQuestion() != null){
            if(npc2.getStatus() == 0){
            askForAnswer(npc2.getCharacterQuestion(),npc2.getCharacterAnswer());
            npc2.setStatus(1);
            }
            else
            {
              System.out.println(Text.COMPLETED.checkLanguage(Settings.getLanguage()));
            }
        }
    }

    /**
     * Scans userinput and checks if answer corresponds with the correct answer.
     * @param question - is used to print the question, that the ncp has
     * @param answer - the answer, if the player's answer is similar to this one, the puzzle is solved.
     */
    private void askForAnswer(String question,Integer answer){
        Scanner input = new Scanner(System.in);
        System.out.print(question + Text.YOURANSWER.checkLanguage(Settings.getLanguage()));
        if (input.hasNextInt()){ 

            int number = input.nextInt();
            System.out.println(Text.YOUENTERED.checkLanguage(Settings.getLanguage()) + number);
            if (number == answer){
                System.out.println(Text.CORRECTANSWER.checkLanguage(Settings.getLanguage()));
                if(currentRoom.getCharacter().getCharacterItem() != null){
                    if (inventory.contains(present))
                            {present.item_increaseAmount();}
                    else{inventory.add(present);} 
                    System.out.println(Text.RECEIVED.checkLanguage(Settings.getLanguage()) + currentRoom.getCharacter().getCharacterItem().item_getName() + "!");
                }else{
                    System.out.println(Text.CHARNOITEM.checkLanguage(Settings.getLanguage()));
                }

            }
            else{
                System.out.println(Text.INCORRECT.checkLanguage(Settings.getLanguage()));
            }
        }
        else{
            System.out.println(Text.ANSWERNUMBER.checkLanguage(Settings.getLanguage()));
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
            System.out.println(Text.GOBACKTOOFAR.checkLanguage(Settings.getLanguage()));
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
            System.out.println(Text.QUITWHAT.checkLanguage(Settings.getLanguage()));
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

    /**
     * Lets the user see his input, used for the language selection at the start of the game.
     */
    private void getSelectedLanguage(){
        System.out.println(language);
    }
}
