import java.io.File;

public class ObjectFile {
        public static void main(String[] args) {
                File f = new File("C:/Users/Administrator/Documents/score.txt");
                File dir = new File("Books");
                dir.mkdir();
                if (dir.isDirectory()) {
                        String[] dirContents = dir.list();
                        for (int i = 0; i < dirContents.length; i++) {
                                System.out.println(dirContents[i]);
                        }
                        System.out.println(dir.getAbsolutePath());

                }
                boolean isDeleted= dir.delete();
        }
}
