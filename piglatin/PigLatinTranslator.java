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

    // Check if input is only whitespace
    if (input.trim().isEmpty()) {
        return "";
    }

    // Extract trailing symbols
    int lastLetterIndex = input.length();
    for (int i = input.length() - 1; i >= 0; i--) {
        if (Character.isLetter(input.charAt(i))) {
            lastLetterIndex = i + 1;
            break;
        }
    }
    String wordOnly = input.substring(0, lastLetterIndex);
    String symbols = input.substring(lastLetterIndex);

    // Check capitalization patterns
    boolean allCaps = wordOnly.equals(wordOnly.toUpperCase());
    boolean hasAnyCaps = !wordOnly.equals(wordOnly.toLowerCase());

    // Find first vowel position
    int firstVowelPos = 0;
    for (int i = 0; i < wordOnly.length(); i++) {
        char c = Character.toLowerCase(wordOnly.charAt(i));
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
            firstVowelPos = i;
            break;
        }
    }

    // Build result
    String result;
    if (firstVowelPos == 0) {
        // Starts with vowel
        result = wordOnly + "ay";
    } else {
        // Move consonants to end
        String remaining = wordOnly.substring(firstVowelPos);
        String consonants = wordOnly.substring(0, firstVowelPos);
        
        // Capitalize first letter if original had any caps (and not all caps)
        if (hasAnyCaps && !allCaps) {
            remaining = Character.toUpperCase(remaining.charAt(0)) + remaining.substring(1);
        }
        
        // Lowercase moved consonants (unless all caps)
        if (!allCaps) {
            consonants = consonants.toLowerCase();
        }
        
        result = remaining + consonants + "ay";
    }

    // Apply all-caps formatting
    if (allCaps) {
        result = result.substring(0, result.length() - 2).toUpperCase() + "ay";
    }

    return result + symbols;
}    
}
        
        

   


    


