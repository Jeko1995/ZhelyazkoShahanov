package Homeworks.Homework7;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("A name should not be empty.");
            System.exit(1);
        }
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public long getRating() {
        if (players.isEmpty()) {
            return 0; // Team rating is 0 if there are no players
        }

        double totalSkillLevel = 0;
        for (Player player : players) {
            totalSkillLevel += player.getSkillLevel();
        }

        double averageSkillLevel = totalSkillLevel / players.size();
        return Math.round(averageSkillLevel);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        Player playerToRemove = null;

        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                playerToRemove = player;
                break;
            }
        }

        if (playerToRemove != null) {
            players.remove(playerToRemove);
            System.out.println("Player " + playerName + " is not in " + name + " team.");
        }
    }

    public static void showTeamStats(Team team) {
        if (team == null) {
            System.out.println("Team does not exist.");
            return;
        }

        System.out.println("Team: " + team.getName());
        System.out.println("Rating: " + team.getRating());
    }
}
