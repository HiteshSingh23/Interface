package interfaceconfig;

import java.io.*;

public class Filerws {

    String lines = "";

    public String readfromfile(String filepath) {
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);

            String currentline = "";
            String firstline = "";
            int count = 0;

            currentline = br.readLine();
            firstline = currentline;

            while (currentline != null) {
                lines += currentline + " \n";
                currentline = br.readLine();
                count++;
            }

            if (count == 1) lines = firstline;
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return lines;
    }
    public void writeToFile(String filewrcontents, String filepath) {
        try {
            FileWriter fw = new FileWriter(filepath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(filewrcontents);
            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
