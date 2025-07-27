package MapProblems;

import java.util.HashMap;

public class WordCountProblem {
    public static HashMap<String, Integer> solveWordCount(String[] wordInput) {
        HashMap<String, Integer> WordCountMap = new HashMap<>();

        for (String word : wordInput) {
            String LowerCaseWord = word.toLowerCase();
            WordCountMap.put(LowerCaseWord, WordCountMap.getOrDefault(LowerCaseWord, 0) + 1);
        }
        return WordCountMap;
    }
}