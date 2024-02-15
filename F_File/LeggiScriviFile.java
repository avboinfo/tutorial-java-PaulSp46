package F_File;

import java.io.*;
import java.math.*;

public class LeggiScriviFile {

    public void ScriviFile(String filename){
        File f = new File(filename);
        try {
            PrintWriter pw = new PrintWriter(f);

            for (int i = 0; i < 10; i++) {
                pw.printf("%.2f;%.2f", (float)Math.random()*10, (float)Math.random()*10);
            }

            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("errore: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        System.out.printf("\nProgram Started\n");
        LeggiScriviFile lsf = new LeggiScriviFile();
        lsf.ScriviFile("F_File/LeggiScriviFile.txt");
    }
}
