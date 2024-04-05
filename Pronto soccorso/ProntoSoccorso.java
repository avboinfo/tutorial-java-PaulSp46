public class ProntoSoccorso {
    Lista<Paziente> ps;

    public ProntoSoccorso() {
        ps = new Lista<>();
        loadFromFile();
    }
    
    private void loadFromFile(){
        //per il momento
        ps.addTail(new Paziente("Mario", "Rossi", "white"));
        ps.addTail(new Paziente("Maria", "Rossi", "white"));
    }

    @Override
    public String toString() {
        return ps.toString();
    }
}
