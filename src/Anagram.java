import java.util.*;

/**
 * @author Yueyang Zhou
 * Time: 2019/08/01 16:45
 * Created with IntelliJ IDEA
 */

public class Anagram {

    private HashMap<String, ArrayList<String>> dictionaryMap;
    private HashSet<String> testSet;

    /**
     * Create an anagram dictionary from the list of words given in the file
     * indicated by fileName.
     * PRE: The strings in the file are unique.
     *
     * @param dictPath the name of the file to read from
     */
    public Anagram(String dictPath) {
        dictionaryMap = new DictionaryMap(dictPath).getMap();
    }

    /**
     * Get anagrams of all char set in test file.
     *
     * @param testPath test file path
     */
    public void getAnagrams(String testPath) {
        testSet = new Reader(testPath).readFile();
        findAnagram();
    }

    /**
     * Get anagrams by given single char set.
     *
     * @param s given char set (as string)
     */
    public void getSingleWordAnagrams(String s) {
        System.out.println("Anagram of " + s + ": " + dictionaryMap.get(GenerateKey.generateKey(s)));
    }

    /**
     * Print all anagrams by given test file.
     */
    private void findAnagram() {
        for (String s : testSet) {
            System.out.println("Anagram of " + s + ": " + dictionaryMap.get(GenerateKey.generateKey(s)));
        }
    }
}
