import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file= new java.io.File("C:/Users/Administrator/Documents/score.txt");
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }
        java.io.PrintWriter output= new  java.io.PrintWriter(file);
        output.print("Thuong ngu nhu bo");
        output.println(90);
        output.print("thuong la con bo");
        output.println(85);
        output.close();

    }
}
