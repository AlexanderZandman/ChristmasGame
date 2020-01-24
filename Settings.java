
/**
 * Write a description of class settings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Settings
{
    
    private static int languagePref;
    /**
     * Sets the language
     * @param langauge - 0 for english, 1 for dutch
     */
    public static void setLanguage(int language){
        languagePref = language;
    }
    /**
     * Retrieves the language
     */
    public static int getLanguage(){
        return /*this.*/languagePref;
    }
}
