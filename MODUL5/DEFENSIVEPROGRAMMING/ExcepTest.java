import java.io.*;

public class ExcepTest {
    public static void main(String args[]) {

        try {
            int a[] = new int[2];
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");


        try {
            File fileName = new File("Text.txt");
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            file.close();
        } catch (FileNotFoundException f) {  
            f.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}