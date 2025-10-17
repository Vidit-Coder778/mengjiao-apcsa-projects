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
    String result = "";
    String[] words = input.split(" ");
    
    for (int i = 0; i < words.length; i++) {
        result += translateWord(words[i]);
        if (i < words.length - 1) {
           result += " ";
        }
    }
    
    return result;
}

   
private static String translateWord(String input) {
    System.out.println("  -> translateWord('" + input + "')");

    String result = "";
    String first = input.substring(0, 1);

    boolean firstCap = Character.isUpperCase(input.charAt(0));
    boolean allCaps = input.equals(input.toUpperCase());

    if (first.equalsIgnoreCase("a") || first.equalsIgnoreCase("e") || 
        first.equalsIgnoreCase("i") || first.equalsIgnoreCase("o") || 
        first.equalsIgnoreCase("u") || first.equalsIgnoreCase("y")) {
        result = input + "ay";
    } else {
        String consonants = "";
        int i = 0;
        
        while (i < input.length()) {
            String letter = input.substring(i, i + 1);
            
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
    
    // Apply capitalization rules
    if (allCaps) {
        result = result.substring(0, result.length() - 2).toUpperCase() + "ay";
    } else if (firstCap) {
        result = result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
    }

    return result; 
}

        
        

   
}

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)


