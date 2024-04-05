public class Paziente {
    String nome, cognome, colore;

    public Paziente(String nome, String cognome, String colore) {
        this.nome = nome;
        this.cognome = cognome;
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return "Paziente [nome=" + nome + ", cognome=" + cognome + ", colore=" + colore + "]";
    }
}
