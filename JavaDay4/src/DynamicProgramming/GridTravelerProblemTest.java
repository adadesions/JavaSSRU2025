package DynamicProgramming;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static DynamicProgramming.GridTravelerProblem.*;
import static org.junit.jupiter.api.Assertions.*;

public class GridTravelerProblemTest {
    @Test
    public void testGridTravelerProblem() {

       assertEquals(1, GridTravelerProblem.gridTraveler(1, 1));
       assertEquals(2, GridTravelerProblem.gridTraveler(2, 2));
       assertEquals(6, GridTravelerProblem.gridTraveler(3, 3));
       assertEquals(3, GridTravelerProblem.gridTraveler(3, 2));
       assertEquals(2333606220L , GridTravelerProblem.gridTraveler(18, 18));
    }

    @Test
    public void testGridPossiblePaths() {
        List<String> expected = List.of(
                "DDRR",
                "DRDR",
                "DRRD",
                "RDDR",
                "RDRD",
                "RRDD"
        );
        assertEquals(expected, GridTravelerProblem.gridTravelShowPaths(3, 3));
    }
}
