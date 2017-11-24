package proxy;

import java.io.*;
import java.nio.file.*;

public class General {
    public static void main(String[] args){
        General d = new Majior();
        try {
            d.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            d.flush("/tmp/foo","Nothing here" );
        } catch (IOException e) {
            e.printStackTrace();
        }
        d.erase();


    }
    public void read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }
    }

    public void flush(String canonicalFilename, String text)
        throws IOException
        {
            File file = new File (canonicalFilename);
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write(text);
            out.close();
        }

    public void erase() {
        Path path = Paths.get("/tmp/foo");
        try {
            Files.delete(path);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", path);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }
    }
}
