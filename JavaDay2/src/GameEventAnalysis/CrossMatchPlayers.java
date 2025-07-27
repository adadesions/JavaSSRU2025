package GameEventAnalysis;

import java.util.Arrays;
import java.util.HashSet;

public class CrossMatchPlayers {
    private final String[] playersList;
    private final int numEventA;
    private final int numEventB;
    private final HashSet<String> setA;
    private final HashSet<String> setB;

    public CrossMatchPlayers(int numEventA, int numEventB, String[] playersList) {
        this.playersList = playersList;
        this.numEventA = numEventA;
        this.numEventB = numEventB;

        HashSet<String>[] sepPlayersList = separatePlayerNames();
        this.setA = sepPlayersList[0];
        this.setB = sepPlayersList[1];
    }

    public String[] getPlayersInBothEvents() { //Create By MuuuLoveCode
        HashSet<String> tempSetA = new HashSet<>(setA);
        HashSet<String> tempSetB = new HashSet<>(setB);

        tempSetA.retainAll(tempSetB);

        return tempSetA.stream().sorted().toArray(String[]::new);
    }

    public String[] getPlayersInOneEvent() { // MaiiLoveCode
        String[] unionStr = getPlayersInAtLeastOneEvent();
        HashSet<String> union = new HashSet<>(Arrays.asList(unionStr));

        String[] bothStr = getPlayersInBothEvents();
        HashSet<String> both = new HashSet<>(Arrays.asList(bothStr));

        union.removeAll(both);
        System.out.println(union);

        return union.stream().sorted().toArray(String[]::new);
    }

    public String[] getPlayersInAtLeastOneEvent() { // Create By  โค้ด
        HashSet<String> tempSetA = new HashSet<>(setA);
        HashSet<String> tempSetB = new HashSet<>(setB);

        tempSetA.addAll(tempSetB);
        return tempSetA.stream().sorted().toArray(String[]::new);
    }

    public HashSet<String>[] separatePlayerNames() {
        HashSet<String>[] sepPlayersList = (HashSet<String>[]) new HashSet<?>[2];
        sepPlayersList[0] = new HashSet<>();
        sepPlayersList[1] = new HashSet<>();

        for (int i = 0; i < numEventA; i++){
            sepPlayersList[0].add(playersList[i]);
        }

        for (int i = numEventA; i < numEventA + numEventB; i++) {
            sepPlayersList[1].add(playersList[i]);
        }

        return sepPlayersList;
    }
}

