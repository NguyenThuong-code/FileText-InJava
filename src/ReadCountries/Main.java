package ReadCountries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
               BufferedReader reader= null;
        try {
            URL url = new URL("https://raw.githubusercontent.com/codegym-vn/apj-read-csv-file/develop/countries.csv");
            URLConnection conn = url.openConnection();
            InputStream stream = conn.getInputStream();
            InputStreamReader ir = new InputStreamReader(stream);
             reader = new BufferedReader(ir);
            String line;
            while ((line = reader.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            try {
                if (reader!=null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<String> parseCsvLine(String line) {
        List<String> result = new ArrayList<>();
        if (line != null) {
            String[] splitData = line.split(",");
            for (int i = 0; i < splitData.length; i++) {
            result.add(splitData[i]);
        }
    }
        return result;

}
    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}