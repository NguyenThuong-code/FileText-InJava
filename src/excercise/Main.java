package excercise;

public class Main {
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        System.out.println(read.readFile());
        WriteFile write = new WriteFile();
        write.writeFile(read.readFile());
    }
}
