package excercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> readFile() {
        List<String> str = new ArrayList<>();
        try {
            File file = new File("C:/Users/Administrator/Documents/score.txt");
            if (!file.exists()) {
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                str.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

