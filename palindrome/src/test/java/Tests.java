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

    assertEquals(exp1, DialogueParser.sentenceToWords("HackforImpact is cool, I'd like to join!"));
  }

  @Test
  void getPalindromesTests() {
    String[] input = { "Hey Bob" };
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList(new String[] { "bob" }));

    assertEquals(expected, DialogueParser.getPalindromes(Arrays.asList(input)));

    // TODO 1.5: add more test cases!
  }

  @Test
  void countPalindromesTests() {
    String[] input1 = { " ", " ", " " };
    int[] expected1 = new int[] { 0, 0 };
    assertArrayEquals(expected1, DialogueParser.countPalindromes(Arrays.asList(input1)));

    String[] input2 = { "Wow, Bob!", "What's up, Anna?", "there's a racecar on your kayak!", "LOL!" };
    int[] expected2 = new int[] { 6, 3 };
    assertArrayEquals(expected2, DialogueParser.countPalindromes(Arrays.asList(input2)));

    String[] input3 = {};
    int[] expected3 = new int[] { 0, 0 };
    assertArrayEquals(expected3, DialogueParser.countPalindromes(Arrays.asList(input3)));

  }

}
