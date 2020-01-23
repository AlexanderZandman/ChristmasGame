
/**
 * Enumeration class text - Class to write text in both english and dutch.
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Text{
    WELCOME("Welcome to The Saving of Christmas!\n" +
    "To complete this game, you will have to complete puzzles to save Santa\n" +
    "Type '" + CommandWord.HELP + "' if you need help.",
    "Welkom bij 'The Saving of Christmas'\n" +
    "In dit spel, moet je de kerstman helpen om puzzels op te lossen!\n" +
    "Typ '" + CommandWord.HELP + "' als je hulp nodig hebt"),
    MAINROOM("in the main entrance room.\n Santa is crying in the corner",
    "in de algemene kamer, de kerstman zit in de hoek te huilen"),
    WATERPUZZLEROOM("in a puzzle room.\n you see a table with " +
    "containers and a sink.\n An Elf is standing in front of you",
    "in een puzzel room. \n je ziet een tafel met bakjes en een kraan. \n een Elf staat voor je"),
    KEYROOM("You enter a dark room, in front of you are a few boxes illuminated by a small fire.\n What could these boxes contain?\n An Elf stands by the boxes, try talking to him (talk_to Elf) for more information",
    "Je stapt een donkere kamer binnen, voor je staan een paar dozen verlicht door een klein vuur.\n Wat zou er in deze dozen zitten?\n Een Elf staat bij de dozen, probeer met hem te praten (praat_met Elf) voor meer informatie"),
    SLEEPING_ELF_ROOM("You are in a dimm room.\nYou see a table with " + 
    "some ingredients and a paper.\nThere is a fat elf sleeping in the corner, maybe you should wake him up?\n" +
    "The paper on the table says:\nTo wake up a sleeping Elf, pick his favourite food, and make him smell it himself\n" + 
    "The elf's favourite is green, but what you eat is red, and what you spit out is black.\n" +
    "On the table the are: Peas, Kiwi, Chili, Watermelon, Beans. \n" +
    "Pickup one of the items (use command pickup) to give it to make the elf smell it",
    "Je bent in een donkere kamer.\nVoor je staat een tafel met eten en een papiertje.\n" +
    "Er ligt een dikke Elf te slapen, misschien moet je hem wakker maken\n" +
    "Op het papiertje staat:\n"  +
    "Om een elf wakker te maken, moet je hem verblijden met zijn favouriete geuren en smaken\n" +
    "De lieveling van de Elf is groen, maar als je het eet is het rood, en wat je uitspuugt is zwart\n"+
    "Op tafel liggen: Erwten, Kiwi, Chili, Watermeloen, Bonen\n"+
    "Pak iets van tafel (met command pakop) om het aan de elf te geven"),
    MATHROOM("in math classroom. There is an elf, who is dressed like a teacher, standing behind a desk.\n You can try talking to the elf with the command talk_to Elf",
    "in een wiskunde klaslokaal. Er staat een elf, die verkleed is als een leraar, bij een bureau.\n Je kunt proberen te praten met de elf doormiddel van het commando praat_met Elf"),
    TABLE_ORDER_ROOM("in a room, a table stand infront of you.\n The table contains some supplies, and an elf is standing infront of them.\n Use the talk_to Elf command for more information.", 
    "in een kamer, voor je staat een tafel.\n Op de tafel liggen er wat spullen, er staat een elf voor de tafel.\n Gebruik het praat_met Elf commando voor meer informatie"),
    UPSTAIRSROOM("Upstairs Room",
    "Boven kamer"),
    MINEFIELDROOM("in a traproom, proceed carefully as there are mines layed out in this room",
    "in een valkamer, let op je elke stap! Er zijn overal mijnen in deze kamer"),
    ROOMDESCRIPTION("You are ",
    "Je bent "),
    COMMANDGO("go", "ga"),

    COMMANDQUIT("quit", "stop"),

    COMMANDHELP("help", "hulp"),

    COMMANDTALK("talk_to", "praat_met"),

    COMMANDBACK("back", "terug"),

    COMMANDINVENTORY("inventory", "inventaris"),

    COMMANDPICKUP("pickup", "pakop"),

    COMMANDSHOW("show", "bekijk"),

    NORTH("north","noord"),

    WEST("west","west"),

    SOUTH("south","zuid"),

    EAST("east","oost"),

    UP("up","omhoog"),

    DOWN("down","omlaag"),

    THANKS("Thank you for playing.  Good bye.",
    "Bedankt voor het spelen. Tot ziens." ),
    UNKNOWN("I don't know what you mean...","Ik begrijp je niet..."),

    LIVES1("You have ","Je hebt "),

    LIVES2("Lives left ","Levens over "),

    INVENTORYEMPTY("Your inventory is empty","Je inventaris is leeg"),

    ITEMNAME("Item Name: ","Naam voorwerp: "),

    ITEMDESC("Description: ", "Omschrijving: "),

    ITEMAMOUNT("Amount: ", "Aantal"),

    SHOWROOMITEM("These items are in this room: ",
    "Deze voorwerpen bevinden zich in deze kamer"),
    SHOWROOMCHAR("This character is in this room: ",
    "Dit character is in deze kamer: "),
    PICKUPERROR("What item do you want to pickup?"
    ,"Welk voorwerp wil je oppakken?"),
    TRAP("Oh no it's a trap","Oh nee, dat was een val"),

    FELLINTRAP("Oh no, you fell into a trap.\n You have lost one life",
    "Oh nee, je bent in een val getrapt.\n Je bent één leven verloren"), 
    KEY("Key", "Sleutel"),

    KEYDESCR("This key might be able to open a door...",
    "Misschien kan deze sleuten een deur openen..."),
    HELP("You are in Santa's Christmas Cave. Santa needs your help " + 
    " to find all the presents that the Grinch has stolen.\n\nYour command words are:",
    "Je bent in de Kerstman's Kerst Grot. De Kerstman heeft je hulp nodig!" +
    "Je moet alle cadeautjes terug vinden die de Grinch heeft gestolen!\n\nDe Command woorden zijn:"),
    PEAS("Peas","Erwten"),

    KIWI("Kiwi","Kiwi"),

    CHILI("Chili","Chili"),

    WATERMELON("Watermelon","Watermeloen"),

    BEANS("Beans","Bonen"),

    SWORDROOM("You walk inside of a mysterious room. In front of you is a sleigh with a sword pierced through it." +
    "\nThe sword appears to be made out of Candy Canes?\n" +
    "Use the pickup CandyCaneSword command to retreive the sword",
    "Je loopt in een geheimzinnige kamer. Voor je is een slee met een zwaard erdoorheen gestoken.\n" +
    "Het zwaard lijkt van zuurstokken gemaakt te zijn?\n" +
    "Gebruik het pak_op CandyCaneSword commando om het zwaard op te pakken");

    private String NederlandsText, EnglishText;

    private Text(String EnglishText, String NederlandsText) {
        this.NederlandsText = NederlandsText;
        this.EnglishText = EnglishText;
    }

    public String getNederlandsText() {
        return NederlandsText;
    }

    public String getEnglishText() {
        return EnglishText;
    }

    public String checkLanguage(int language){
        if (language == 0){
            return EnglishText;
        }
        if (language == 1){
            return NederlandsText;
        }
        else{
            return EnglishText;
        }

    }
}
