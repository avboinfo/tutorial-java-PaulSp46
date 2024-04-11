import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mailbox {
    Lista<Email> ls;

    public Mailbox() {
        ls = new Lista<>();

        loadFromFile();
        
        ls.addHead(new Email("Mario Rossi", "Prova", "11-04-2024 12:53", "Questa è una prova"));
        ls.addHead(new Email("Luigi Bianchi", "Prova", "09-04-2024 13:53", "Questa è una prova"));
        ls.addHead(new Email("Luca Verdi", "Prova", "09-03-2024 09:24", "k"));    
    }

    public void loadFromFile(){
        File f = new File("data/load.txt");

        try {
            Scanner fileRead = new Scanner(f);
            String s = "";
            String[] fields;
            while (fileRead.hasNextLine()) {
                s = fileRead.nextLine();
                fields = s.split(";");
                ls.addHead(new Email(fields[0], fields[1], fields[2], fields[3]));
            }
            fileRead.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
                
    }

    public void newMail (Email nE){
        ls.addHead(nE);
        System.out.println("Email aggiunta");
    }

    public void removeEmailPos(int pos){
        if (ls.removePos(pos)) {
            System.out.println("Email rimossa con successo");   
        } else{
            System.out.println("Email non rimossa");
        }
    }

    public void emailSearchString(String s){
        Email temp = null;
        int counter = 0;
        String buffer = "";
        while (true) {
            temp = ls.getItemInPosition(counter);
            if (temp == null) {
                break;
            }
            if(temp.testo.contains(s)){
                buffer += "Email trovata alla posizione " + counter + "\n";
            }
            counter++;
        }
        System.out.println(buffer);
    }

    public void printLog(){
        try {
            FileWriter printFile = new FileWriter("data/log.txt", true);
            printFile.write(ls.toString());
            printFile.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return ls.toString();
    }
}
