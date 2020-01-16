
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
        "Typ '" + CommandWord.HELP + "' als je hulp nodig hebt");

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
            return null;
        }
        
    }
}
