package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GridTravelerProblem {

    private static final HashMap<String, Long> memo = new HashMap<>();
    private static final List<String> path = new ArrayList<>();

    public static long gridTraveler(int n, int m) {
        // n = row,  m = column
        String key = n + "," + m;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        // T (0, n) or T (m, 0) = 0
        if (n == 0 || m == 0) {
            return 0;
        }

        // T (1, 1) = 1
        if (n == 1 && m == 1) {
            return 1;
        }

        long fn = gridTraveler(n - 1, m) + gridTraveler(n, m - 1);
        memo.put(key, fn);

        return fn;
    }

    public static List<String> gridTravelShowPaths(int n, int m) {
        computePaths(n, m, 0, 0, "");
        return path;
    }

    public static void computePaths(int n, int m, int row, int col, String dir) {
        if (row >= n || col >= m) {
            return; // Out of bounds
        }

        if (row == n - 1 && col == m - 1) {
            System.out.println(dir);
            path.add(dir);
            return;
        }

        // Move Down
        computePaths(n, m, row + 1, col, dir + "D");

        // Move Right
        computePaths(n, m, row, col + 1, dir + "R");
    }
}
