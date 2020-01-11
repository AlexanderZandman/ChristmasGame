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
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
        prevRooms = new ArrayList();
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
        Item bag_of_presents = new Item("Bag of Presents", "An empty bag that can be filled with presents", 1, 1);
        Item present = new Item("Present", "It is one of the missing presents", 1, 1);
        
        // create the rooms
        Room mainroom = new Room("in the main entrance room.\n Santa is crying in the corner");
        Room waterpuzzleroom = new Room("in a puzzle room.\n you see a table with "+
        "containers and a sink.\n An Elf is standing in front of you");
        Room keyroom = new Room("Find the hidden key");
        Room sleeping_elf_room = new Room("in a dark room.\n You see a table with "+
        "some ingredients and a paper.\n There is a fat elf sleeping(SleepingElf) in the corner");
        Room mathroom = new Room("in math classroom. There is an elf, who is dressed like a teacher, standing behind a desk");
        Room table_order_room = new Room("");
        Room upstairsroom = new Room("Upstairs Room");
        Room minefieldroom = new Room("in a traproom, proceed carefully as there are mines layed out in this room");
        
        //add items, characters and exits to rooms
        
        //main room
        ArrayList<Item> main_items = new ArrayList<Item>();
        mainroom.setItem(main_items);
        
        santa = new Character("Santa", "I am santa and you better run, here is a Bag of Presents", bag_of_presents);         
        mainroom.setCharacter(santa);
        
        mainroom.setExit("east", waterpuzzleroom);
        mainroom.setExit("south", sleeping_elf_room);
        mainroom.setExit("up", upstairsroom);
        
        //waterpuzzle room
        ArrayList<Item> water_items = new ArrayList<Item>();
        Item container = new Item("Container","A container containing water",
        0,0);
        water_items.add(container);
        waterpuzzleroom.setItem(water_items);
        
        waterElf = new Character("Elf","Help me solve this puzzle, please!", null);
        waterElf.setCharacterQuestion("What is your favourite number?" , 69);
        waterpuzzleroom.setCharacter(waterElf);
        
        waterpuzzleroom.setExit("west", mainroom);
        waterpuzzleroom.setExit("south", keyroom);

        //sleepingelf room
        ArrayList<Item> sleeping_items = new ArrayList<Item>();
        Item recipe = new Item("Recipe","A recipe for some kind of soup, "+
        "the title says: How to wake up a sleeping elf",0,0);
        sleeping_items.add(recipe);
        sleeping_elf_room.setItem(sleeping_items);
        
        sleepingElf = new Character("SleepingElf","ZzZ... zZz...", null);
        sleeping_elf_room.setCharacter(sleepingElf);
        
        sleeping_elf_room.setExit("north",mainroom);
        sleeping_elf_room.setExit("west",mathroom);
        sleeping_elf_room.setExit("east",table_order_room);
        
        //minefield room
        Random r = new Random();
        ArrayList<Integer> savetiles = new ArrayList<Integer>();
        

        currentRoom = mainroom;
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to The Saving of Christmas!");
        System.out.println("To complete this game, you will have to complete puzzles to save Santa");
        System.out.println("Type '" + CommandWord.HELP + "' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }
    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {
            case UNKNOWN:
            System.out.println("I don't know what you mean...");
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
                pickupItem();
                break;

        }
        return wantToQuit;
    }
    private void showInventory()
    {
        if(inventory.size() < 1){
        System.out.println("Your inventory is empty");
        }else{
        for(Item item : inventory){
        String name = item.item_getName();
        String description = item.item_getDescription();
        int amount = item.item_getAmount();
        int weight = item.item_getWeight();
        System.out.println("Item name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Amount " + amount);
        System.out.println("Weight: " + weight);
        }
    }
    }
    private void pickupItem()
    {
        for(Item item : currentRoom.getItem()){
        inventory.add(item);
        System.out.println("You picked up " + item.item_getName());
        }
    }
    private void useItem()
    {
        
    }
    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
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
    private int getRandomNumber(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) +1) + min;
    }

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
                if(npc2.getCharacterItem() != null){
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
    
    private void askForAnswer(String question,Integer answer){
        Scanner input = new Scanner(System.in);
        System.out.print(question + "\nYour answer: ");
    	if (input.hasNextInt()){ 
    	    
    	    int number = input.nextInt();
    	    System.out.println("You entered " + number);
    	    if (number == answer){
    	        System.out.println("That's the correct answer");
    	    }
    	    else{
    	        System.out.println("No, that is incorrect");
    	    }
        }
        else{
            System.out.println("Your answer must be a number." +
            "\nTalk to me once more, to try again");
        }
    //}
    }

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
}
