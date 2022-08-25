import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String args[]) {
        int a[] = {2, 3, 4, 5, 7};
        try {
            FileOutputStream fount = new FileOutputStream(args[0]);
            DataOutputStream dount = new DataOutputStream(fount);
            for (int i = 0; i < a.length; i++)
                dount.writeInt(a[i]);
                dount.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }

