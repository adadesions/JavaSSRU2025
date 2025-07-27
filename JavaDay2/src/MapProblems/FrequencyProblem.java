package MapProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyProblem {

    public static HashMap<Integer, Integer> solveFrequencyProblem(int[] inputArray) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : inputArray) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }
}
