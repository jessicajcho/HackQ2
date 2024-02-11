import q2java.DialogueParser;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Tests {

  @Test
  void isPalindromeTest() {
    assertTrue(DialogueParser.isPalindrome("bob"));
    assertTrue(DialogueParser.isPalindrome("racecar"));
    assertFalse(DialogueParser.isPalindrome("race car"));
    assertFalse(DialogueParser.isPalindrome("taco"));
  }

  @Test
  void sentenceToWordsTest() {
    String[] arr = { "hackforimpact", "is", "cool", "i", "d", "like", "to", "join" };
    List<String> exp1 = Arrays.asList(arr);

    assertEquals(DialogueParser.sentenceToWords("HackforImpact is cool, I'd like to join!"), exp1);
  }

  @Test
  void getPalindromesTests() {
    String[] input = { "Hey Bob" };
    String[] expected = { "bob" };
    assertEquals(DialogueParser.getPalindromes(Arrays.asList(input)), Arrays.asList(expected));

    // TODO 1.5: add more test cases!
  }

  @Test
  void countPalindromesTests() {
    String[] input1 = { " ", " ", " " };
    int[] expected1 = new int[] { 0, 0 };
    assertArrayEquals(DialogueParser.countPalindromes(Arrays.asList(input1)), expected1);

    String[] input2 = { "Wow, Bob!", "What's up, Anna?", "there's a racecar on your kayak!", "LOL!" };
    int[] expected2 = new int[] { 6, 3 };
    assertArrayEquals(DialogueParser.countPalindromes(Arrays.asList(input2)), expected2);

    String[] input3 = {};
    int[] expected3 = new int[] { 0, 0 };
    assertArrayEquals(DialogueParser.countPalindromes(Arrays.asList(input3)), expected3);

  }

}
