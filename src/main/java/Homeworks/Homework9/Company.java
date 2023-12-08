package Homeworks.Homework9;

public class Company {
    private String companyName;
    private String registrationDate;
    private String bulstat;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("Error: Invalid entry for bulstat!");
        }
    }
    public Company(String companyName, String registrationDate, String bulstat){
        setCompanyName(companyName);
        setRegistrationDate(registrationDate);
        setBulstat(bulstat);
    }
}
