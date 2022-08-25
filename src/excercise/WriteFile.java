package excercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public void writeFile( List<String> str){
        try {
            FileWriter write = new FileWriter("C:/Users/Administrator/Documents/max.txt", true);
            BufferedWriter bufferedWriter=new BufferedWriter(write);

            bufferedWriter.write(String.valueOf(str));
            bufferedWriter.close();;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
