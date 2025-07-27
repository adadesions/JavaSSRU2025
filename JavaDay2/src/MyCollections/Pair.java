package MyCollections;

public class Pair {
    private String teamName;
    private String memberName;

    public Pair(String teamName, String memberName) {
        this.teamName = teamName;
        this.memberName = memberName;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getMemberName() {
        return memberName;
    }
}
