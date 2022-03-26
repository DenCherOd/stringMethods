package myStringMethods;

import java.util.Random;
import java.util.Scanner;

public class WordGame {
    private Random random;
    private Scanner scanner;
    private String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    
    public void startGame() {
        random = new Random();
        boolean isGuessed = false;
        int randomNumber = random.nextInt(words.length);
        String randomWord = words[randomNumber];
        while (!isGuessed) {
            String userWord = getStringFromUser();
            isGuessed = comparingWords(randomWord, userWord);
        }
    }
    
    private String getStringFromUser() {
        scanner = new Scanner(System.in);
        System.out.println("Попробуйте отгадать слово");
        return scanner.nextLine();
    }
    
    private boolean comparingWords(String correctWord, String userWord) {
        if (correctWord.equals(userWord)) {
            System.out.println("Correct");
            return true;
        } else {
            char promptArray[] = {'#', '#', '#', '#', '#', '#', '#', '#',
                    '#', '#', '#', '#', '#', '#', '#', };
            int lengthOfWord;
            if (correctWord.length() <= userWord.length()) {
                lengthOfWord = correctWord.length();
            } else {
                lengthOfWord = userWord.length();
            }
            for (int i = 0; i < lengthOfWord; i++) {
                if (correctWord.charAt(i) == userWord.charAt(i)) {
                    promptArray[i] = correctWord.charAt(i);
                }
            }
            System.out.println(promptArray);
            return false;
        }
    }
}
