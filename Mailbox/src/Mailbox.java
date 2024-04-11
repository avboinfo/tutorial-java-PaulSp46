public class Mailbox {
    Lista<Email> ls;

    public Mailbox() {
        ls = new Lista<>();
        
        ls.addTail(new Email("Mario Rossi", "Prova", "11-04-2024 12:53", "Questa è una prova"));
        ls.addTail(new Email("Luigi Bianchi", "Prova", "09-04-2024 13:53", "Questa è una prova"));
        ls.addTail(new Email("Luca Verdi", "Prova", "09-03-2024 09:24", "k"));    
    }

    @Override
    public String toString() {
        return ls.toString();
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
}
