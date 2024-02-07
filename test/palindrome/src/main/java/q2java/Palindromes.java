package q2java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindromes {
  public static List<String> sentenceToWords(String text) {
    List<String> words = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\b[a-z]+\\b");
    Matcher matcher = pattern.matcher(text.toLowerCase());

    while (matcher.find()) {
      words.add(matcher.group());
    }

    return words;
  }

  public static boolean isPalindrome(String s) {
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
      while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
        i++;
      }
      while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
        j--;
      }

      if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
        return false;
    }
    return true;
  }

}
