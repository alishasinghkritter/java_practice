import java.io.*;

public class Buff_ReaderWriter {
    public static void main(String[] args) throws IOException {
        FileWriter w = new FileWriter("hello");
        BufferedWriter bw = new BufferedWriter(w);
        bw.write("Welcome to kritter technoogy");
        bw.close();
        w.close();

        FileReader fr = new FileReader("hello");
        BufferedReader br = new BufferedReader(fr);
        try {

            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            br.close();
            fr.close();
        }

        InputStream s = new FileInputStream("hello");
        Reader r = new InputStreamReader(s);
        try {

            int d = r.read();
            while (d != -1) {
                System.out.print((char) d);
                d = r.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            r.close();
            s.close();
        }


    }
}
