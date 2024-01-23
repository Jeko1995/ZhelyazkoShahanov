package base;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataProviders {

     //Data provider for login and adding products to the cart.
     //Reads valid user data and product data from CSV files.
    @DataProvider(name = "loginAndAddProductInCart")
    public Object[][] getItems() {
        List<Object[]> combinedData = new ArrayList<>();
        try {
            // Read valid user data from CSV
            CSVReader csvReaderUsers = new CSVReader(new FileReader("src/test/resources/validUsers.csv"));
            List<String[]> csvDataUsers = csvReaderUsers.readAll();

            for (String[] userData : csvDataUsers) {
                try {
                    // Read product data from CSV
                    CSVReader csvReaderProducts = new CSVReader(new FileReader("src/test/resources/products.csv"));
                    List<String[]> csvDataProducts = csvReaderProducts.readAll();

                    for (String[] productData : csvDataProducts) {
                        Object[] combinedRow = new Object[3];
                        combinedRow[0] = userData[0];
                        combinedRow[1] = userData[1];
                        combinedRow[2] = productData[0];
                        combinedData.add(combinedRow);
                    }
                } catch (IOException | CsvException e) {
                    System.out.println(e);
                }
            }
        } catch (IOException | CsvException e) {
            System.out.println(e);
        }

        return combinedData.toArray(new Object[0][]);
    }

     //Data provider for valid user data.
    @DataProvider(name = "validUsers")
    public Object[][] readValidUsers() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/validUsers.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][2];

            for (int i = 0; i < csvData.size(); i++) {
                csvDataObj[i] = csvData.get(i);
            }

            return csvDataObj;

        } catch (IOException | CsvException e) {
            System.out.println(e);
            return null;
        }
    }

     //Data provider for invalid user data.
    @DataProvider(name = "invalidUsers")
    public Object[][] readInvalidUsers() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/invalidUsers.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][2];

            for (int i = 0; i < csvData.size(); i++) {
                csvDataObj[i] = csvData.get(i);
            }

            return csvDataObj;

        } catch (IOException | CsvException e) {
            System.out.println(e);
            return null;
        }
    }

     //Data provider for login and checkout products.
     //Reads valid user data, product data, and additional data from CSV files.
    @DataProvider(name = "loginAndCheckoutProducts")
    public Object[][] checkoutItems() {
        List<Object[]> combinedData = new ArrayList<>();
        try {
            // Read valid user data from CSV
            CSVReader csvReaderUsers = new CSVReader(new FileReader("src/test/resources/validUsers.csv"));
            List<String[]> csvDataUsers = csvReaderUsers.readAll();

            // Read product data from CSV
            CSVReader csvReaderProducts = new CSVReader(new FileReader("src/test/resources/products.csv"));
            List<String[]> csvDataProducts = csvReaderProducts.readAll();

            // Read additional data from CSV
            CSVReader csvReaderAdditionalData = new CSVReader(new FileReader("src/test/resources/checkoutAdditionalUserData.csv"));
            List<String[]> csvDataAdditionalData = csvReaderAdditionalData.readAll();

            for (String[] userData : csvDataUsers) {
                List<String> productsForUser = new ArrayList<>();

                for (String[] productData : csvDataProducts) {
                    productsForUser.add(productData[0]);
                }

                String[] additionalData = csvDataAdditionalData.get(0);

                Object[] combinedRow = new Object[6];
                combinedRow[0] = userData[0];       // UserName
                combinedRow[1] = userData[1];       // Password
                combinedRow[2] = productsForUser;   // Product
                combinedRow[3] = additionalData[0]; // FirstName
                combinedRow[4] = additionalData[1]; // LastName
                combinedRow[5] = additionalData[2]; // PostalCode

                combinedData.add(combinedRow);
            }
        } catch (IOException | CsvException e) {
            System.out.println(e);
        }

        return combinedData.toArray(new Object[0][]);
    }

     //Data provider for problem user data.
    @DataProvider(name = "problemUsers")
    public Object[][] readSlowUsers() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/problemUsers.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][2];

            for (int i = 0; i < csvData.size(); i++) {
                csvDataObj[i] = csvData.get(i);
            }

            return csvDataObj;

        } catch (IOException | CsvException e) {
            System.out.println(e);
            return null;
        }
    }
}
