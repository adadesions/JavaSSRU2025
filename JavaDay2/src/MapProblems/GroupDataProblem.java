package MapProblems;

import MyCollections.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupDataProblem {

    public static HashMap<String, List<String>> groupData(List<List<String>> inputData) {

        HashMap<String, List<String>> groupDataMap = new HashMap<>();

        for (List<String> words : inputData) {
            String groupName = words.get(0);
            String memberName = words.get(1);

            groupDataMap.computeIfAbsent(groupName, k -> new ArrayList<>()).add(memberName);
        }

        return groupDataMap;
    }

    public static HashMap<String, List<String>> solveGroupDataWithPair(List<Pair> inputData) {
        HashMap<String, List<String>> groupDataMap = new HashMap<>();

        for (Pair pair : inputData) {
            String groupName = pair.getTeamName();
            String memberName = pair.getMemberName();

            groupDataMap.computeIfAbsent(groupName, k -> new ArrayList<>()).add(memberName);
        }

        return groupDataMap;
    }
}
