package base;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataProviders {
    @DataProvider(name = "loginAndAddProductInCart")
    public  Object[][] getItems(){
        List<Object[]> combinedData = new ArrayList<>();
        try {
            CSVReader csvReaderUsers = new CSVReader(new FileReader("src/test/resources/validUsers.csv"));
            List<String[]> csvDataUsers = csvReaderUsers.readAll();

            for (String[] userData : csvDataUsers) {
                try {
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

    @DataProvider(name = "validUsers")
    public Object[][] readValidUsers() {
        try{
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/validUsers.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][2];

            for (int i = 0; i < csvData.size(); i++){
                csvDataObj[i] = csvData.get(i);
            }

            return csvDataObj;

        } catch (IOException e) {
            System.out.println(e);
            return null;

        } catch (CsvException e) {
            System.out.println(e);
            return null;
        }
    }

    @DataProvider(name = "invalidUsers")
    public Object[][] readInvalidUsers() {
        try{
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/invalidUsers.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][2];

            for (int i = 0; i < csvData.size(); i++){
                csvDataObj[i] = csvData.get(i);
            }

            return csvDataObj;

        } catch (IOException e) {
            System.out.println(e);
            return null;

        } catch (CsvException e) {
            System.out.println(e);
            return null;
        }
    }
    @DataProvider(name = "loginAndCheckoutProducts")
    public Object[][] checkoutItems() {
        List<Object[]> combinedData = new ArrayList<>();
        try {
            CSVReader csvReaderUsers = new CSVReader(new FileReader("src/test/resources/validUsers.csv"));
            List<String[]> csvDataUsers = csvReaderUsers.readAll();

            for (String[] userData : csvDataUsers) {
                List<String> productsForUser = new ArrayList<>();

                try {
                    CSVReader csvReaderProducts = new CSVReader(new FileReader("src/test/resources/products.csv"));
                    List<String[]> csvDataProducts = csvReaderProducts.readAll();

                    for (String[] productData : csvDataProducts) {
                        productsForUser.add(productData[0]);
                    }
                } catch (IOException | CsvException e) {
                    System.out.println(e);
                }

                Object[] combinedRow = new Object[3];
                combinedRow[0] = userData[0];
                combinedRow[1] = userData[1];
                combinedRow[2] = productsForUser;

                combinedData.add(combinedRow);
            }
        } catch (IOException | CsvException e) {
            System.out.println(e);
        }

        return combinedData.toArray(new Object[0][]);
    }
}
