package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThunderExpressProblem {
    public static int minContainers(int[] containers, int shipmentWeight) {
        if (shipmentWeight == 0) return 0;

        int[] table = new int[shipmentWeight + 1];
        Arrays.fill(table, shipmentWeight + 1);
        table[0] = 0;

        int[] conTable = new int[shipmentWeight + 1];
        Arrays.fill(conTable, -1);

        for (int container : containers) {
            for (int i = container; i <= shipmentWeight; i++) {
                if (table[i - container] + 1 < table[i]) {
                    table[i] = table[i - container] + 1;
                    conTable[i] = container; // Store the last used container
                }
            }
        }
        
        // Impossible case
        if (table[shipmentWeight] > shipmentWeight) {
            return -1;
        }

        // To print the containers used
        System.out.println("Minimum containers needed: " + table[shipmentWeight]);
        System.out.println("Containers used: ");

        int usedWeight = shipmentWeight;
        List<Integer> usedContainers = new ArrayList<>();

        while (usedWeight > 0) {
            usedContainers.add(conTable[usedWeight]);
            usedWeight -= conTable[usedWeight];
        }

        System.out.println(usedContainers);

        return table[shipmentWeight];
    }
}
