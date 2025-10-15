package piglatin;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();

        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }

    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        String result = "";

        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        result = translateWord(input);

        return result;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = "";
        String first = input.substring(0,1);
        if (first.equalsIgnoreCase("a")|| first.equalsIgnoreCase("e") || first.equalsIgnoreCase("i") || first.equalsIgnoreCase("o") || first.equalsIgnoreCase("u") || first.equalsIgnoreCase("y"))
        {
            result = input + "ay";
        }
        else {
    String consonants = "";
    int i = 0;
    
    while (i < input.length()) {
        String letter = input.substring(i, i+1);
        
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || 
            letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || 
            letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("y")) {
            break;
        }
        
        consonants = consonants + letter;
        i++;
    }
    
    result = input.substring(i) + consonants.toLowerCase() + "ay";
    }

}


        
        

        return result;
}

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)


