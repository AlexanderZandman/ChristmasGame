
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
    MAINROOM("in the main entrance room.\nSanta is crying in the corner",
    "in de algemene kamer, de kerstman zit in de hoek te huilen"),
    WATERPUZZLEROOM("in a puzzle room.\n you see a table with " +
    "containers and a sink.\n An Elf is standing in front of you",
    "in een puzzel room. \n je ziet een tafel met bakjes en een kraan. \n een Elf staat voor je"),
    KEYROOM("You enter a dark room, in front of you are a few boxes illuminated by a small fire.\n What could these boxes contain?\n An Elf stands by the boxes, try talking to him (talk_to Elf) for more information",
    "Je stapt een donkere kamer binnen, voor je staan een paar dozen verlicht door een klein vuur.\n Wat zou er in deze dozen zitten?\n Een Elf staat bij de dozen, probeer met hem te praten (praat_met Elf) voor meer informatie"),
    SLEEPING_ELF_ROOM("You are in a dim room.\nYou see a table with " + 
    "some ingredients and a paper.\nThere is a fat elf sleeping in the corner, maybe you should wake him up?\n\n" +
    "The paper on the table says:\nTo wake up a sleeping Elf, pick his favourite food, and make him smell it himself\n" + 
    "The elf's favourite is green, but what you eat is red, and what you spit out is black.\n\n" +
    "On the table the are: Peas, Kiwi, Chili, Watermelon, Beans. \n" +
    "Pickup one of the items (use command pickup) to give it to make the elf smell it",
    "Je bent in een donkere kamer.\nVoor je staat een tafel met eten en een papiertje.\n" +
    "Er ligt een dikke Elf te slapen, misschien moet je hem wakker maken.\n\n" +
    "Op het papiertje staat:\n"  +
    "Om een elf wakker te maken, moet je hem verblijden met zijn favouriete geuren en smaken\n" +
    "De lieveling van de Elf is groen, maar als je het eet is het rood, en wat je uitspuugt is zwart.\n\n"+
    "Op tafel liggen: Erwten, Kiwi, Chili, Watermeloen, Bonen\n"+
    "Pak iets van tafel (met command pakop) om het aan de elf te geven"),
    MATHROOM("You are in math classroom. There is an elf, who is dressed like a teacher, standing behind a desk.\nYou can try talking to the elf with the command talk_to Elf",
    "Je bent in een wiskunde klaslokaal. Er staat een elf, die verkleed is als een leraar, bij een bureau.\n Je kunt proberen te praten met de elf doormiddel van het commando praat_met Elf"),
    TABLE_ORDER_ROOM("You are in a room, a table stand infront of you.\nThe table contains some supplies, and an elf is standing infront of them.\nUse the talk_to Elf command for more information.", 
    "Je bent in een kamer, voor je staat een tafel.\nOp de tafel liggen er wat spullen, er staat een elf voor de tafel.\nGebruik het praat_met Elf commando voor meer informatie"),
    UPSTAIRSROOM("Upstairs Room",
    "Boven kamer"),
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

    LIVES2(" Lives left"," Levens over"),

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
    
    BAGNAME("Bag of Presents", "Zak voor Cadeautjes"),
    
    BAGDESCRIPTION("An empty bag that can be filled with presents", "Een lege zak die met cadeautjes gevuld kan worden"),
    
    PRESENTNAME("Present", "Cadeautje"),
    
    PRESENTDESCRIPTION("It is one of the missing presents", "Het is één van de vermiste cadeautjes"),

    SWORDROOM("You walk inside of a mysterious room. In front of you is a sleigh with a sword pierced through it." +
    "\nThe sword appears to be made out of Candy Canes?\n" +
    "Use the pickup CandyCaneSword command to retreive the sword",
    "Je loopt in een geheimzinnige kamer. Voor je is een slee met een zwaard erdoorheen gestoken.\n" +
    "Het zwaard lijkt van zuurstokken gemaakt te zijn?\n" +
    "Gebruik het pak_op CandyCaneSword commando om het zwaard op te pakken"),
    
    EXITS("Exits: ","Uitgangen: "),
    
    QUITWHAT("Type 'quit' to quit","typ 'afsluiten', om te stoppen"),
    
    ELFWAKES("The elf seems to notice the smell of the watermelon...\n" +
    "The elf slowly wakes up!\nNow that you come to think about it," +
    "watermelons don't have such a distinctive smell..\nThese elves sure are magical creatures!\n",
    "De elf lijkt de geur van de watermeloen op te pakken...\n" +
    "Hij wordt langzaam wakker!\nNu je er even over nadenkt," +
    "watermeloenen hebben helemaal geen sterke geur...\nDeze elven zijn echt magisch!\n"),
    
    ELFTALKS("Elf: Thanks for waking me up!\nI was supposed to deliver this present to Santa," +
    "but I got so tired*yawns*\nWould you take it to Santa for me?\nI am gonna take a little nap...",
    "Elf: Dankjewel dat je me wakker hebt gemaakt!\nIk zou dit cadeautje naar de Kerstman moeten brengen," +
    "maar ik was zo moe...\nZou jij het cadeautje naar hem willen brengen?\nDan ga ik nog even een dutje doen..."),
    
    ELFANNOYED("The elf seems annoyed.\nHe swings with his arm and manages to hit you!\nYou lose one life",
    "De elf lijkt geïrriteerd.\nHij zwaait met zn arm en krijgt het voor elkaar je in je gezicht te slaan!"+
    "Je verliest een leven"),
    
    CANTFINDITEM("You cannot find that item in this room.",
    "Dat voorwerp kan je niet vinden in deze kamer."),
    
    ADDPRESENT("You have received a Present!",
    "Je hebt een cadeautje ontvangen!"),
    
    CCSNAME("CandyCaneSword", "ZuurStokZwaard"),
    
    CCSDESCRIPTION("The mighty CandyCaneSword! You can use this to slay the evil Grinch", 
    "De machtige ZuurStokZwaard! Je kunt het gebruiken om de kwaadaardige Grinch te verslaan"),
    
    GRINCHTEXT("So, you have finally found me", "Dus, je hebt mij eindelijk gevonden"),
     
    ORDERELFQUESTION("We need to find cleaning supplies. \n" +
            "There are 4 statements to help find the right bottle:\n" +
            "1.  Olive oil is directly left of Acid.\n" +
            "2.  Acid is next to Water.\n" +
            "3.  Gluh wine is directly right of Cleaning supplies\n" +
            "4.  Olive oil is opposite Gluh wine.\n" +
            "----At which position are the cleaning supplies?----\n" +
            "far left = 1 \nmiddle left = 2 \nmiddle = 3 \nmiddleright = 4 \nfar right = 5",
            "We moeten schoonmaak spullen vinden. \n" + 
            "Er zijn 4 stellingen die mij kunnen helpen om de jusite fles te vinden:\n" +
            "1.  Olijfolie is direct links van Zuur.\n" +
            "2.  Zuur zit naast Water.\n" +
            "3.  Gluhwijn is direct rechts van de Schoonmaak spullen" +
            "4.  Olijf olie is in tegengestelde richting van Gluhwijn.\n" +
            "----Op welke positie zitten de schoonmaak spullen?----\n" +
            "helemaal links = 1 \nmidden links = 2 \nin het midden = 3 \nmiddenrechts = 4 \nhelemaal rechts = 5"),
    
    ORDERELFTEXT("I need to find the right bottle to clean up this mess!\n" + "Santa told me which bottle to use, but i can't figure it out, would you help me please?",
    "Ik moet de juiste fles vinden om deze rotzooi op te ruimen!\n " + "De kerstman heeft mij verteld welke fles ik moest gebruiken, maar ik snap re niks van, zou jij mij willen helpen alsjeblieft?"),
    
    KEYELFTEXT("I can't seem to find the key.\nThese five boxes contain items, one of them is the hidden key!\nBut the others could be traps,\nI am too afraid to open them, you have to open them for me!\nUse the pickup command, and choose between Item1, Item2, Item3, Item4 and Item5.",
    "Ik kan nergens de sleutel vinden.\nDeze vijf dozen bevatten voorwerpen, een van die voorwerpen is de verstopte sleutel!\nMaar de anderen kunnen vallen zijn\nIk ben te bang om ze open te maken, jij moet het voor mij doen\nGebruik het pak_op commando en kies tussen Item1, Item2, Item3, Item4 en Item5."),
    
    MATHELFTEXT("Please help me solve this math puzzle!\n", "Alsjeblieft help mij met deze wiskunde puzzel\n"),
    
    MATHELFQUESTION("Santa has to visit 2400 houses where he delivers presents.\nEach house contains three children. Every child receives amount of houses divided by 400 in gifts.\nHow many gifts does Santa have to deliver in total? \n",
    "De kerstman moet bij 2400 huizen cadeautjes bezorgen.\nPer huis zijn er 3 kinderen. Elk kind krijgt het aantal huizen gedeeld door 400 aan cadeaus.\nHoeveel cadeaus worden er in totaal door de kerstman bezorgd? \n"),
    
    SANTANAME("Santa", "de Kerstman"),
  
    SANTADESCRIPTION("The Grinch has stolen all of the presents, please kind stranger, help me save Christmas",
    "De Grinch heeft alle cadeautjes gestolen, alsjeblieft vreemdeling, help mij om kerstmis te redden");
    
    
    

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
