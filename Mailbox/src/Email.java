public class Email {
    String mittente;
    String oggetto;
    String data_ora;
    String testo;
    
    public Email(String mittente, String oggetto, String data_ora, String testo) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.data_ora = data_ora;
        this.testo = testo;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getData_ora() {
        return data_ora;
    }

    public void setData_ora(String data_ora) {
        this.data_ora = data_ora;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Email [mittente=" + mittente + ", oggetto=" + oggetto + ", data_ora=" + data_ora + ", testo=" + testo + "]";
    }    
}
