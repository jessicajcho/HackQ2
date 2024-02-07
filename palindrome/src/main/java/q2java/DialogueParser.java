package q2java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DialogueParser {

  /**
   * Returns a list of words (in lowercase) that make up the text.
   * 
   * @param text - The input string to be broken up into words.
   * @return List<String> - A list of strings representing the words in the text.
   */
  public static List<String> sentenceToWords(String text) {
    List<String> words = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\W*(\\w+)\\W*");
    Matcher matcher = pattern.matcher(text.toLowerCase());

    while (matcher.find()) {
      words.add(matcher.group(1));
    }
    return words;
  }

  /**
   * Returns True if a string is a palindrome, False otherwise
   * 
   * @param s - Input word (contains only lowercase characters)
   * @return boolean
   */
  public static boolean isPalindrome(String s) {
    int end = s.length() - 1;
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(end)) {
        return false;
      }
      end--;
    }
    return true;
  }

  /**
   * Finds all (word level) palindromes in a diaologue between Anna & Bob
   * 
   * @param lst - list of sentences
   * @return List<List<String>> - a list of list containing all palindromes found
   *         in the sentences
   */
  public static List<List<String>> getPalindromes(List<String> lst) {
    // TODO 1
    throw new UnsupportedOperationException("Unimplemented");
  }

  /**
   * Counts number of (word level) palindromes each person (Anna, Bob) says
   * 
   * @param lst - list of strings (dialogue between the two)
   * @return int[] - 2-elem array (# of palindromes Anna said, # of palindromes
   *         Bob said)
   */
  public static int[] countPalindromes(List<String> lst) {
    // TODO 2
    throw new UnsupportedOperationException("Unimplemented");
  }

  /**
   * Encrypts input message to ASCII code
   * 
   * @param msg
   * @return int - Encrypted integer in ASCII code integers
   */
  public static int encrypt(String msg) {
    throw new UnsupportedOperationException("Unimplemented");
  }

  /**
   * Decrypts a list of ASCII code integers into a string of alphabetic characters
   * 
   * @param ciphertxt - integer in ASCII code integers
   * @return String - decrypted string of all-caps alphabet characters
   */
  public static String decrypt(int ciphertxt) {
    throw new UnsupportedOperationException("Unimplemented");
  }
}
