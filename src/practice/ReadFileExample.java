package practice;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){

            try {
                File file=new File(filePath);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                BufferedReader br=new BufferedReader(new FileReader(file));
                String line="";
                int sum= 0;
                while ((line=br.readLine())!=null){
                    System.out.println(line);
                    sum+=Integer.parseInt(line);
                }
                br.close();
                System.out.println("Sum = "+sum);
            } catch (IOException e) {
                e.printStackTrace();
        }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
    }

    public static void main(String[] args) {
        System.out.println("Enter the link of file: ");
        Scanner sc= new Scanner(System.in);
        String path= sc.nextLine();

        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
