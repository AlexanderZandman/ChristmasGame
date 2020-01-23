/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
    
    GO("go","ga"), 
    QUIT("quit","afsluiten"), 
    HELP("help","hulp"), 
    UNKNOWN("?","?"), 
    TALK("talk_to","praat_met"),
    BACK("back","terug"), 
    INVENTORY("inventory","inventaris"), 
    PICKUP("pickup","pakop"), 
    SHOW("show","bekijk"),
    LIVES("lives","levens"),
    ATTACK("attack", "val_aan"),
    USE("use", "gebruik");
     

    
    // The command string.
    private String commandStringEN;
    private String commandStringNL;
    /**
     * Initialise with the corresponding command string.
     * @param commandString The command string.
     */
    CommandWord(String commandStringEN, String commandStringNL)
    {
        this.commandStringEN = commandStringEN;
        this.commandStringNL = commandStringNL;
    }
    
    /**
     * @return The command word as a string.
     */
    public String toString()
    {
        if (Game.userinput == 1){
            return commandStringNL;
        }
        else{
            return commandStringEN;
        }
    }
}
