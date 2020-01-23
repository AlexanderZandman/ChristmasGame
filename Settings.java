
/**
 * Write a description of class settings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Settings
{
    
    int languagePref;
    /**
     * Sets the language
     * @param langauge - 0 for english, 1 for dutch
     */
    public void setLanguage(int language){
        this.languagePref = language;
    }
    /**
     * Retrieves the language
     */
    public int getLanguage(){
        return /*this.*/languagePref;
    }
}
