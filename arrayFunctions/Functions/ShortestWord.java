package Functions;

public class ShortestWord {

    public static String findShortestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Sentence cannot be null or empty");
        }
        sentence = sentence.trim();         // Remove spaces at the beginning and end
        String[] words = sentence.split("\\s+");        // Divide the sentence into individual words
        String shortestWord = words[0];         // Assume the first word is the shortest
        for (int count = 1; count < words.length; count++) {
            if (words[count].length() < shortestWord.length()) {           // Compare the remaining words
                shortestWord = words[count];
            }
        }
        return shortestWord;
    }

    public static void printShortestWord(String sentence) {
        try {
            String result = findShortestWord(sentence);
            System.out.println("Shortest word: " + result);
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
    public static void main(String[] args) {
        printShortestWord("Java is a very interesting language");
    }
}