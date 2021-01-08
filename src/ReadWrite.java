import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        String str = "New file is created and will be manipulated using filereader and filewriter";
        FileWriter fw = new FileWriter("file.txt");
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        fw.close();
        try {
            FileReader fr = new FileReader("file.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
