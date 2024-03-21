import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Raccolta {
    
    ArrayList<Videogame> lista;

    public Raccolta(String filePath){
        File f = new File(filePath);
        lista = new ArrayList<>();
        try {
            Scanner fileRead = new Scanner(f);
            while (fileRead.hasNextLine()) {
                String[] fields = fileRead.nextLine().split(";");
                lista.add(new Videogame(fields[0], fields[1], Float.parseFloat(fields[2]), Integer.parseInt(fields[3])));
            }
            
            fileRead.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        String s = "Libreria:\n";
        for (int i = 0; i < lista.size(); i++) {
            s += lista.get(i) + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Raccolta lista = new Raccolta("A_Basic/videogames.csv");
        System.out.println(lista);
    }
}
