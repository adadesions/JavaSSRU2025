package MapProblems;

import MyCollections.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupDataProblemTest {
    @Test
    public void testGroupData() {
        List<List<String>> InputData = new ArrayList<>();
        InputData.add(new ArrayList<>(List.of("TeamA", "Alice")));
        InputData.add(new ArrayList<>(List.of("TeamB", "Bob")));
        InputData.add(new ArrayList<>(List.of("TeamA", "Eve")));
        InputData.add(new ArrayList<>(List.of("TeamB", "Ada")));
        InputData.add(new ArrayList<>(List.of("TeamC", "Peter")));

        HashMap<String, List<String>> expectedGroupData = new HashMap<>();
        expectedGroupData.put("TeamA", new ArrayList<>(List.of("Alice", "Eve")));
        expectedGroupData.put("TeamB", new ArrayList<>(List.of("Bob", "Ada")));
        expectedGroupData.put("TeamC", new ArrayList<>(List.of("Peter")));

        HashMap<String, List<String>> actualGroupData = GroupDataProblem.groupData(InputData);
        assertEquals(expectedGroupData, actualGroupData, "Grouped data does not match expected output");
    }

    @Test
    public void testGroupDataWithPair() {
        List<Pair> InputData = new ArrayList<>();
        InputData.add(new Pair("TeamA", "Alice"));
        InputData.add(new Pair("TeamB", "Bob"));
        InputData.add(new Pair("TeamA", "Eve"));
        InputData.add(new Pair("TeamB", "Ada"));
        InputData.add(new Pair("TeamC", "Peter"));

        HashMap<String, List<String>> expected = new HashMap<>();
        expected.put("TeamA", new ArrayList<>(List.of("Alice", "Eve")));
        expected.put("TeamB", new ArrayList<>(List.of("Bob", "Ada")));
        expected.put("TeamC", new ArrayList<>(List.of("Peter")));

        HashMap<String, List<String>> actualGroupData = GroupDataProblem.solveGroupDataWithPair(InputData);
        assertEquals(expected, actualGroupData, "Grouped data does not match expected output");

    }
}