package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public  List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter write = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter=new BufferedWriter(write);
            bufferedWriter.write("The largest value is: " +max);
            bufferedWriter.close();;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  int findMax(List<Integer> numbers){
        int max= numbers.get(0);
        for (int i=0; i< numbers.size();i++){
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile= new ReadAndWriteFile();
        List<Integer> numbers= readAndWriteFile.readFile("C:/Users/Administrator/Documents/score.txt");
        int maxValue= findMax(numbers);
        readAndWriteFile.writeFile("C:/Users/Administrator/Documents/max.txt",maxValue);
    }
}
