package Homeworks.Homework7;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.name = name;
        setStat("Endurance", endurance);
        setStat("Sprint", sprint);
        setStat("Dribble", dribble);
        setStat("Passing", passing);
        setStat("Shooting", shooting);
    }

    public String getName() {
        return name;
    }

    public double getSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.0;
    }

    private void setStat(String statName, int value) {
        if (value < 0 || value > 100) {
            System.out.println(statName + " should be between 0 and 100.");
            //System.exit(1); // Terminate the program in case of invalid input
        }

        switch (statName) {
            case "Endurance":
                this.endurance = value;
                break;
            case "Sprint":
                this.sprint = value;
                break;
            case "Dribble":
                this.dribble = value;
                break;
            case "Passing":
                this.passing = value;
                break;
            case "Shooting":
                this.shooting = value;
                break;
            default:
                System.out.println("Invalid stat name.");
                System.exit(1);
        }
    }
}