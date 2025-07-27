package GameEventAnalysis;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CrossMatchPlayersTest {
    @Test
    public void testPlayersInBothEvent() {
        int numEventA = 5;
        int numEventB = 6;
        String[] playersList = {
                "Alice",
                "Bob",
                "Charlie",
                "Diana",
                "Eve",
                "Bob",
                "Charlie",
                "Frank",
                "George",
                "Eve",
                "Hannah"
        };

        CrossMatchPlayers crossMatchPlayers = new CrossMatchPlayers(numEventA, numEventB, playersList);

        String[] result = crossMatchPlayers.getPlayersInBothEvents();

        assertArrayEquals(new String[]{"Bob", "Charlie", "Eve"}, result);
    }

    @Test
    public void testPlayersInOneEvent() {
        int numEventA = 5;
        int numEventB = 6;
        String[] playersList = {
                "Alice",
                "Bob",
                "Charlie",
                "Diana",
                "Eve",
                "Bob",
                "Charlie",
                "Frank",
                "George",
                "Eve",
                "Hannah"
        };

        CrossMatchPlayers crossMatchPlayers = new CrossMatchPlayers(numEventA, numEventB, playersList);
        String[] result = crossMatchPlayers.getPlayersInOneEvent();
        assertArrayEquals(new String[]{"Alice", "Diana", "Frank", "George", "Hannah"}, result);
    }

    @Test
    public void testPlayersInAtLeastOneEvent() {
        int numEventA = 5;
        int numEventB = 6;
        String[] playersList = {
                "Alice",
                "Bob",
                "Charlie",
                "Diana",
                "Eve",
                "Bob",
                "Charlie",
                "Frank",
                "George",
                "Eve",
                "Hannah"
        };

        CrossMatchPlayers crossMatchPlayers = new CrossMatchPlayers(numEventA, numEventB, playersList);
        String[] result = crossMatchPlayers.getPlayersInAtLeastOneEvent();
        assertArrayEquals(new String[]{"Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "George", "Hannah"}, result);
    }

    @Test
    public void testSeparatePlayerNames() {
        int numEventA = 5;
        int numEventB = 6;
        String[] playersList = {
                "Alice",
                "Bob",
                "Charlie",
                "Diana",
                "Eve",
                "Bob",
                "Charlie",
                "Frank",
                "George",
                "Eve",
                "Hannah"
        };

        HashSet<String>[] expected = (HashSet<String>[]) new HashSet<?>[2];
        expected[0] = new HashSet<String>(Arrays.asList(
                "Alice",
                "Bob",
                "Charlie",
                "Diana",
                "Eve"));
        expected[1] = new HashSet<String>(Arrays.asList(
                "Bob",
                "Charlie",
                "Frank",
                "George",
                "Eve",
                "Hannah"));

        CrossMatchPlayers crossMatchPlayers = new CrossMatchPlayers(numEventA, numEventB, playersList);
        HashSet<String>[] result = crossMatchPlayers.separatePlayerNames();
        assertArrayEquals(expected, result);
    }
}
