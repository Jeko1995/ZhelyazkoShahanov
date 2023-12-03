package Homeworks.Homework7;
/*
A football team has variable number of players, a name and a rating.
A player has a name and stats which are the basis for his skill level. The stats a player has are endurance, sprint,
 dribble, passing and shooting. Each stat can be in the range [0..100]. The overall skill level of a player is
  calculated as the average of his stats. Only the name of a player and his stats should be visible to all of the
   outside world. Everything else should be hidden.
A team should expose (term for giving an access where access would not otherwise be available) a name, a rating
(calculated by the average skill level of all players in the team) and methods for adding and removing players.
Model the team and the players following the proper principles of Encapsulation. Expose only the properties that needs
 to be visible and validate data appropriately.
 */
public class Test {
    public static void main(String[] args) {
        Team barcelona = new Team("Barcelona");
        Player messi = new Player("Lionel_Messi", 75, 85, 84, 92, 67);
        Player gerard = new Player("Gerard_Pique", 195, 82, 82, 89, 68);

        barcelona.addPlayer(messi);
        barcelona.addPlayer(gerard);
        barcelona.removePlayer(gerard.getName());
        Team.showTeamStats(barcelona);

        System.out.println("----------------------");

        barcelona.addPlayer(messi);
        barcelona.addPlayer(gerard);
        barcelona.removePlayer(gerard.getName());
        Team.showTeamStats(barcelona);

        System.out.println("----------------------");

        Team.showTeamStats(barcelona);
    }
}

