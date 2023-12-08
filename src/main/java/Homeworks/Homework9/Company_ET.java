package Homeworks.Homework9;

public class Company_ET extends Company implements Invoice{

    private String ownerName;
    private double initialCapital;
    private double actualCapital;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(Double initialCapital) {
        this.initialCapital = initialCapital;
    }

    public Double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(Double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public Company_ET(String companyName, String registrationDate, String bulstat, String ownerName, double initialCapital, double actualCapital) {
        super(companyName, registrationDate, bulstat);
        setOwnerName(ownerName);
        setInitialCapital(initialCapital);
        setActualCapital(actualCapital);
    }

    public double Profit(){
        double profit = actualCapital - initialCapital;
        return profit;
    }

    @Override
    public void issueInvoice() {
        System.out.println("Invoice is created successfully!");
    }
}
