
package backend;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileWorker {

    public static void WriteToFile(String string) throws Exception {
        FileWriter writer = new FileWriter("ResultLottery.txt", true);
        writer.write(string + '\n');
        writer.close();
    }

    public static void ReadFromFile() throws Exception {
        BufferedReader read = new BufferedReader(new FileReader("ResultLottery.txt"));
        while (read.read() != -1) {
            System.out.println(read.readLine());
        }
        read.close();
    }

}
