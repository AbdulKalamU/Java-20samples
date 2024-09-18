import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count words in the sentence
        int wordCount = countWords(sentence);

        // Output the result
        System.out.println("The number of words in the sentence is: " + wordCount);

        scanner.close();
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        // Trim leading and trailing spaces and split the sentence into words
        String[] words = sentence.trim().split("\\s+");

        // Return the number of words
        return words.length;
    }
}