
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
    "in de hoofdkamer, de kerstman zit in de hoek te huilen"),
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
    UPSTAIRSROOM("Upstairs Room, there seems to be nothing here but a locked door. I should probably go find a key",
    "Boven kamer, er is hier niks behalve een gesloten deur. Ik moet waarschijnlijk ergens een sleutel gaan zoeken"),
    BONUSROOM("You set foot in the room,\n\nan ominous aura is emitting from something directly in front of you.\n\n" + 
    "As you walk closer you begin to see where the aura is coming from.\n\n"+ 
    "It is the Grinch! You have to defeat him to retreive the last present\n",
    "Je stapt de kamer binnen,\ner wordt een onheilspellende aura uitgestraald van iets wat recht voor je is.\n" +
    "Het is de Grinch! Je moet hem verslaan om het laatste cadeautje te bemachtigen"),
    
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

    NORTH("North","Noord"),

    WEST("West","West"),

    SOUTH("South","Zuid"),

    EAST("East","Oost"),

    UP("Up","Omhoog"),

    DOWN("Down","Omlaag"),
    
    DONTKNOW("I dont know what you mean.\nUse the command [show] to see the directions you can go",
    "Ik weet niet wat je bedoelt.\nGebruik het commando [bekijk] om te zien welke richtingen je op kunt"),

    THANKS("Thank you for playing.  Good bye.",
    "Bedankt voor het spelen. Tot ziens." ),
    UNKNOWN("I don't know what you mean...","Ik begrijp je niet..."),
    
    GOWHERE("Go where?", "Waar wil je heen?"),

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
    
    STRENGTH1("Your strength has increased drastically, ", "Je kracht is enorm gegroeid "),
    
    STRENGTH2("you feel so strong, you could possibly even move boulders", "Je voelt je zo sterk, je zou zelfs rotsen kunnen verschuiven"),
    
    GAMEOVER("Game over, you ran out of lives", "Spel voorbij, je levens zijn op"),
    
    CONGRATULATIONS("Congratulations, you have finished the game!\nFeel free to replay the game whenever you want", 
    "Gefeliciteerd, je hebt het spel uitgespeeld!\nJe bent welkom om het spel wanneer je maar wilt, opnieuw te spelen"),
    
    PICKEDUP("You have picked up ", "Je hebt opgepakt "),
    
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
    
    GRINCHFIGHT1("You hit the Grinch for 1 damage!", "Je hebt de Grinch geraakt voor 1 levenspunt"),
    
    GRINCHFIGHT2("He has ", "Hij heeft "),
    
    GRINCHFIGHT3(" remaining", " over"),
    
    GRINCHFIGHT4("The Grinch retaliated!", "De Grinch sloeg terug!"),
    
    GRINCHFIGHT5("You have been hit for 1 life", "Je bent geraakt voor 1 leven"),
    
    GRINCHFIGHT6("You have ", "Jij hebt"),
    
    GRINCHFIGHT7(" remaining", " over"),
    
    GRINCHDEF1("You have defeated the Grinch!", "Je hebt de Grinch verslagen!"),
    
    GRINCHDEF2("Upon his defeat he has dropped the final present!", "Toen hij verslagen werd, heeft hij het laatste cadeautje laten vallen!"),
    
    GRINCHDEF3("Use the [pickup Present] command to pick it up", "Gebruik het [pakop Cadeautje] commando om het op te pakken"),
    
    GRINCHDEF4("After you have picked up the final present, go back to the main room and deliver the presents to Santa.", 
    "Na dat je het cadeautje hebt, kun je terugkeren naar de hoofd kamer en de cadeautjes aan de kerstman geven"),
    
    EXITS("Exits: ","Uitgangen: "),
    
    QUITWHAT("Type 'quit' to quit","typ 'afsluiten', om te stoppen"),
    
    NODOOR("There is no door!", "Daar is geen deur!"),
    
    UNLOCKDOOR("You have unlocked the door!", "Je hebt de deur geopend!"),
    
    LOCKEDDOOR("The door is locked! You need a key", "De deur zit op slot! Je hebt een sleutel nodig"),
    
    BOULDER1("You have moved the boulder!", "Je hebt de rots verplaatst!"),
    
    BOULDER2("You are not strong enough to move the boulder.\nMaybe you can look in the room, where you found the key, for some sort of candy?", 
    "Je bent niet sterk genoeg om de rots te verplaatsen.\nMisschien is er in de kamer, waar je de sleutel gevonden hebt, voor een soort snoepgoed?"),
    
    CANTTALK("This person cannot talk", "Dit personage kan niet praten"),
    
    YOURANSWER("\nYour answer: ", "\nJouw antwoord: "),
    
    YOUENTERED("You entered ", "Jij hebt ingevuld "),
    
    CORRECTANSWER("That's the correct answer\n", "Dat is het juiste antwoord\n"),
    
    CHARNOITEM("Sorry this character does not have an item for you", "Sorry dit character heeft geen item evoor jou"),
    
    COMPLETED("already completed", "al voltood"),
    
    NOTINROOM("This character is not in this room", "Dit karakter is niet in deze kamer"),
    
    INCORRECT("No, that is incorrect.\nTalk to me once more to try again", "Nee, dat is fout.\nPraat nog een keer met mij om het opnieuw te proberen"),
    
    ANSWERNUMBER("Your answer must be a number." +
                "\nTalk to me once more to try again",
                "Jouw antwoord moet een getal zijn." +
                "\nPraat nogmaals met mij om het opnieuw te proberen"),
                
    GOBACKTOOFAR("This is where you started, you cannot go back" + 
                " any further!",
                "Dit is waar je begon, je kunt niet verder terug!"),
    
    RECEIVED("You have received ", "Je hebt gekregen "),
    
    SAVEDCHRISTMAS("You did it, you saved Christmas!", "Het is je gelukt, je hebt Kerstmis gered!"),
    
    ELFWAKES("The elf seems to notice the smell of the watermelon...\n" +
    "The elf slowly wakes up!\nNow that you come to think about it," +
    "watermelons don't have such a distinctive smell..\nThese elves sure are magical creatures!\n",
    "De elf lijkt de geur van de watermeloen op te pakken...\n" +
    "Hij wordt langzaam wakker!\nNu je er even over nadenkt," +
    "watermeloenen hebben helemaal geen sterke geur...\nDeze elven zijn echt magisch!\n"),
    
    ELFTALKS("Elf: Thanks for waking me up!\nI was supposed to deliver this present to Santa," +
    "but I got so tired*yawns*\nWould you take it to Santa for me?\nI am gonna take a little nap and eat this watermelon...",
    "Elf: Dankjewel dat je me wakker hebt gemaakt!\nIk zou dit cadeautje naar de Kerstman moeten brengen," +
    "maar ik was zo moe...\nZou jij het cadeautje naar hem willen brengen?\nDan ga ik nog even een dutje doen en deze watermeloen opeten..."),
    
    ELFANNOYED("The elf seems annoyed.\nHe swings with his arm and manages to hit you!\nYou lose one life",
    "De elf lijkt geïrriteerd.\nHij zwaait met zn arm en krijgt het voor elkaar je in je gezicht te slaan!"+
    "Je verliest een leven"),
    
    CANTFINDITEM("You cannot find that item in this room.",
    "Dat voorwerp kan je niet vinden in deze kamer."),
    
    NOSWORD("Oh no, you do not have a weapon! You quickly flee to the mainroom. Go to the armory upstairs to get a weapon", 
    "Oh nee, je hebt geen wapen! Je vlucht snel naar de hoofdkamer. Ga naar de wapenkamer boven om een wapen te halen."),
    ADDPRESENT("You have received a Present!",
    "Je hebt een cadeautje ontvangen!"),
    
    CCNAME("Candycane", "Zuurstok"),
    
    CCDESCRIPTION("A candycane! This could be useful for later :)","Een zuurstok! Dit kan handig zijn voor later :)"),
    
    CCSNAME("CandyCaneSword", "ZuurStokZwaard"),
    
    CCSDESCRIPTION("The mighty CandyCaneSword! You can use this to slay the evil Grinch", 
    "De machtige ZuurStokZwaard! Je kunt het gebruiken om de kwaadaardige Grinch te verslaan"),
    
    GRINCHTEXT("So, you have finally found me, but you will not get this last present from me.\n\nYou will have to defeat me for it.\n\n" + 
    "(Use attack to fight the Grinch)\n", 
    "Dus, je hebt mij eindelijk gevonden, maar ik geef je krijgt dit laatste cadeautje niet.\n\nJe zult me moeten verslaan om het te krijgen.\n\n" + 
    "(Gebruik het commando val_aan om met de Grinch te vechten)"),
    
    WHATITEM("What item do you want to use?", "Welk item wil je gebruiken?"),
     
    ORDERELFQUESTION("We need to find cleaning supplies. \n\n" +
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
            "4.  Olijf olie is in tegengestelde positie van Gluhwijn.\n" +
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
    "De Grinch heeft alle cadeautjes gestolen, alsjeblieft vreemdeling, help mij om kerstmis te redden"),
    
    FOUNDKEY("You have found the key!","Je hebt de sleutel gevonden!"),
    
    FOUNDCANDYCANE("You have found a candy cane! This could be usefull for later...",
    "Je hebt een zuurstok gevoden, misschien kan dit nog pas komen");
    
    

    private String NederlandsText, EnglishText;

    private Text(String EnglishText, String NederlandsText) {
        this.NederlandsText = NederlandsText;
        this.EnglishText = EnglishText;
    }

    public String checkLanguage(int language){
        if (Settings.getLanguage() == 0){
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
