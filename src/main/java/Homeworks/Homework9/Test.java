package Homeworks.Homework9;

public class Test {
    public static void main(String[] args) {
        Company_ET novaFirma = new Company_ET("novaFirma", "01.01.1986", "1234567890",
                "Ivan Ivanov", 2.00, 10000.00);

        double profit = novaFirma.Profit();
        System.out.println("Profit of the company is " + profit);

        novaFirma.issueInvoice();
    }
}
