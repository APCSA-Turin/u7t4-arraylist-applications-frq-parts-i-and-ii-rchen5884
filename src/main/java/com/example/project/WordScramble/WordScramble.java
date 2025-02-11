package com.example.project.WordScramble;
import java.util.ArrayList;
public class WordScramble {
  /** Scrambles a given word.
   *
   *  @param word  the word to be scrambled
   *  @return  the scrambled word (possibly equal to word)
   *
   *  Precondition: word is either an empty string or contains only uppercase letters.
   *  Postcondition: the string returned was created from word as follows:
   *  - the word was scrambled, beginning at the first letter and continuing from left to right
   *  - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   *  - letters were swapped at most once
   */
  public static String scrambleWord(String word) {
    char[] chars = word.toCharArray();
    for (int i = 0; i < chars.length - 1; i++) {
        if (chars[i] == 'A' && chars[i + 1] != 'A') {
            // Swap chars[i] and chars[i + 1]
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
            // Skip the next index to prevent further swaps
            i++;
        }
    }
    return new String(chars);
}
  /** Modifies wordList by replacing each word with its scrambled
   *  version, removing any words that are unchanged as a result of scrambling.
   *
   *  @param wordList the list of words
   *
   *  Precondition: wordList contains only non-null objects
   *  Postcondition:
   *  - all words unchanged by scrambling have been removed from wordList
   *  - each of the remaining words has been replaced by its scrambled version
   *  - the relative ordering of the entries in wordList is the same as it was
   *    before the method was called
   */
  public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList) {
    ArrayList<String> result = new ArrayList<>();
    for (String word : wordList) {
        String scrambled = scrambleWord(word);
        if (!scrambled.equals(word)) {
            result.add(scrambled);
        }
    }
    return result;
}
}
