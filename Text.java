
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
    KEYROOM("You enter a dark room, in front of you are a few boxes illuminated by a small fire. What could these boxes contain? An Elf stands by the boxes, try talking to him (talk_to Elf) for more information",
    "Je stapt een donkere kamer binnen, voor je staan een paar dozen verlicht door een klein vuur. Wat zou er in deze dozen zitten? Een Elf staat bij de dozen, probeer met hem te praten (praat_met Elf) voor meer informatie"),
    SLEEPING_ELF_ROOM("in a dark room.\n You see a table with " + 
        "some ingredients and a paper.\n There is a fat elf sleeping(SleepingElf) in the corner",
        "in een donkere kamer. Voor je staat een tafel met ingrediënten en een stuk papier.\n Er slaapt een dikke Elf in de hoek"),
    MATHROOM("in math classroom. There is an elf, who is dressed like a teacher, standing behind a desk. You can try talking to the elf with the command talk_to Elf",
    "in een wiskunde klaslokaal. Er staat een elf, die verkleed is als een leraar, bij een bureau. Je kunt proberen te praten met de elf doormiddel van het commando praat_met Elf"),
    TABLE_ORDER_ROOM("Yeet", "Yeet"),
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
    COMMANDSHOW("show", "bekijk");
    
    
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
