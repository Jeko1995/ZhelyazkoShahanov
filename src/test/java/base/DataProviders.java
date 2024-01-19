package base;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataProviders {
    @DataProvider(name = "items list")
    public  Object[][] getItems(){
        return new Object[][]{
                {"backpack"},
                {"bolt-t-shirt"},
                {"bike-light"}
        };
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
}
